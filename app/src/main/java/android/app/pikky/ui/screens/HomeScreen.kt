package android.app.pikky.ui.screens

import android.app.pikky.ui.components.TopBar
import android.app.pikky.ui.theme.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar({}) },
        containerColor = Color.Gray60
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
        ) {
            Column (
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    color = Color.primaryTextColor,
                    text = "Separate list item with a coma or on a separate line. Items can be numbers, names, email addresses, etc. A maximum of 10,000 items are allowed.",
                    textAlign = TextAlign.Justify,
                    fontFamily = FontFamily.Monospace
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}