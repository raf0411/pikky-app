package android.app.pikky.ui.screens

import android.app.pikky.R
import android.app.pikky.ui.components.CustomButton
import android.app.pikky.ui.components.FileUploadButton
import android.app.pikky.ui.components.ListTextField
import android.app.pikky.ui.components.TopBar
import android.app.pikky.ui.theme.Color
import android.app.pikky.ui.theme.CustomFontFamily
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.io.File

@Composable
fun HomeScreen() {
    val listField by remember { mutableStateOf(TextFieldValue) }
    val scrollState = rememberScrollState()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar({}) },
        containerColor = Color.Gray60
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(scrollState)
        ) {
            Column (
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Text(
                    modifier = Modifier.padding(vertical = 24.dp),
                    color = Color.primaryTextColor,
                    text = "Separate list item with a coma or on a separate line. Items can be numbers, names, email addresses, etc. A maximum of 10,000 items are allowed.",
                    textAlign = TextAlign.Justify,
                    fontFamily = FontFamily.Monospace
                )

                Spacer(Modifier.height(16.dp))

                ListTextField()

                Spacer(Modifier.height(24.dp))

                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "or",
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp
                )

                Spacer(Modifier.height(24.dp))

                Column (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    FileUploadButton(
                        onFileUploadClick = {}
                    )

                    Spacer(Modifier.height(24.dp))

                    CustomButton(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .height(56.dp),
                        label = "RANDOMIZE",
                        onClick = {}
                    )

                    Spacer(Modifier.height(24.dp))

                    CustomButton(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .height(56.dp),
                        label = "CLEAR",
                        onClick = {}
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}