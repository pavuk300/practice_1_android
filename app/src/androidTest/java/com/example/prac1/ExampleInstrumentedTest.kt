package com.example.prac1

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class WaterTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun checkWaterButton() {
        composeTestRule.setContent {
            WaterTracker()
        }

        composeTestRule.onNodeWithText("+250 мл").assertExists()
        composeTestRule.onNodeWithText("+250 мл").performClick()
        composeTestRule.onNodeWithText("250").assertExists()
    }

    @Test
    fun checkDayButton() {
        composeTestRule.setContent {
            WaterTracker()
        }

        composeTestRule.onNodeWithText("Завершить день").assertExists()
        composeTestRule.onNodeWithText("Завершить день").performClick()
        composeTestRule.onNodeWithText("0").assertExists()
    }

    @Test
    fun checkStreak() {
        composeTestRule.setContent {
            WaterTracker()
        }

        for(i in 1..6) {
            composeTestRule.onNodeWithText("+250 мл").performClick()
        }
        composeTestRule.onNodeWithText("Завершить день").performClick()
        composeTestRule.onNodeWithText("Дней подряд: 1").assertExists()
    }
}