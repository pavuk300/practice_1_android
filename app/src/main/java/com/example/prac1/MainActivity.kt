package com.example.prac1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.prac1.ui.theme.Prac1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Prac1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String?, modifier: Modifier = Modifier) {
    Surface(color = Color.Yellow) {
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center)
        {
            Text(
                text = if (name != null) "Hello $name!" else "Имя не задано",
                modifier = modifier,
                fontSize = 36.sp
            )
        }
    }
}

@Preview(showBackground = true,
    name = "Portrait",
    showSystemUi = true)
@Preview(showBackground = true,
    name = "landscape",
    showSystemUi = true,
    device = "spec:orientation=landscape,width=411dp,height=891dp"
)
@Preview(showBackground = true,
    name = "round",
    showSystemUi = true,
    device = "spec:width=200dp,height=200dp,isRound=true",
    )
@Composable
fun GreetingPreview() {
    Prac1Theme {
        Greeting("android")
    }
}