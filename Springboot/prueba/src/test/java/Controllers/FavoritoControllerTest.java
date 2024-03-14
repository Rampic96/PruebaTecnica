package Controllers;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import Entitys.Favorito;
import Services.FavoritoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.junit.jupiter.InjectSoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class FavoritoControllerTest {

    private MockMvc mockMvc;
    private ObjectMapper objectMapper;

    @Mock
    private FavoritoService favoritoService;

    @InjectMocks
    private FavoritoController favoritoController;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(favoritoController).build();
        objectMapper = new ObjectMapper();
    }

    @Test
    public void listarFavoritosTest() throws Exception {
        List<Favorito> favoritos = new ArrayList<>();

        when(favoritoService.findAll()).thenReturn(favoritos);

        mockMvc.perform(get("/listar"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));

        verify(favoritoService).findAll();
    }

    @Test
    public void obtenerFavoritoByIdTest() throws Exception {
        Long id = 1L;
        Optional<Favorito> favorito = Optional.of(new Favorito());

        when(favoritoService.findById(id)).thenReturn(favorito);

        mockMvc.perform(get("/obtener/{id}", id))
                .andExpect(status().isOk());

        verify(favoritoService).findById(id);
    }

    @Test
    public void crearFavoritoTest() throws Exception {
        Favorito favorito = new Favorito();
        favorito.setId(1L);
        favorito.setUrl("www.test.cl");

        when(favoritoService.save(any(Favorito.class))).thenReturn(favorito);

        mockMvc.perform(post("/crear")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(favorito)))
                .andExpect(status().isOk());

        verify(favoritoService).save(any(Favorito.class));
    }

    @Test
    public void actualizarFavoritoTest() throws Exception {
        Long id = 1L;
        Favorito favorito = new Favorito();

        when(favoritoService.update(eq(id), any(Favorito.class))).thenReturn(Optional.of(favorito));

        mockMvc.perform(put("/actualizar/{id}", id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(favorito)))
                .andExpect(status().isOk());

        verify(favoritoService).update(eq(id), any(Favorito.class));
    }

    @Test
    public void deleteFavoritoNoExistenteTest() throws Exception {
        Long id = 1L;
        when(favoritoService.delete(id)).thenReturn(Optional.empty());

        mockMvc.perform(delete("/borrar/{id}", id))
                .andExpect(status().isNotFound());

        verify(favoritoService).delete(id);
    }

    @Test
    public void obtenerOrdenadoTest() throws Exception {
        String propiedad = "nombre";
        List<Favorito> favoritos = new ArrayList<>();

        when(favoritoService.sort(propiedad, "ASC")).thenReturn(favoritos);

        mockMvc.perform(get("/obtenerOrden/{propiedad}", propiedad))
                .andExpect(status().isOk());

    }

}
