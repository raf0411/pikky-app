package android.app.pikky.ui.components

import android.app.pikky.ui.theme.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ListTextField(
    modifier: Modifier = Modifier,
    value: TextFieldValue,
    onValueChange: () -> Unit,
    label: String,
    placeholder: String
) {
    OutlinedTextField(
        value = value,
        onValueChange = { onValueChange },
        label = { Text(text = label) },
        placeholder = { Text(placeholder) },
        maxLines = 10,
        singleLine = false,
        modifier = modifier.height(200.dp),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Gray50.copy(alpha = 0.8f),
            unfocusedContainerColor = Color.Gray50,
            focusedPlaceholderColor = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.7f),
            unfocusedPlaceholderColor = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.7f),
            focusedIndicatorColor = androidx.compose.material3.MaterialTheme.colorScheme.primary,
            unfocusedIndicatorColor = androidx.compose.material3.MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
        ),
        shape = RoundedCornerShape(4.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ListTextFieldPreview() {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        ListTextField(
            modifier = Modifier.fillMaxWidth(),
            value = TextFieldValue(""),
            onValueChange = {},
            label = "Input your list here...",
            placeholder = "Item 1, Item 2, Item 3"
        )
    }
}