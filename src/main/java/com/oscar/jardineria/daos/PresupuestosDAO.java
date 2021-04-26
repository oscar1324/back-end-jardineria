package com.oscar.jardineria.daos;

import java.util.List;

import com.oscar.jardineria.dtos.PresupuestosDTO;


public interface PresupuestosDAO {
	
	
	List<PresupuestosDTO> obtenerPresupuestos(Integer idPresupuestos,String username,Integer cantidadTerreno,String fechaPresupuesto, String comentario);
	Integer insertarPresupuestos(Integer idPresupuestos,String username,Integer cantidadTerreno,String fechaPresupuesto, String comentario);
	Integer actualizarPresupuestos(Integer idPresupuestos,String username,Integer cantidadTerreno,String fechaPresupuesto, String comentario);
	Integer eliminarPresupuestos(Integer idPresupuestos);

}

