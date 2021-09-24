package Bookstorean.Book.store.Dao;


import Bookstorean.Book.store.modelo.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface librosDao extends CrudRepository<Libro, Long> {

}
