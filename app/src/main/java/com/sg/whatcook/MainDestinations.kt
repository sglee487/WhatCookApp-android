package com.sg.whatcook

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Subscriptions
import androidx.compose.ui.graphics.vector.ImageVector

interface MainDestination {
    val icon: ImageVector
    val route: String
    val label: Int
}

object Account : MainDestination {
    override val icon: ImageVector
        get() = Icons.Default.Person
    override val route: String
        get() = "account"
    override val label: Int
        get() = R.string.account
}

object Home : MainDestination {
    override val icon: ImageVector
        get() = Icons.Default.Home
    override val route: String
        get() = "home"
    override val label: Int
        get() = R.string.home
}

object Subscriptions : MainDestination {
    override val icon: ImageVector
        get() = Icons.Default.Subscriptions
    override val route: String
        get() = "subscriptions"
    override val label: Int
        get() = R.string.subscription
}

object Notification : MainDestination {
    override val icon: ImageVector
        get() = Icons.Default.Notifications
    override val route: String
        get() = "notification"
    override val label: Int
        get() = R.string.notification
}

object Folder : MainDestination {
    override val icon: ImageVector
        get() = Icons.Default.Folder
    override val route: String
        get() = "folder"
    override val label: Int
        get() = R.string.folder
}

val mainTopBarScreen = listOf<MainDestination>(Account)

val mainBottomBarScreen = listOf<MainDestination>(Home, Subscriptions, Notification, Folder)
