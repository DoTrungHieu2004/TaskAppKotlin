package com.hieu10.taskappkotlin.ui.screens.task

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.hieu10.taskappkotlin.data.models.Task
import com.hieu10.taskappkotlin.utils.Action

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TaskScreen(
    selectedTask: Task?,
    navigateToListScreen: (Action) -> Unit
) {
    Scaffold (
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = navigateToListScreen
            )
        },
        content = {}
    )
}