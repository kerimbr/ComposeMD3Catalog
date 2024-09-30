package dev.kerimbr.composemd3catalog.commonbuttons

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextButtonExample(
    modifier: Modifier = Modifier
) {

    TextButton(
        modifier = modifier,
        onClick = {
            // do something
        },
    ) {
        Text(
            text = "Daha fazla bilgi",
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun PreviewComponent() {
    TextButtonExample(modifier = Modifier.padding(16.dp))
}