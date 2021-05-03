package com.oscar.jardineria.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.oscar.jardineria.dtos.DescuentosDTO;
import com.oscar.jardineria.entities.DescuentosEntity;

/**
 * @author Óscar Izquierdo
 * Fichero que almacena la Query que obtiene todos los descuentos de la base de datos
 */
@Repository
public interface DescuentosRepository  extends CrudRepository<DescuentosEntity, Integer>{
	
	@Query(value = "select new com.oscar.jardineria.dtos.DescuentosDTO (d.id_descuentos , d.cantidad, d.descuento ) "
			+ "FROM com.oscar.jardineria.entities.DescuentosEntity d "
			+ "WHERE (d.id_descuentos LIKE CONCAT ('%', :id_descuentos, '%') or :id_descuentos is null) "
			+ "AND d.cantidad LIKE CONCAT ('%', :cantidad, '%') "
			+ "AND d.descuento LIKE CONCAT ('%', :descuento, '%') "
			)
	
	List<DescuentosDTO>buscarDescuento( 
			@Param("id_descuentos") Integer id_descuentos,
			@Param("cantidad") Integer cantidad,
			@Param("descuento") Integer descuento
			);
}
