package com.example.clase_plataformas.data.remote.api

import com.example.clase_plataformas.data.remote.dto.ApiResponseDto
import com.example.clase_plataformas.data.remote.dto.LibrosDataDto
import retrofit2.http.GET

interface LibroApiService {

    @GET("libros")
    suspend fun getLibros() : ApiResponseDto<LibrosDataDto>


}