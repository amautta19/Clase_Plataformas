package com.example.clase_plataformas.data.remote.dto

import com.example.clase_plataformas.domain.model.Libro

data class LibroDto(
    val id: String?,
    val titulo: String?,
    val autor: String?,
    val anio: Int?,
    val genero: String?,
    val descripcion: String?
) {
    fun toDomain(): Libro {
        return Libro(
            id = id.orEmpty(),
            titulo = titulo.orEmpty(),
            autor = autor.orEmpty(),
            anio = anio ?: 0,
            genero = genero.orEmpty(),
            descripcion = descripcion.orEmpty()
        )
    }
}