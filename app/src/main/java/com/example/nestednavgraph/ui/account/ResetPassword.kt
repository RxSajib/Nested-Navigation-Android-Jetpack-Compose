package com.example.nestednavgraph.ui.account

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ResetPassword(navcontroller: NavHostController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(
            text = "Reset Password",
            modifier = Modifier.clickable {
                navcontroller.popBackStack()
            }
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun Preview() {
    ResetPassword(
        navcontroller = rememberNavController()
    )
}