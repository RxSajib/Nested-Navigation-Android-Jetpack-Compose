package com.example.nestednavgraph.ui.account

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nestednavgraph.graphs.AuthScreen
import com.example.nestednavgraph.graphs.Graph

@Composable
fun SignInScreen(navcontroller: NavHostController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

        Column (horizontalAlignment = Alignment.CenterHorizontally){
            Text(
                text = "Sign Up Account",
                style = TextStyle(fontSize = 25.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.clickable {
                    navcontroller.navigate(AuthScreen.SignUp.route)
                }
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Forgot Password",
                style = TextStyle(color = Color.Gray),
                modifier = Modifier.clickable {
                    navcontroller.navigate(AuthScreen.ForgotPassword.route)
                }
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {
                    navcontroller.popBackStack()
                    navcontroller.navigate(Graph.HOME)
                },
            ) {
                Text("SignIn Account")
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun Preview() {
    SignInScreen(
        navcontroller = rememberNavController()
    )
}