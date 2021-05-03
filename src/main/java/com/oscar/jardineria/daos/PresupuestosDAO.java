package com.oscar.jardineria.daos;

import java.util.List;

import com.oscar.jardineria.dtos.PresupuestosDTO;


public interface PresupuestosDAO {
	
	
	List<PresupuestosDTO> obtenerPresupuestos(Integer id_presupuestos,String username,Integer cantidad_terreno,String fecha_presupuesto, String comentario);
	Integer insertarPresupuestos(Integer id_presupuestos,String username,Integer cantidad_terreno,String fecha_presupuesto, String comentario);
	Integer actualizarPresupuestos(Integer id_presupuestos,String username,Integer cantidad_terreno,String fecha_presupuesto, String comentario);
	Integer eliminarPresupuestos(Integer id_presupuestos);

}

