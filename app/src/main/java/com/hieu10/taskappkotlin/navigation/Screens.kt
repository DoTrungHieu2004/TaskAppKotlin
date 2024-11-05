package com.hieu10.taskappkotlin.navigation

import androidx.navigation.NavHostController
import com.hieu10.taskappkotlin.utils.Action
import com.hieu10.taskappkotlin.utils.Constants

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate(route = "list/${action.name}") {
            popUpTo(Constants.LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/$taskId")
    }
}