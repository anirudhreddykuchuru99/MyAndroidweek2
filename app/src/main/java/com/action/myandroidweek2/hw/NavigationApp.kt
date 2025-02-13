package com.action.myandroidweek2.hw

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.action.myandroidweek2.hw.Screens.HomeScreen
import com.action.myandroidweek2.hw.Screens.ScreenTwo
import com.action.myandroidweek2.hw.Screens.ScreenThree


@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "HomeScreen") {
        composable("HomeScreen") { HomeScreen(navController) }
        composable("screenTwo") { ScreenTwo(navController) }
        composable("screenThree") { ScreenThree(navController) }
    }
}
