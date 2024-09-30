package dev.kerimbr.composemd3catalog.commonbuttons

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun OutlinedButtonExample(
    modifier: Modifier = Modifier
) {

    OutlinedButton(
        modifier = modifier,
        onClick = {
            // do something
        }
    ) {
        Text(
            text = "İptal",
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun PreviewComponent() {
    OutlinedButtonExample(modifier = Modifier.padding(16.dp))
}