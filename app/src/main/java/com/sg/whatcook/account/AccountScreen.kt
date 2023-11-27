package com.sg.whatcook.account

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AccountScreen() {
    Column(
        modifier = Modifier
            .padding(16.dp)
    ) {
        Text(text = "AccountScreen")
    }
}