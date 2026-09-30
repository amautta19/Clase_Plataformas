package com.example.clase_plataformas.presentation.screens.inicio

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.clase_plataformas.domain.usecase.GetLibrosUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class InicioViewModel @Inject constructor(
    private val getLibrosUseCase: GetLibrosUseCase
) : ViewModel() {

    fun cargarLibros(){
        Log.d("==>","Hola como estas")
    }
}