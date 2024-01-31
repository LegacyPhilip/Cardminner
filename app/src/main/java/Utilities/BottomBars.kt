import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*

import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun PopupExample() {
    var showDialog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Button to trigger the popup
        Button(onClick = { showDialog = true }) {
            Icon(imageVector = Icons.Default.Info, contentDescription = "Info")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Show Popup")
        }

        // Dialog
        if (showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                title = {
                    Text(text = "Popup Title")
                },
                text = {
                    Text(text = "This is some information in the popup.")
                },
                confirmButton = {
                    Button(onClick = { showDialog = false }) {
                        Text(text = "OK")
                    }
                }
            )
        }
    }
}
