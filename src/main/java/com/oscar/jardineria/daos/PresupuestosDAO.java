package com.oscar.jardineria.daos;

import java.util.List;

import com.oscar.jardineria.dtos.PresupuestosDTO;


public interface PresupuestosDAO {
	
	
	List<PresupuestosDTO> obtenerPresupuestos(Integer id_presupuestos,String username,Integer cantidad_terreno,String fecha_presupuesto, String comentario, Integer disabled, Double precio);
	Integer insertarPresupuestos(Integer id_presupuestos,String username,Integer cantidad_terreno,String fecha_presupuesto, String comentario, Integer disabled, Double precio);
	Integer actualizarPresupuestos(Integer id_presupuestos,String username,Integer cantidad_terreno,String fecha_presupuesto, String comentario, Integer disabled, Double precio);
	Integer eliminarPresupuestos(Integer id_presupuestos);
	Integer obtenerPresupuestos2(Integer id_presupuestos, String username, Integer cantidad_terreno);

}

