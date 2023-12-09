package com.example.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
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
					AuthorMessage(authorInfo = Message(R.drawable.ic_launcher_foreground,"Ana", "É sobre isso, tudo bem"))
				}
			}
		}
	}
}

data class Message(val image: Int, val author: String, val message: String)

@Composable
fun AuthorMessage(authorInfo: Message) {
	Row {
		Image(
				painter = painterResource(id = authorInfo.image),
				contentDescription = "Android",
				colorFilter = ColorFilter.tint(Color.Blue),
				modifier = Modifier
					.size(40.dp)
					.clip(CircleShape)
					.background(Color(R.color.black))
					.align(CenterVertically)
		)

		Spacer(modifier = Modifier.width(8.dp))

		Column {
			Text(text = authorInfo.author)
			Text(text = authorInfo.message)
		}
	}
}

@Preview(showBackground = true)
@Composable
fun AuthorMessagePreview() {
	AluveryTheme {
		Row {
			AuthorMessage(
					authorInfo = Message(
							image = R.drawable.ic_launcher_foreground,
							author = "Ana",
							message = "Conheça e domine todas as técnicas, mas na hora de lidar com uma alma humana, seja apenas outra alma humana"))
		}
	}
}