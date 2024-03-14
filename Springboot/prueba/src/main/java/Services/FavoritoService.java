package Services;

import Entitys.Favorito;
import Interfaces.FavoritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavoritoService {

    private final FavoritoRepository favoritoRepository;

    @Autowired
    public FavoritoService(FavoritoRepository favoritoRepository) {
        this.favoritoRepository = favoritoRepository;
    }

    public List<Favorito> findAll() {
        return favoritoRepository.findAll();
    }

    public Optional<Favorito> findById(Long id) {
        return favoritoRepository.findById(id);
    }

    public Favorito save(Favorito favorito) {
        return favoritoRepository.save(favorito);
    }

    public Optional<Favorito> update(Long id, Favorito favoritoDetails) {
        return favoritoRepository.findById(id).map(favorito -> {
            favorito.setTitle(favoritoDetails.getTitle());
            favorito.setUrl(favoritoDetails.getUrl());
            favorito.setImageUrl(favoritoDetails.getImageUrl());
            favorito.setNewsSite(favoritoDetails.getNewsSite());
            favorito.setSummary(favoritoDetails.getSummary());
            favorito.setPublishedAt(favoritoDetails.getPublishedAt());
            favorito.setUpdatedAt(favoritoDetails.getUpdatedAt());
            favorito.setFeatured(favoritoDetails.getFeatured());
            favorito.setLaunches(favoritoDetails.getLaunches());
            return favoritoRepository.save(favorito);
        });
    }

    public List<Favorito> findByName(String titulo) {
        return favoritoRepository.findByTituloContainingIgnoreCase(titulo);
    }

    public List<Favorito> sort(String property, String direction) {
        Sort sort = Sort.by(Sort.Direction.fromString(direction), property);
        return favoritoRepository.findAll(sort);
    }

    public Optional<Void> delete(Long id) {
        return favoritoRepository.findById(id).map(favorito -> {
            favoritoRepository.delete(favorito);
            return null;
        });
    }
}