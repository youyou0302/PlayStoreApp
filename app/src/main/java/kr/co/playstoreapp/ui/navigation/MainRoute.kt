package kr.co.playstoreapp.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

enum class MainRoute(
    val route: String,
    val text: String,
    val contentDescription: String,
    val icon: ImageVector
) {
    GAME(route = "GAME", "게임", contentDescription = "GAME", icon = Icons.Filled.Home),
    APP(route = "APP", "앱", contentDescription = "APP", icon = Icons.Filled.Star),
    BOOK(route = "BOOK", "도서", contentDescription = "BOOK", icon = Icons.Filled.Settings)
}