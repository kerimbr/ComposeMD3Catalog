package dev.kerimbr.composemd3catalog.fab

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.FabPosition
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ScaffoldAndFabAnimationExample(
    modifier: Modifier = Modifier
) {

    val listState: LazyListState = rememberLazyListState()
    val isFABVisible by remember {
        derivedStateOf {
            listState.firstVisibleItemIndex == 0
        }
    }

    Scaffold(
        floatingActionButton = {
            AnimatedVisibility(
                visible = isFABVisible,
                enter = slideInVertically(initialOffsetY = { it * 2 }),
                exit = slideOutVertically(targetOffsetY = { it * 2 }),
            ) {
                ExtendedFabExample {
                    // Handle FAB click
                }
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        containerColor = Color(0xff121212)
    ) {
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(it),
            state = listState
        ) {
            items(50) {
                Surface(
                    modifier = Modifier.padding(8.dp),
                    contentColor = Color.White,
                    color = Color(0xff121212)
                ) {
                    Text("Item $it")
                }
            }
        }
    }
}

@Composable
@Preview
private fun ScaffoldAndFabAnimationExamplePreview() {
    MaterialTheme {
        ScaffoldAndFabAnimationExample()
    }
}