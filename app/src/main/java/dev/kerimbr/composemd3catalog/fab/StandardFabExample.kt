package dev.kerimbr.composemd3catalog.fab

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StandardFabExample(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    FloatingActionButton(
        onClick = onClick,
        containerColor = Color.Black,
        contentColor = Color.LightGray,
        shape = RoundedCornerShape(4.dp),
        elevation = FloatingActionButtonDefaults.elevation(
            defaultElevation = 8.dp,
            pressedElevation = 16.dp,
        ),
    ) {
        Icon(Icons.Default.Add, contentDescription = "Add")
    }
}

@Preview
@Composable
private fun StandardFabExamplePreview() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .background(Color.White)
                .padding(16.dp),
            contentAlignment = Alignment.Center,
        ) {
            StandardFabExample(
                onClick = { /*TODO*/ }
            )
        }
    }
}