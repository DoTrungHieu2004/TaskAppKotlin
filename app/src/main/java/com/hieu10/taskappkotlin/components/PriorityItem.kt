package com.hieu10.taskappkotlin.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hieu10.taskappkotlin.data.models.Priority
import com.hieu10.taskappkotlin.ui.theme.LARGE_PADDING
import com.hieu10.taskappkotlin.ui.theme.PRIORITY_INDICATOR_SIZE
import com.hieu10.taskappkotlin.ui.theme.Typography

@Composable
fun PriorityItem(priority: Priority) {
    Row (
        verticalAlignment = Alignment.CenterVertically
    ) {
        Canvas(modifier = Modifier.size(PRIORITY_INDICATOR_SIZE)) {
            drawCircle(color = priority.color)
        }
        Text(
            text = priority.name,
            style = Typography.titleMedium,
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.padding(start = LARGE_PADDING)
        )
    }
}

@Composable
@Preview
fun PriorityItemPreview() {
    PriorityItem(priority = Priority.NONE)
}