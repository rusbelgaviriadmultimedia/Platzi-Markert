package com.platzi.markert.Percistence.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer id_categoria;

    private String descripcion;

    private String estado;
    // De uno a muchos
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;
}
