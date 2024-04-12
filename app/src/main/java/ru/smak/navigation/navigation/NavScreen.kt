package ru.smak.navigation.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.smak.navigation.screens.DetailScreen
import ru.smak.navigation.screens.MainScreen
import ru.smak.navigation.screens.SettingsScreen

@Composable
fun NavScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.MAIN_SCREEN.route
    ){
        composable(Screen.MAIN_SCREEN.route){
            MainScreen(
                navController,
                modifier = Modifier.fillMaxSize()
            )
        }
        composable(Screen.DETAIL_SCREEN.route){
            DetailScreen(
                navController,
                modifier = Modifier.fillMaxSize()
            )
        }
        composable(Screen.SETTINGS_SCREEN.route){
            SettingsScreen(
                navController,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}