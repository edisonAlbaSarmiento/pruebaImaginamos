package com.imaginamos.prueba.java.models.entities.dao;

import org.springframework.data.repository.CrudRepository;

import com.imaginamos.prueba.java.models.entities.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

}
