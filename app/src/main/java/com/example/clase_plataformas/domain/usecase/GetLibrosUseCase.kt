package com.example.clase_plataformas.domain.usecase

import com.example.clase_plataformas.domain.model.Libro
import com.example.clase_plataformas.domain.repository.LibroRepository
import javax.inject.Inject

class GetLibrosUseCase @Inject constructor(private val respository : LibroRepository) {
    suspend operator fun invoke() : Result<List<Libro>> = respository.getLibros()
}