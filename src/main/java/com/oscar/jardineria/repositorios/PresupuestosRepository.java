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
	
	@Query( value =" select new com.oscar.jardineria.dtos.PresupuestosDTO (p.id_presupuestos, u.username, p.cantidad_terreno, p.fecha_presupuesto, p.comentario, p.disabled) "
			+"FROM com.oscar.jardineria.entities.PresupuestosEntity p JOIN com.oscar.jardineria.entities.UserEntity u ON p.id_presupuestos = u.username "
			+"WHERE (p.id_presupuestos LIKE CONCAT ('%', :id_presupuestos, '%') or :id_presupuestos is null) "
			+"AND u.username LIKE CONCAT ('%', :username, '%') "
			+"AND p.cantidad_terreno LIKE CONCAT ('%', :cantidad_terreno, '%') "
			+"AND p.fecha_presupuesto LIKE CONCAT ('%', :fecha_presupuesto, '%') "
			+"AND p.comentario LIKE CONCAT ('%', :comentario, '%') "
			+"AND p.disabled LIKE CONCAT ('%', :disabled, '%') "
			
			)
	List<PresupuestosDTO> buscarPresupuestos(@Param("id_presupuestos") Integer id_presupuestos,
										 	 @Param("username") String username,
											 @Param("cantidad_terreno") Integer cantidad_terreno,
											 @Param("fecha_presupuesto") String fecha_presupuesto,
											 @Param("comentario") String comentario,
											 @Param("disabled") Integer disabled);
	
}


