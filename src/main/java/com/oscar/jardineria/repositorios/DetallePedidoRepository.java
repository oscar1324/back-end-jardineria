package com.oscar.jardineria.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.oscar.jardineria.entities.DetallePedidosEntity;

@Repository
public interface DetallePedidoRepository extends CrudRepository<DetallePedidosEntity, Integer>{

}
