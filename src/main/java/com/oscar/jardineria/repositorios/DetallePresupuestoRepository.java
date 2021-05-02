package com.oscar.jardineria.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.oscar.jardineria.dtos.DetallePresupuestoDTO;
import com.oscar.jardineria.entities.DetallePresupuestosEntity;

@Repository
public interface DetallePresupuestoRepository extends CrudRepository<DetallePresupuestosEntity, Integer>{
	
	@Query( value = "select new com.oscar.jardineria.dtos.DetallePresupuestoDTO (d.idDetallePresupuesto, s.idServicios, p.idPresupuestos) "
			+ "FROM com.oscar.jardineria.entities.DetallePresupuestosEntity d JOIN com.oscar.jardineria.entities.ServiciosEntity s JOIN com.oscar.jardineria.entities.PresupuestosEntity p "
			+ "WHERE (d.idDetallePresupuesto LIKE CONCAT ('%', :idDetallePresupuesto, '%') or :idDetallePresupuesto is null) "
			+ "AND s.idServicios LIKE CONCAT ('%', :idServicios, '%') "
			+ "AND p.idPresupuestos LIKE CONCAT ('%', :idPresupuestos, '%') "
			)
	List<DetallePresupuestoDTO> buscardetallesPresupuesto(
			@Param("idDetallePresupuesto") Integer idDetallePresupuesto,
			@Param("idServicios") Integer idServicios,
			@Param("idPresupuestos") Integer idPresupuestos
			);
	
	


}
