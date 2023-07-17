package com.platzi.markert.Percistence.crud;

import java.util.List;
<<<<<<< HEAD
import java.util.Optional;
=======
>>>>>>> 0f5f02523702369f3c177ea765096df65c513c73

import org.springframework.data.repository.CrudRepository;


import com.platzi.markert.Percistence.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
<<<<<<< HEAD
   //Manera nativa tambien se puede hacer
    // @Query(value = "SELECT * FROM productos WHERE id _categorias = ?", nativeQuery = true )
=======
   //Manera nativa
    // @Query(value = "SELECT * FROM productos WHERE id _categorias = ?", nativeQuery = true )

    List<Producto> findByIdCatgoriaOrderByNombreAsc(int idCategoria);

>>>>>>> 0f5f02523702369f3c177ea765096df65c513c73

    List<Producto> findByIdCatgoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidad_stock,boolean estado);

    Optional<List<Producto>> findByCantidadStocklessThanAndEstado(int cantidad, b:true);
}
