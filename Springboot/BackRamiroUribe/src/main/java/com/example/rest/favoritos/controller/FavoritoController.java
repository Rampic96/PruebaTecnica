package com.example.rest.favoritos.controller;

import com.example.rest.favoritos.entity.Favorito;
import com.example.rest.favoritos.repository.FavoritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/API/favoritos")
public class FavoritoController {

    @Autowired
    private FavoritoRepository favoritoRepository;

    @GetMapping("/listar")
    public ResponseEntity<List<Favorito>> listarFavoritos(){

        return ResponseEntity.ok(favoritoRepository.findAll());
    }
}
