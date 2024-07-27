package kr.co.playstoreapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import kr.co.playstoreapp.ui.navigation.MainNavHost
import kr.co.playstoreapp.ui.theme.PlayStoreAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlayStoreAppTheme {
                MainNavHost()
            }
        }
    }
}