package com.example.clase_plataformas.data.repository

import com.example.clase_plataformas.data.remote.api.LibroApiService
import com.example.clase_plataformas.domain.model.Libro
import com.example.clase_plataformas.domain.repository.LibroRepository
import javax.inject.Inject

class LibroRepositoryImpl @Inject constructor(
    private val apiLibro : LibroApiService) : LibroRepository {
    override suspend fun getLibros(): Result<List<Libro>> = runCatching{
        val response = apiLibro.getLibros()
        if(response.success){
            response.data.items.map { it.toDomain() }
        } else {
            throw Exception("Error en la respuesta del servidor")
        }
    }
}