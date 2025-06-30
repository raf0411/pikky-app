package android.app.pikky.ui.components

import android.app.pikky.ui.theme.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListTextField() {
    var text by rememberSaveable { mutableStateOf("") }

    BasicTextField(
        value = text,
        onValueChange = { text = it },
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = Color.Gray80,
                shape = RoundedCornerShape(8.dp)
            )
            .background(Color.Gray50.copy(alpha = 0.7f), RoundedCornerShape(8.dp))
            .height(130.dp),
        singleLine = false,
        maxLines = 10,
        textStyle = TextStyle(color = Color.White.copy(alpha = .7f), fontSize = 16.sp),
        decorationBox = { innerTextField ->
            Row(
                modifier = Modifier.padding(16.dp)
            ) {
                Box(modifier = Modifier.weight(1f)) {
                    if (text.isEmpty()) {
                        Text(
                            text = "Input your list here... ",
                            style = TextStyle(color = Color.White.copy(alpha = .7f), fontSize = 16.sp, fontFamily = FontFamily.Monospace)
                        )
                    }
                    innerTextField()
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun ListTextFieldPreview() {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        ListTextField()
    }
}