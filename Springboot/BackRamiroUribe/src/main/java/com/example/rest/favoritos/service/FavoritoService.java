package com.example.rest.favoritos.service;

import com.example.rest.favoritos.entity.Favorito;
import com.example.rest.favoritos.repository.FavoritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class FavoritoService implements FavoritoRepository {

    @Autowired
    private FavoritoRepository favoritoRepository;


    @Override
    public List<Favorito> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Favorito> findAll(Pageable pageable) {
        return null;
    }

    /*@Override
    public List<Favorito> findByTituloContainingIgnoreCase(String titulo) {
        return null;
    }*/

    @Override
    public void flush() {

    }

    @Override
    public <S extends Favorito> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Favorito> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Favorito> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Favorito getOne(Long aLong) {
        return null;
    }

    @Override
    public Favorito getById(Long aLong) {
        return null;
    }

    @Override
    public Favorito getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Favorito> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Favorito> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Favorito> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Favorito> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Favorito> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Favorito> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Favorito, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Favorito> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Favorito> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Favorito> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Favorito> findAll() {
        return null;
    }

    @Override
    public List<Favorito> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Favorito entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Favorito> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
