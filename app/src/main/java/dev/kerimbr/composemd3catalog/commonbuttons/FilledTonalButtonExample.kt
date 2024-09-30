package dev.kerimbr.composemd3catalog.commonbuttons

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FilledTonalButtonExample(
    modifier: Modifier = Modifier
) {
    FilledTonalButton(
        modifier = modifier,
        onClick = {
            // do something
        }
    ) {
        Icon(
            modifier = Modifier.size(16.dp),
            imageVector = Icons.Default.ShoppingCart,
            contentDescription = null,
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "Sepete Ekle",
            color = MaterialTheme.colorScheme.onTertiaryContainer
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewComponent() {
    FilledTonalButtonExample(
        modifier = Modifier.padding(16.dp)
    )
}