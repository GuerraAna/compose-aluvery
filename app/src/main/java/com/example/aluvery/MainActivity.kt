package com.example.aluvery

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			AluveryTheme {
				// A surface container using the 'background' color from the theme
				Surface(
						modifier = Modifier.fillMaxSize(),
						color = MaterialTheme.colorScheme.background
				) {
					Greeting("Android")
				}
			}
		}
	}
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
	Text(
			text = "Hello $name!",
			modifier = modifier
	)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
	AluveryTheme {
		Column {
			Text(text = "BALELA")
			Box {
				Row(
						modifier = Modifier.padding(horizontal = 20.dp, vertical = 20.dp)
				) {
					Column {
						Greeting("And1")
						Greeting("And1")
						Greeting("And1")
						Greeting("And1")
					}
					Column(
							modifier = Modifier.padding(start = 10.dp)
					) {
						Greeting("And1'")
						Greeting("And1'")
						Greeting("And1'")
					}
				}
			}

			Box {
				Row(
						modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp)
				) {
					Column {
						Greeting("And2")
						Greeting("And2")
						Greeting("And2")
					}
					Column(
							modifier = Modifier.padding(start = 10.dp)
					) {
						Greeting("And2'")
						Greeting("And2'")
					}
				}
			}
		}
	}
}