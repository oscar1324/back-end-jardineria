package com.oscar.jardineria.repositorios;

import org.springframework.data.jpa.repository.Query;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.oscar.jardineria.dtos.ServiciosDTO;
import com.oscar.jardineria.entities.ServiciosEntity;


/**
 * @author Óscar Izquierdo
 * Fichero que almacena la Query que obtiene todos los servicios de la base de datos
 */
@Repository
public interface ServiciosRepository extends CrudRepository<ServiciosEntity, Integer> {
	
	@Query(value = "select new com.oscar.jardineria.dtos.ServiciosDTO (s.id_servicios, s.descripcion_servicio, s.precio_metro) "
			+ " FROM com.oscar.jardineria.entities.ServiciosEntity s "
			+ "WHERE (s.id_servicios LIKE CONCAT ('%', :id_servicios, '%') or :id_servicios is null) "
			+ "AND s.descripcion_servicio LIKE CONCAT ('%', :descripcion_servicio, '%') "
			+ "AND s.precio_metro LIKE CONCAT ('%', :precio_metro, '%') "
			
			)
	List <ServiciosDTO> buscarServicios( @Param("id_servicios") Integer id_servicios,
										 @Param("descripcion_servicio") String descripcion_servicio,
										 @Param("precio_metro") Integer precio_metro);

}
