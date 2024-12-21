package dev.kerimbr.composemd3catalog.fab

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ExtendedFabExample(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    ExtendedFloatingActionButton(
        onClick = onClick,
        containerColor = MaterialTheme.colorScheme.surfaceContainer,
        contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
    ) {
        Icon(Icons.Default.Search, contentDescription = "Add")
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "Search")
    }
}

@Preview
@Composable
private fun LargeFabExamplePreview() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .background(Color(0xff121212))
                .padding(16.dp),
            contentAlignment = Alignment.Center,
        ) {
            ExtendedFabExample(
                onClick = { /*TODO*/ }
            )
        }
    }
}