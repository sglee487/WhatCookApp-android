package com.sg.whatcook.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Subscriptions
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.sg.whatcook.R
import com.sg.whatcook.MainDestination

@Composable
fun WhatCookBottomNavBar(
    bottomScreens: List<MainDestination>,
    onTabSelected: (MainDestination) -> Unit,
    currentScreen: MainDestination
) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surfaceVariant,
    ) {
        bottomScreens.forEach {
            bottomScreen ->
        NavigationBarItem(
            icon = {
                   Icon(imageVector = bottomScreen.icon, contentDescription = bottomScreen.route)
            },
            label = {
                    Text(stringResource(bottomScreen.label))
            },
            selected = currentScreen == bottomScreen,
            onClick = { onTabSelected(bottomScreen) })
        }
    }
}