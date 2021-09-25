package Bookstorean.Book.store.controladores;

import Bookstorean.Book.store.modelo.Libro;
import Bookstorean.Book.store.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LibroControlador {
    @Autowired
    private LibroServicio servicio;

    @PostMapping("/libro")
    public ResponseEntity<String> crearLibro(@RequestBody Libro libro){
        Long numeroLibro = servicio.crearLibro(libro);
        return new ResponseEntity<>("El libro se ha creado exitosamente "+ numeroLibro,
                HttpStatus.CREATED);
    }

    @GetMapping("/libro/{numeroLibro}")
    public Optional<Libro> obtenerLibro(@PathVariable Long numeroLibro) {

        return servicio.obtenerLibro(numeroLibro);

    }

    @DeleteMapping("/libro/{numeroLibro}")
    private ResponseEntity<String> eliminarLibro(@PathVariable("numeroLibro") Long numeroLibro) {
        servicio.eliminarLibro(numeroLibro);
        return new ResponseEntity<>("El libro se ha eliminado exitosamente con ISBN: " + numeroLibro,
                HttpStatus.OK);
    }


    @PutMapping("/libro")
    private ResponseEntity<String> actualizarLibro(@RequestBody Libro libro) {
        servicio.actualizarLibro(libro);
        return new ResponseEntity<>("El libro se ha actualizado exitosamente con el título: " + libro.getTitulo(),
                HttpStatus.OK);
    }

}

