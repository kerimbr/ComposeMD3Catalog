package dev.kerimbr.composemd3catalog.commonbuttons

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Text

@Composable
fun ElevatedButtonExample(
    modifier: Modifier = Modifier
) {

    ElevatedButton(
        modifier = modifier,
        onClick = {
            // do something
        },
        elevation = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 6.dp,
            focusedElevation = 8.dp,
            pressedElevation = 4.dp
        )
    ) {
        Icon(
            modifier = Modifier.size(16.dp),
            imageVector = Icons.Default.Person,
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "Kayıt Ol"
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun PreviewComponent() {
    ElevatedButtonExample(modifier = Modifier.padding(16.dp))
}