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
	
	@Query( value =" select new com.oscar.jardineria.dtos.PresupuestosDTO (p.idPresupuestos, u.username, p.cantidadTerreno, p.fechaPresupuesto, p.comentario, p.disabled, p.precio) "
			+"FROM com.oscar.jardineria.entities.PresupuestosEntity p JOIN com.oscar.jardineria.entities.UserEntity u ON p.idPresupuestos = u.username "
			+"WHERE (p.idPresupuestos LIKE CONCAT ('%', :idPresupuestos, '%') or :idPresupuestos is null) "
			+"AND u.username LIKE CONCAT ('%', :username, '%') "
			+"AND p.cantidadTerreno LIKE CONCAT ('%', :cantidadTerreno, '%') "
			+"AND p.fechaPresupuesto LIKE CONCAT ('%', :fechaPresupuesto, '%') "
			+"AND p.comentario LIKE CONCAT ('%', :comentario, '%') "
			+"AND p.disabled LIKE CONCAT ('%', :disabled, '%') "
			+"AND p.precio LIKE CONCAT ('%', :precio, '%') "
			
			)
	List<PresupuestosDTO> buscarPresupuestos(@Param("idPresupuestos") Integer idPresupuestos,
										 	 @Param("username") String username,
											 @Param("cantidadTerreno") Integer cantidadTerreno,
											 @Param("fechaPresupuesto") String fechaPresupuesto,
											 @Param("comentario") String comentario,
											 @Param("disabled") Integer disabled,
											 @Param("precio") Double precio);

	
	//List<PresupuestosDTO> buscarCantidades(@Param("precio") Double precio);
	//double buscarPresupuestos(@Param("cantidad_terreno") Integer cantidad_terreno);
	


	
	
}


