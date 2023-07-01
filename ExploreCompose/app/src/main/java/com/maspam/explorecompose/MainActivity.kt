package com.maspam.explorecompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.maspam.explorecompose.ui.theme.ExploreComposeTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExploreComposeTheme {
                MyApp(Modifier.fillMaxSize(), mylist)
            }
        }
    }
}

val mylist = listOf<String>("World", "Composer")

@Composable
fun MyApp(modifier: Modifier = Modifier, item: List<String>) {
    Column() {
        for (i in item) {
            Greeting(name = i)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(
            modifier = Modifier.padding(24.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(1f)
            ) {
                Text("Hello, ")
                Text(name)
            }
            Button(onClick = { /*TODO*/ }, modifier = Modifier.background(Color.Black)) {
                Text(text = "Show more")
            }
        }
    }
}


@Preview(name = "Light Mode")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark Mode")
@Composable
fun DefaultPreview() {
    ExploreComposeTheme {
        MyApp(item = mylist)
    }
}