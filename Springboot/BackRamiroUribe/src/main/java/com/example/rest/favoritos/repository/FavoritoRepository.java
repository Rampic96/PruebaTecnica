package com.example.rest.favoritos.repository;

import com.example.rest.favoritos.entity.Favorito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoritoRepository extends JpaRepository<Favorito, Long> {

    //List<Favorito> findByTituloContainingIgnoreCase(String titulo);

}
