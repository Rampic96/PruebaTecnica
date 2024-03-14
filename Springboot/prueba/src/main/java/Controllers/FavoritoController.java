package Controllers;

import Services.FavoritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Entitys.Favorito;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class FavoritoController {

    private final FavoritoService favoritoService;

    @Autowired
    public FavoritoController(FavoritoService favoritoService) {
        this.favoritoService = favoritoService;    }


    //Obtener todos los favoritos
    @GetMapping("/listar")
    public List<Favorito> listarFavoritos(){
        return favoritoService.findAll();
    }

    @GetMapping("/test")
    public void imprimir(){
        System.out.println("Se ingreso a la llamada");
    }

    //Obtener un favorito por ID
    @GetMapping("/obtener/{id}")
    public Optional<Favorito> obtenerFavoritoById(@PathVariable Long id){
        return favoritoService.findById(id);
    }

    //Crear nuevo Favorito
    @PostMapping("/crear")
    public Favorito crearFavorito(@RequestBody Favorito favorito){
        return favoritoService.save(favorito);
    }

    //Actualizar un Favorito existente
    @PutMapping("/actualizar/{id}")
    public Optional<Favorito> actualizarFavorito(@PathVariable Long id, @RequestBody Favorito favorito){
        return favoritoService.update(id, favorito);
    }

    //Eliminar un favorito
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteFavorito(@PathVariable Long id){
        return favoritoService.delete(id)
                .map(aVoid -> ResponseEntity.ok().build())
                .orElseGet(() -> ResponseEntity.notFound().build());

    }

    //Buscar favoritos por titulo
    @GetMapping("/obtenerPorTitulo/{titulo}")
    public List<Favorito> obtenerPorTitulo(@PathVariable String titulo){
        return favoritoService.findByName(titulo);
    }


    //Traer de forma ordenada
    @GetMapping("/obtenerOrden/{propierty}")
    public List<Favorito> obtenerOrdenado(@PathVariable String propierty){
        return favoritoService.sort(propierty, "ASC");
    }
}

