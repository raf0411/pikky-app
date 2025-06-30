package android.app.pikky.ui.components

import android.app.pikky.ui.theme.Color
import android.app.pikky.ui.theme.CustomFontFamily
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.UploadFile
import androidx.compose.material3.Icon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FileUploadButton(
    modifier: Modifier = Modifier,
    onFileUploadClick: () -> Unit,
) {
    var buttonText by remember { mutableStateOf("Upload File") }
    var isFileSelected by remember { mutableStateOf(false) }

    val buttonIcon = if (isFileSelected) {
        Icons.Default.CheckCircle
    } else {
        Icons.Default.UploadFile
    }

    Button(
        modifier = modifier,
        onClick = { onFileUploadClick },
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Gray80,
            contentColor = Color.White
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 10.dp,
            pressedElevation = 4.dp,
            disabledElevation = 0.dp
        ),
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier.size(48.dp),
                imageVector = buttonIcon,
                contentDescription = "File Upload Icon"
            )

            Spacer(Modifier.width(16.dp))

            Text(
                text = buttonText,
                fontSize = 20.sp,
                fontFamily = CustomFontFamily,
                fontWeight = FontWeight.ExtraBold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FileUploadButtonPreview() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        FileUploadButton(onFileUploadClick = {})
    }
}
