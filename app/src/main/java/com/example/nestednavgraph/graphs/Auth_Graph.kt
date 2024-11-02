package com.example.nestednavgraph.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestednavgraph.ui.account.ResetPassword
import com.example.nestednavgraph.ui.account.SignInScreen
import com.example.nestednavgraph.ui.account.SignUpScreen


fun NavGraphBuilder.authGraph(navcontroller: NavHostController) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ){
        composable(route = AuthScreen.Login.route) {
            SignInScreen(navcontroller = navcontroller)
        }

        composable(route = AuthScreen.SignUp.route) {
            SignUpScreen(navcontroller = navcontroller)
        }

        composable(route = AuthScreen.ForgotPassword.route) {
            ResetPassword(navcontroller = navcontroller)
        }
    }
}

sealed class AuthScreen(val route : String){
    data object Login : AuthScreen(route = "Login")
    data object SignUp : AuthScreen(route = "SignUp")
    data object ForgotPassword : AuthScreen(route = "ForgotPassword")
}