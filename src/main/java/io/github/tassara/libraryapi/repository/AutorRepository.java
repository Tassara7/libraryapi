package io.github.tassara.libraryapi.repository;

import io.github.tassara.libraryapi.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface AutorRepository extends JpaRepository<Autor, UUID> {
}
