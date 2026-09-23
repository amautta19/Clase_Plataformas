package com.example.clase_plataformas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.clase_plataformas.presentation.common.AppScaffold
import com.example.clase_plataformas.presentation.navigation.AppNavigation
import com.example.clase_plataformas.ui.theme.Clase_PlataformasTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Clase_PlataformasTheme {
                val navController = rememberNavController()
                AppScaffold(navController) { paddingValues ->
                    Box(modifier = Modifier.fillMaxSize().padding(paddingValues)){
                        AppNavigation(navController)
                    }
                }
            }
        }
    }
}


// androidx.compose.material:material-iscons-extended