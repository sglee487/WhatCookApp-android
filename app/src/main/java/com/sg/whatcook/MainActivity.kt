package com.sg.whatcook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import com.sg.whatcook.components.WhatCookBottomNavBar
import com.sg.whatcook.components.WhatCookTopAppBar
import androidx.navigation.compose.rememberNavController
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
        val navController = rememberNavController()
        val currentBackStack by navController.currentBackStackEntryAsState()
        val currentDestination = currentBackStack?.destination
        val currentScreen =
            mainTopBarScreen.find { it.route == currentDestination?.route }
                ?: mainBottomBarScreen.find { it.route == currentDestination?.route }
                ?: Home

        Scaffold(
            topBar = { WhatCookTopAppBar(
                topScreens = mainTopBarScreen,
                onTabSelected = { newScreen ->
                    navController.navigateSingleTopTo(newScreen.route)
                },
                currentScreen = currentScreen
            ) },
            bottomBar = { WhatCookBottomNavBar(
                bottomScreens = mainBottomBarScreen,
                onTabSelected = { newScreen ->
                    navController.navigateSingleTopTo(newScreen.route)
                },
                currentScreen = currentScreen
            ) },
        ) { innerPadding ->
            MainNavHost(navController = navController,
            modifier = Modifier.padding(innerPadding))
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