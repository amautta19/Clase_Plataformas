package com.example.clase_plataformas.domain.model

data class Libro(
    val id: String = "",
    val titulo: String,
    val autor: String,
    val anio: Int,
    val genero: String,
    val descripcion: String
)
