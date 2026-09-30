package com.example.clase_plataformas.presentation.screens.inicio

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.clase_plataformas.domain.usecase.GetLibrosUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class InicioViewModel @Inject constructor(
    private val getLibrosUseCase: GetLibrosUseCase
) : ViewModel() {

    fun cargarLibros(){
        viewModelScope.launch {
            getLibrosUseCase()
                .onSuccess { libros ->
                    Log.d("==>","hola")
                }
        }
    }
}