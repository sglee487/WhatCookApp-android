package com.sg.whatcook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sg.whatcook.components.WhatCookBottomNavBar
import com.sg.whatcook.components.WhatCookTopAppBar
import com.sg.whatcook.ui.theme.WhatcookTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatCookApp()
        }
    }
}

@Composable
fun WhatCookApp() {
    WhatcookTheme {
        Scaffold(
            topBar = { WhatCookTopAppBar() },
            bottomBar = { WhatCookBottomNavBar() },
        ) { padding ->
            Greeting(name = "Android", Modifier.padding(padding))
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WhatcookTheme {
        Greeting("Android")
    }
}