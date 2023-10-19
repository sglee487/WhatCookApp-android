package com.sg.whatcook.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WhatCookBottomNavBar(modifier: Modifier = Modifier) {
    NavigationBar(containerColor = MaterialTheme.colorScheme.surfaceVariant,
    modifier = modifier) {
        NavigationBarItem(
            icon = {
                   Icon(imageVector = Icons.Default.Search, contentDescription = null)
            },
            selected = true, onClick = { /*TODO*/ })
        NavigationBarItem(
            icon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = null)
            },
            selected = false, onClick = { /*TODO*/ })
        NavigationBarItem(
            icon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = null)
            },
            selected = false, onClick = { /*TODO*/ })
        NavigationBarItem(
            icon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = null)
            },
            selected = false, onClick = { /*TODO*/ })
    }
}