package com.oscar.jardineria.daos;
import java.util.List;

import com.oscar.jardineria.dtos.ServiciosDTO;

public interface ServiciosDAO {
	
	List<ServiciosDTO> obtenerServicios(Integer idServicios, String descripcionServicio, Integer precioMetro);
	Integer insertarServicio(Integer idServicios, String descripcionServicio, Integer precioMetro);
	Integer actualizarServicio(Integer idServicios, String descripcionServicio, Integer precioMetro);
	Integer borrarServicio(Integer idServicios);
	

}
