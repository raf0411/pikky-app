package android.app.pikky.ui.components

import android.app.pikky.R
import android.app.pikky.ui.theme.Color
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun PopupDialog(
    title: String = "Sample Title",
    message: String = "This is a fully custom dialog. You can place any content here.",
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    var showDialog by remember { mutableStateOf(true) }

    if (showDialog) {
        Dialog(
            onDismissRequest = { showDialog = false }
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Gray50,
                    contentColor = Color.White
                )
            ) {
                Column(
                    modifier = Modifier.padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        text = title,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.poppins_bold))
                    )

                    Spacer(Modifier.height(8.dp))

                    Text(
                        text = message,
                        textAlign = TextAlign.Center,
                        fontFamily = FontFamily.Monospace,
                        lineHeight = 2.em,
                        fontSize = 16.sp,
                        color = if (title.equals("Error", ignoreCase = true)) Color.Red50 else Color.White
                    )

                    Spacer(Modifier.height(18.dp))

                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(20.dp)
                    ) {
                        when(title) {
                            "Error" -> {
                                CustomButton(
                                    label = "GO BACK",
                                    onClick = {},
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(60.dp)
                                )
                            }

                            "Result" -> {
                                CustomButton(
                                    label = "RANDOMIZE AGAIN",
                                    onClick = {},
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(60.dp)
                                )

                                CustomButton(
                                    label = "GO BACK",
                                    onClick = {},
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(60.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PopupDialogPreview() {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            PopupDialog(
                title = "Result",
                message = "Baldur's Gate 3",
                onDismiss = {},
                onConfirm = {}
            )
        }
    }
}