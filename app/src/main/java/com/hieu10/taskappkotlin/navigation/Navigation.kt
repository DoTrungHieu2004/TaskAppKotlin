package com.hieu10.taskappkotlin.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hieu10.taskappkotlin.navigation.destinations.listComposable
import com.hieu10.taskappkotlin.navigation.destinations.taskComposable
import com.hieu10.taskappkotlin.ui.viewmodels.SharedViewModel
import com.hieu10.taskappkotlin.utils.Constants

@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(navController = navController, startDestination = Constants.LIST_SCREEN) {
        listComposable (
            navigateToTaskScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
        taskComposable (
            navigateToListScreen = screen.list
        )
    }
}