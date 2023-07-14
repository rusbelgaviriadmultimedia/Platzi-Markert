package com.platzi.markert.Percistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.platzi.markert.Percistence.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

}
