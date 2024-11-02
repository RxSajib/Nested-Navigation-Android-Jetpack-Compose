package com.example.nestednavgraph.ui.home.main

//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.nestednavgraph.BottomBarScreen
import com.example.nestednavgraph.graphs.HomeNavGraph

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController = rememberNavController()) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Home Screen")
                }
            )
        },
        bottomBar = {
            BottomBar(navcontroller = navController)
        }
    ) { padding ->
        HomeNavGraph(navController, padding)
    }
}


@Composable
fun BottomBar(navcontroller: NavHostController) {
    val screen = listOf(
        BottomBarScreen.DashBoard,
        BottomBarScreen.Cart,
        BottomBarScreen.BookMark,
        BottomBarScreen.Profile
    )

    val navBackStackEntry by navcontroller.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    androidx.compose.material3.BottomAppBar(

    ) {
        screen.forEach { screen ->
            AddItem(screen, currentDestination, navcontroller)
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navcontroller: NavHostController
) {
    BottomNavigationItem(
        label = {
            Text(text = screen.title)
        },
        icon = {
            Icon(imageVector = screen.icon, contentDescription = null)
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.disabled),
        onClick = {
             navcontroller.navigate(screen.route){
                 popUpTo(navcontroller.graph.findStartDestination().id)
                 launchSingleTop = true
             }

        }
    )
}