package com.example.clase_plataformas.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.clase_plataformas.presentation.screens.buscar.BuscarScreen
import com.example.clase_plataformas.presentation.screens.detalle.DetalleScreen
import com.example.clase_plataformas.presentation.screens.form.FormScreen
import com.example.clase_plataformas.presentation.screens.inicio.InicioScreen

@Composable
fun AppNavigation(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Inicio.ruta,
        modifier = Modifier
    ){
        composable (route = BottomNavItem.Inicio.ruta){
            InicioScreen()
        }
        composable (route = BottomNavItem.Form.ruta){
            FormScreen()
        }
        composable (route = BottomNavItem.Buscar.ruta){
            BuscarScreen()
        }
        composable (route = BottomNavItem.Detalle.ruta){
            DetalleScreen()
        }
    }
}