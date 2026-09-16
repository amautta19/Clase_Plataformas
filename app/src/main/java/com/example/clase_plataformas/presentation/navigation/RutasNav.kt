package com.example.clase_plataformas.presentation.navigation

object RutasNav {
    const val INICIO = "inicio"
    const val FORMULARIO = "form?={id}" // Acá es opcional
    const val BUSCAR = "buscar"
    const val DETALLE = "detalle/{id}"  // Acá es obligatorio

    fun getTitulo(ruta: String): String{
        return when{
            ruta == INICIO -> "Catálogo Académico"
            ruta?.startsWith("form") == true -> "Formulario Libro"
            ruta == BUSCAR -> "Buscar Libro"
            ruta?.startsWith("detalle") == true -> "Detalle Libro"
            else -> ""
        }
    }
}