package com.javaspring.literalura.repository;

import com.javaspring.literalura.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {

    Libro findByTituloIgnoreCase(String titulo);

    List<Libro> findByIdiomaContaining(String idioma);
}
