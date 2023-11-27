package com.sg.whatcook

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sg.whatcook.account.AccountScreen
import com.sg.whatcook.folder.FolderScreen
import com.sg.whatcook.home.HomeScreen
import com.sg.whatcook.notification.NotificationScreen
import com.sg.whatcook.subscriptions.SubscriptionsScreen

@Composable
fun MainNavHost(
    navController: NavHostController, modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Home.route,
        modifier = modifier
    ) {
        composable(route = Account.route) {
            AccountScreen()
        }
        composable(route = Home.route) {
            HomeScreen()
        }
        composable(route = Subscriptions.route) {
            SubscriptionsScreen()
        }
        composable(route = Notification.route) {
            NotificationScreen()
        }
        composable(route = Folder.route) {
            FolderScreen()
        }
    }
}

fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) {
        // Pop up to the start destination of the graph to
        // avoid building up a large stack of destinations
        // on the back stack as users select items
        popUpTo(
            this@navigateSingleTopTo.graph.findStartDestination().id
        ) {
            saveState = true
        }
        // Avoid multiple copies of the same destination when
        // reselecting the same item
        launchSingleTop = true
        // Restore state when reselecting a previously selected item
        restoreState = true
    }

