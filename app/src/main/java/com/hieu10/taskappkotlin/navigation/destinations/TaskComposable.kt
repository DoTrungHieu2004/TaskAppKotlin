package com.hieu10.taskappkotlin.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.hieu10.taskappkotlin.ui.screens.task.TaskScreen
import com.hieu10.taskappkotlin.utils.Action
import com.hieu10.taskappkotlin.utils.Constants

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable (
        route = Constants.TASK_SCREEN,
        arguments = listOf(navArgument(Constants.TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) { navBackStackEntry ->
        val taskId = navBackStackEntry.arguments!!.getInt(Constants.TASK_ARGUMENT_KEY)
        TaskScreen(navigateToListScreen = navigateToListScreen)
    }
}