package com.example.nestednavgraph.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nestednavgraph.ui.home.main.HomeScreen

@Composable
fun RootNavGraph(navcontroller: NavHostController) {
    NavHost(
        navController = navcontroller,
        route = Graph.ROOT,
        startDestination = Graph.AUTH
    ){
        authGraph(navcontroller = navcontroller)

        composable(route = Graph.HOME) {
            HomeScreen()
        }
    }
}

object Graph{
    const val ROOT = "Root_graph"
    const val AUTH = "auth_graph"
    const val HOME = "home_graph"
}