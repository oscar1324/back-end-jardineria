package com.oscar.jardineria.daos;

import java.util.List;

import com.oscar.jardineria.dtos.DescuentosDTO;
import com.oscar.jardineria.dtos.PresupuestosDTO;

public interface DescuentosDAO {
	
	
	List<DescuentosDTO> obtenerDescuentos(Integer id_descuentos,Integer cantidad, Integer descuento);
	Integer insertarDescuentos(Integer id_descuentos, Integer cantidad, Integer descuento);
	Integer actualizarDescuentos(Integer id_descuentos,Integer cantidad, Integer descuento);
	Integer eliminarDescuentos(Integer id_descuentos);


}
