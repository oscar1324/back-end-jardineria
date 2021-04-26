package com.oscar.jardineria.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import com.oscar.jardineria.dtos.ServiciosDTO;
import com.oscar.jardineria.entities.ServiciosEntity;


public interface ServiciosRepository extends CrudRepository<ServiciosEntity, Integer> {
	
	@Query(value = "select new com.oscar.jardineria.dtos.ServiciosDTO (s.idServicios, s.descripcionServicio, s.precioMetro) "
			+ " FROM com.oscar.jardineria.entities.ServiciosEntity s "
			+ "WHERE (s.idServicios LIKE CONCAT ('%', :idServicios, '%') or :idServicios is null) "
			+ "AND s.descripcionServicio LIKE CONCAT ('%', :descripcionServicio, '%') "
			+ "AND s.precioMetro LIKE CONCAT ('%', :precioMetro, '%') "
			
			)
	List <ServiciosDTO> buscarServicios( @Param("idServicios") Integer idServicios,
										 @Param("descripcionServicio") String descripcionServicio,
										 @Param("precioMetro") Integer precioMetro);

}
