package com.oscar.jardineria.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.oscar.jardineria.dtos.PresupuestosDTO;
import com.oscar.jardineria.entities.PresupuestosEntity;
import java.util.List;

/**
 * @author Óscar Izquierdo
 * Fichero que almacena la Query que obtiene todos los Presupuestos de la base de datos
 * 
 *
 */
@Repository
public interface PresupuestosRepository extends CrudRepository<PresupuestosEntity, Integer>{
	
	@Query( value =" select new com.oscar.jardineria.dtos.PresupuestosDTO (p.idPresupuestos, p.username, p.cantidadTerreno, p.fechaPresupuesto, p.comentario) "
			+"FROM com.oscar.jardineria.entities.PresupuestosEntity p "
			+"WHERE (p.idPresupuestos LIKE CONCAT ('%', :idPresupuestos, '%') or :idPresupuestos is null) "
			+"AND p.username LIKE CONCAT ('%', :username, '%') "
			+"AND p.cantidadTerreno LIKE CONCAT ('%', :cantidadTerreno, '%') "
			+"AND p.fechaPresupuesto LIKE CONCAT ('%', :fechaPresupuesto, '%') "
			+"AND p.comentario LIKE CONCAT ('%', :comentario, '%') "
			
			)
	List<PresupuestosDTO> buscarPresupuestos(@Param("idPresupuestos") Integer idPresupuestos,
										 	 @Param("username") String username,
											 @Param("cantidadTerreno") Integer cantidadTerreno,
											 @Param("fechaPresupuesto") String fechaPresupuesto,
											 @Param("comentario") String comentario);
}


