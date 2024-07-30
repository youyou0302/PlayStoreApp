package kr.co.playstoreapp.ui.navigation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import kr.co.playstoreapp.ui.screen.AppScreen
import kr.co.playstoreapp.ui.screen.BookScreen
import kr.co.playstoreapp.ui.screen.GameScreen

@Composable
fun MainNavHost() {
    val navController = rememberNavController()
    Surface {
        Scaffold(
            topBar = {
                ScaffoldTop()
            },
            content = { padding ->
                ScaffoldContent(padding, navController)
            },
            bottomBar = {
                ScaffoldBottom(navController)
            }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldTop() {
    TopAppBar(
        title = {
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .background(Color.LightGray, CircleShape),
                value = "",
                onValueChange = {},
                leadingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.Search, contentDescription = "Search")
                    }
                },
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Filled.PlayArrow, contentDescription = "Mic")
                    }
                }
            )
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Notifications, contentDescription = "Notifications")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "Setting")
            }
        }
    )
}

@Composable
fun ScaffoldContent(padding: PaddingValues, navController: NavHostController) {
    NavHost(
        modifier = Modifier.padding(padding),
        navController = navController,
        startDestination = MainRoute.GAME.route
    ) {
        composable(route = MainRoute.GAME.route) {
            GameScreen()
        }
        composable(route = MainRoute.APP.route) {
            AppScreen()
        }
        composable(route = MainRoute.BOOK.route) {
            BookScreen()
        }
    }
}

@Composable
fun ScaffoldBottom(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val items = listOf(
        MainRoute.GAME,
        MainRoute.APP,
        MainRoute.BOOK
    )

    NavigationBar {
        items.forEach { item ->
            NavigationBarItem(
                selected = currentRoute == item.route,
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.contentDescription
                    )
                },
                label = { Text(text = item.text) },
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let {
                            popUpTo(it) { saveState = true }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}