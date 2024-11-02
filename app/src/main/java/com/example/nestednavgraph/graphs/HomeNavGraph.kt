package com.example.nestednavgraph.graphs

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nestednavgraph.ui.home.BookMark
import com.example.nestednavgraph.ui.home.Cart
import com.example.nestednavgraph.ui.home.DashBoard
import com.example.nestednavgraph.ui.home.Profile

@Composable
fun HomeNavGraph(navController: NavHostController, padding : PaddingValues) {
    NavHost(
        navController = rememberNavController(),
        route = Graph.HOME,
        startDestination = HomeScreen.Home.route
    ){
        composable(route = HomeScreen.Home.route) {
            DashBoard()
        }

        composable(route = HomeScreen.Cart.route) {
            Cart()
        }

        composable(route = HomeScreen.BookMark.route) {
            BookMark()
        }

        composable(route = HomeScreen.Profile.route) {
            Profile()
        }
    }
}

sealed class HomeScreen(val route : String){
    data object Home : HomeScreen("HOME")
    data object Cart : HomeScreen(route = "CART")
    data object BookMark : HomeScreen(route = "BOOKMARK")
    data object Profile : HomeScreen(route = "PROFILE")
}