package com.example.nestednavgraph

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route : String,
    val title : String,
    val icon : ImageVector
){
    data object DashBoard : BottomBarScreen(route = "DASHBOARD", title = "DashBoard", icon = Icons.Default.Home)
    data object Cart : BottomBarScreen(route = "CART", title = "Cart", icon = Icons.Default.ShoppingCart)
    data object BookMark : BottomBarScreen(route = "BOOKMARK", title = "Bookmark", icon = Icons.Default.FavoriteBorder)
    data object Profile : BottomBarScreen(route = "PROFILE", title = "Profile", icon = Icons.Default.Person)
}
