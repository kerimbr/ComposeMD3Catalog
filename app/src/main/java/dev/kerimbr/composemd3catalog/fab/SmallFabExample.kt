package dev.kerimbr.composemd3catalog.fab

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SmallFabExample(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    SmallFloatingActionButton(
        onClick = onClick,
        containerColor = MaterialTheme.colorScheme.secondary,
        contentColor = MaterialTheme.colorScheme.onSecondary
    ) {
        Icon(Icons.Default.Star, contentDescription = "Add")
    }
}

@Preview
@Composable
private fun SmallFabExamplePreview() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .background(Color.White)
                .padding(16.dp),
            contentAlignment = Alignment.Center,
        ) {
            SmallFabExample(
                onClick = { /*TODO*/ }
            )
        }
    }
}