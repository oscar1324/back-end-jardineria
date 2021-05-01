package com.oscar.jardineria.daos;

import java.util.List;
import com.oscar.jardineria.dtos.PresupuestosDTO;

public interface DescuentosDAO {
	
	
	List<PresupuestosDTO> obtenerDescuentos(Integer idDescuentos,Integer cantidad, Integer descuento, String tipo);
	Integer insertarDescuentos(Integer idDescuentos, Integer cantidad, Integer descuento, String tipo);
	Integer actualizarDescuentos(Integer idDescuentos,Integer cantidad, Integer descuento, String tipo);
	Integer eliminarDescuentos(Integer idDescuentos);


}
