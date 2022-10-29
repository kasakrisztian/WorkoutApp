/*
package com.example.workoutapp.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.workoutapp.screens.MainScreen

@Composable
fun Navigation(navController: NavHostController) {
    //Képernyők közti navigálásra kell a navigation
    //Érdemes külön fájlba rendezni nagyobb projektek esetén
    //Minden egyes composable egy külön screen

    NavHost(
        navController = navController,
        startDestination = "mainscreen"
    ) {
        composable(
            route = "mainscreen"
        ) {
            MainScreen(
                modifier = Modifier
            )
        }
    }
}*/
