package com.example.testone.ui.navbar

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController

@Composable
fun Navigation(
    navController: NavHostController,
    loginViewModel: LoginViewModel,
    context: Context
) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            MainScreen(loginViewModel = loginViewModel)

        }
        composable("addUser") {
            LoginScreen(context = context, loginViewModel = loginViewModel)

        }
    }
}