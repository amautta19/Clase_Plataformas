package com.example.clase_plataformas.domain.repository

import com.example.clase_plataformas.domain.model.Libro

interface LibroRepository {
    suspend fun getLibros() : Result<List<Libro>>
}