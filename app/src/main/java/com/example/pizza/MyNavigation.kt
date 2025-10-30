package com.example.pizza

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "signin"
    ) {
        composable(route = "signin") {
            SignInScreen(navController)
        }
        composable(route = "home") {
            HomeScreen(navController)
        }
    }
}
