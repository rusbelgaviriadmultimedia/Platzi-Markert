package com.platzi.markert.Percistence;

import com.platzi.markert.Percistence.crud.ProductoCrudRepository;

import java.util.List;
import java.util.Optional;
<<<<<<< HEAD

=======
import java.util.OptionalDouble;
>>>>>>> 0f5f02523702369f3c177ea765096df65c513c73

import com.platzi.markert.Percistence.entity.Producto;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    //metodo publico que retorna inalista de productos
    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();

    }

    //todos los productos se van a ordenar de manera acendente
    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCatgoriaOrderByNombreAsc(idCategoria);
    }

<<<<<<< HEAD
    //
    public Optional<List<Producto>> getEscasos(int cantidad, boolean stado) {
        return productoCrudRepository.findByCantidadStocklessThanAndEstado(cantidad,boolean true);
    }
    public Optional<Producto> getProducto(int idproducto) {
        return productoCrudRepository.findById(idproducto);
=======
    public Optional<List<Producto>> getEscasos(int cantidad, boolean estado) {
        return productoCrudRepository.findByCantidadStocklessThanAndEstado(cantidad, estado=true);
>>>>>>> 0f5f02523702369f3c177ea765096df65c513c73
    }
}
