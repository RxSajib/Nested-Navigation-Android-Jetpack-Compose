package com.example.nestednavgraph.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun Cart() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart){
        Text(
            text = "Cart",
            fontSize = 25.sp
        )
    }
}