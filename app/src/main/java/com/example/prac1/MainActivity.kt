package com.example.prac1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prac1.ui.theme.Prac1Theme
import kotlin.random.Random

//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            Prac1Theme {
//                WaterTracker()
//            }
//        }
//    }
//}

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
fun MyButton() {
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
fun MyCircle() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .background(Color.LightGray)
        .padding(16.dp),
        contentAlignment = Alignment.Center) {
            Box(modifier = Modifier
                .fillMaxHeight()
                .aspectRatio(1f)
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
        Box(modifier = Modifier
            .width(240.dp)
            .height(120.dp)
            .background(Color.Black)) {
            Image(painter = painterResource(R.drawable.circle),
                contentDescription = "aaa",
                modifier = Modifier.align (Alignment.TopEnd))
        }
        Box(modifier = Modifier
            .width(240.dp)
            .height(10.dp))
        Box(modifier = Modifier
            .width(240.dp)
            .height(120.dp)
            .background(Color.Blue)) {
            Image(painter = painterResource(R.drawable.circle),
                contentDescription = "aaa",
                modifier = Modifier.fillMaxSize(),
                colorFilter = ColorFilter.tint(Color.Magenta),
                contentScale = ContentScale.FillBounds)
        }
    }
}

//
//@Preview(showBackground = true,
//    name = "circle",
//    showSystemUi = true)
//@Composable
//fun CircleInRecPreview() {
//    Prac1Theme() {
//        CircleInRec()
//    }
//}


@Composable
fun ElementInColumn(text : String) {
    Row (modifier = Modifier.background(Color.LightGray).fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        ) {
        Box (modifier = Modifier.widthIn(min = 300.dp)
                .padding(6.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                textAlign = TextAlign.Center
            )
        }
        Box {
        Image(painter = painterResource(R.drawable.circle), contentDescription = null)
        }
    }
}

@Composable
fun BasicTextColumn() {
    Column(verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.padding(10.dp, 0.dp)) {
        ElementInColumn("""
                Имя: Евгений
                Отчетство: Викторович
                Фамилия: Аникин
                Мобильный телефон: +7 ХХХ ХХХ ХХ-ХХ
                Адрес: Проспект Ленина, д. 22
                """.trimIndent())
        ElementInColumn("""
                Имя: Арсений
                Отчетство: Анатальевич
                Фамилия: Васкин
                Мобильный телефон: +7 123 456 78-90
                Адрес: -
                """.trimIndent())
        ElementInColumn("""
                Имя: Василий
                Отчетство: Владленович
                Фамилия: Бередин
                Мобильный телефон: +7 098 765 43-21
                Адрес: -
                """.trimIndent())
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar() {
    TopAppBar(
        title = {
            Text("No Title")
        }
    )
}

//@Preview(showBackground = true,
//    showSystemUi = true)
//@Composable
//fun BasicTextColumnPreview() {
//    Scaffold(
//        topBar = {
//            MyTopBar()
//        }
//    ) { innerPadding ->
//        Box(
//            modifier = Modifier.padding(innerPadding)
//        ) {
//            BasicTextColumn()
//        }
//    }
//}

@Composable
fun WaterTracker() {
    var waterCount by remember { mutableIntStateOf(0) }
    var dayCount by remember { mutableIntStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(
            text = "Трекер воды",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue
        )

        Spacer(modifier = Modifier.height(48.dp))

        Text(
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            text = waterCount.toString())

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { waterCount += 250 }
        ) {
            Text(
                text = "+250 мл",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        Button(
            onClick = {
                if (waterCount >= 1500)
                    dayCount += 1
                else
                    dayCount = 0
                waterCount = 0
            }
        ) {
            Text(
                text = "Завершить день",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            text = "Дней подряд: $dayCount"
        )
    }
}


//@Preview(showBackground = true,
//    showSystemUi = true)
//@Composable
//fun BasicTextColumnPreview() {
//    Scaffold(
//        topBar = {
//            MyTopBar()
//        }
//    ) { innerPadding ->
//        Box(
//            modifier = Modifier.padding(innerPadding)
//        ) {
//            WaterTracker()
//        }
//    }
//}


data class Product(
    val id: Int,
    val name: String,
    val price: Int
)
class MainActivity : ComponentActivity() {
    private var totalSum = 0
    private var productSize = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShoppingCartScreen()
        }
    }
    @Composable
    fun ShoppingCartScreen() {
        var products by remember {
            mutableStateOf(
                listOf(
                    Product(0, "Товар #1", 100),
                    Product(1, "Товар #2", 150),
                    Product(2, "Товар #3", 56)
                )
            )
        }
        Column {
            totalSum = 0
            productSize = 0
            for (product in products) {
                Text(text = product.name + " - " + product.price + " рублей")
                totalSum += product.price
                productSize++
            }
            // Если сумма заказа больше 500, то показываем сообщение о бесплатной доставке
            if (totalSum > 500) {
                Toast.makeText(LocalContext.current, "Доставка бесплатная!", Toast.LENGTH_SHORT).show()
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Товаров на сумму: $totalSum рублей")
            AddProductSection {
                val price = Random.nextInt(0, 100)
                products = products + Product(
                    id = products.size,
                    name = "Товар #${products.size + 1}",
                    price = price
                )
            }
            if (productSize > 0)
                RemoveProductSection {
                    totalSum -= products.last().price
                    products = products.dropLast(1)
                    productSize--
                }
        }
    }
    @Composable
    fun AddProductSection(onAdd: () -> Unit) {
        Button(onClick = onAdd) {
            Text(text = "Добавить товар")
        }
    }
    @Composable
    fun RemoveProductSection(
        onRemove: () -> Unit
    ) {
        if (productSize > 0) {
            Button(onClick = onRemove) {
                Text(text = "Удалить товар")
            }
        }
    }
}
