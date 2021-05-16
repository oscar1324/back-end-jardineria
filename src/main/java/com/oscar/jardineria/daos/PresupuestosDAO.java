package com.oscar.jardineria.daos;

import java.util.List;

import com.oscar.jardineria.dtos.PresupuestosDTO;


public interface PresupuestosDAO {
	

	List<PresupuestosDTO> obtenerPresupuestos(Integer idPresupuestos,String username,Integer cantidadTerreno,String fechaPresupuesto, String comentario, Integer disabled, Double precio);
	Integer insertarPresupuestos(Integer idPresupuestos,String username,Integer cantidadTerreno,String fechaPresupuesto, String comentario, Integer disabled, Double precio);
	Integer actualizarPresupuestos(Integer idPresupuestos,String username,Integer cantidadTerreno,String fechaPresupuesto, String comentario, Integer disabled, Double precio);
	Integer eliminarPresupuestos(Integer idPresupuestos);
	double obtenerCantidadTerreno( Integer cantidadTerreno);
	double obtenerPrecio( double precio);

}

