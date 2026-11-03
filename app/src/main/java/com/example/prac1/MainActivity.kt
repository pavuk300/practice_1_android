package com.example.prac1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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


//@Preview(showBackground = true,
//    name = "Portrait",
//    showSystemUi = true)
//@Preview(showBackground = true,
//    name = "landscape",
//    showSystemUi = true,
//    device = "spec:orientation=landscape,width=411dp,height=891dp"
//)
//@Preview(showBackground = true,
//    name = "round",
//    showSystemUi = true,
//    device = "spec:width=200dp,height=200dp,isRound=true"
//)
//@Preview(showBackground = true,
//    name = "text",
//    showSystemUi = true,
//    device = "spec:orientation=landscape,width=411dp,height=891dp"
//)
//@Composable
//fun GreetingPreview() {
//    Prac1Theme {
//        Greeting("android")
//    }
//}


@Composable
fun TextTypes(modifier: Modifier = Modifier) {
    Surface() {
        Column() {
            Text(
                text = stringResource(R.string.jetpack),
                modifier = modifier,
                fontSize = 16.sp,
                color = Color.Green,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.Center
            )
            Text(
                text = stringResource(R.string.jetpack),
                modifier = modifier,
                fontSize = 16.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = stringResource(R.string.jetpack),
                modifier = Modifier.background(color = Color.Green),
                fontSize = 24.sp,
                style = TextStyle(
                    textIndent = TextIndent(firstLine = 48.sp),
                ),
                textDecoration = TextDecoration.Underline
            )
        }
    }
}

//@Preview(showBackground = true,
//    name = "texts"
//)
//@Composable
//fun TextTypesPreview() {
//    Prac1Theme {
//        TextTypes()
//    }
//}


@Composable
fun MyButton(modifier: Modifier = Modifier) {
    Button( modifier = Modifier.fillMaxWidth(),
        colors = ButtonColors(Color.LightGray,
            Color.Black,
            Color.White,
            Color.Magenta),
        border = BorderStroke(2.dp, Color.Gray),
        shape = RoundedCornerShape(16.dp),
        onClick = {},
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 4.dp
        )
    ) {
        Text("Нажми на меня")
    }
}


//@Preview(showBackground = true,
//    name = "button",
//    showSystemUi = true)
//@Composable
//fun ButtonPreview() {
//    Prac1Theme() {
//        MyButton()
//    }
//}


@Composable
fun MyCircle(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxWidth()
        .height(100.dp)
        .background(Color.LightGray).padding(16.dp),
        contentAlignment = Alignment.Center) {
            Box(modifier = Modifier.fillMaxHeight().aspectRatio(1f)
                .background(Color.Red, shape = CircleShape),
                contentAlignment = Alignment.Center) {
                Text(text = "ЕВ")
        }
    }
}


//@Preview(showBackground = true,
//    name = "circle",
//    showSystemUi = true)
//@Composable
//fun CirclePreview() {
//    Prac1Theme() {
//        MyCircle()
//    }
//}


@Composable
fun CircleInRec() {
    Column() {
        Box(modifier = Modifier.width(240.dp).height(120.dp)
            .background(Color.Black)) {
            Image(painter = painterResource(R.drawable.circle),
                contentDescription = "aaa",
                modifier = Modifier.align (Alignment.TopEnd))
        }
        Box(modifier = Modifier.width(240.dp).height(10.dp))
        Box(modifier = Modifier.width(240.dp).height(120.dp)
            .background(Color.Blue)) {
            Image(painter = painterResource(R.drawable.circle),
                contentDescription = "aaa",
                modifier = Modifier.fillMaxSize(),
                colorFilter = ColorFilter.tint(Color.Magenta),
                contentScale = ContentScale.FillBounds)
        }
    }
}


@Preview(showBackground = true,
    name = "circle",
    showSystemUi = true)
@Composable
fun CircleInRecPreview() {
    Prac1Theme() {
        CircleInRec()
    }
}