package Bookstorean.Book.store.servicios;


import Bookstorean.Book.store.Dao.librosDao;
import Bookstorean.Book.store.modelo.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibroServicio {

    @Autowired
    private librosDao repositorio;

    //Guarda en la base de datos un libro nuevo con la información en el objeto c
    //Retornar el número ISBN del libro guardado
    public Long crearLibro (Libro c) {
        Libro nuevoLibro = repositorio.save(c);
        return nuevoLibro.getISBN();
    }
    //Retorna un libro con el numero dado
    public Optional<Libro> obtenerLibro(Long numeroLibro) {
        return repositorio.findById(numeroLibro);
    }

    public void eliminarLibro(Long numeroLibro) {
        repositorio.deleteById(numeroLibro);
    }

    public void actualizarLibro(Libro c) {
        repositorio.save(c);
    }

}
