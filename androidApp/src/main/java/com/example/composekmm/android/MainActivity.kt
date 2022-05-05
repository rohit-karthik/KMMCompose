package com.example.composekmm.android

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.composekmm.Greeting
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composekmm.android.ui.theme.ComposeKMMTheme

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent { 1
            ComposeKMMTheme {
                MyMainComposable("Android")
            }
        }
    }
}

@Composable
fun MyMainComposable(name: String) {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Row(modifier = Modifier.padding(10.dp)) {
            Image(
                painter = painterResource(R.drawable.dice_6),
                contentDescription = "Dice Image",
                modifier = Modifier
                    .size(70.dp)
            )
            Column {
                Text("Hello $name!", fontSize = 30.sp)
                Row {
                    Text(
                        "Hello Second!",
                        modifier = Modifier.padding(10.dp)
                    )
                    Text(
                        "Hello third!",
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    name = "Light Mode"
)
@Composable
fun PreviewMyMainComposable() {
    ComposeKMMTheme {
        MyMainComposable("Android")
    }
}

@Preview(
    showBackground = true,
    name = "Dark Mode"
)
@Composable
fun DarkModePreviewMyMainComposable() {
    ComposeKMMTheme(darkTheme = true) {
        MyMainComposable("Android")
    }
}