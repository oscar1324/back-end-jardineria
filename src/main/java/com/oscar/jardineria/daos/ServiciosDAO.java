package com.oscar.jardineria.daos;
import java.util.List;

import com.oscar.jardineria.dtos.ServiciosDTO;

public interface ServiciosDAO {
	
	List<ServiciosDTO> obtenerServicios(Integer id_servicios, String descripcion_servicio, Integer precio_metro);
	Integer insertarServicio(Integer id_servicios, String descripcion_servicio, Integer precio_metro);
	Integer actualizarServicio(Integer id_servicios, String descripcion_servicio, Integer precio_metro);
	Integer borrarServicio(Integer id_servicios);
	

}
