package com.oscar.jardineria.daos;

import java.util.List;

import com.oscar.jardineria.dtos.PresupuestosDTO;


public interface PresupuestosDAO {
	

	List<PresupuestosDTO> obtenerPresupuestos(Integer idPresupuestos,String username,Integer cantidadTerreno,String fechaPresupuesto, String comentario, Integer disabled, Double precio,Integer idServicios);
	Integer insertarPresupuestos(Integer idPresupuestos,String username,Integer cantidadTerreno,String fechaPresupuesto, String comentario, Integer disabled, Double precio ,Integer idServicios);
	Integer actualizarPresupuestos(Integer idPresupuestos,String username,Integer cantidadTerreno,String fechaPresupuesto, String comentario, Integer disabled, Double precio ,Integer idServicios);
	Integer eliminarPresupuestos(Integer idPresupuestos);
	double obtenerCantidadTerreno( Integer cantidadTerreno);
	double obtenerPrecio( double precio);

}

