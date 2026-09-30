package com.example.clase_plataformas.data.remote.dto

data class ApiResponseDto<T>(
    val success : Boolean,
    val data : T,
    val timestamp: String
)
