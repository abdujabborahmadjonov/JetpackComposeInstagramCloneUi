package dev.abdujabbor.jetpackcomposeinstagramcloneui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.abdujabbor.jetpackcomposeinstagramcloneui.ui.theme.JetpackComposeInstagramCloneUiTheme
import dev.abdujabbor.jetpackcomposeinstagramcloneui.ui.theme.ProfileScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInstagramCloneUiTheme() {
                ProfileScreen()

            }
        }
    }
}