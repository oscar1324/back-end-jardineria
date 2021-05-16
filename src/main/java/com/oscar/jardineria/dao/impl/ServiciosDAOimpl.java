package com.oscar.jardineria.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.jardineria.daos.ServiciosDAO;
import com.oscar.jardineria.dtos.ServiciosDTO;
import com.oscar.jardineria.entities.ServiciosEntity;
import com.oscar.jardineria.repositorios.ServiciosRepository;

@Service
public class ServiciosDAOimpl implements ServiciosDAO{
	@Autowired
	private ServiciosRepository servicioRepository;
	

	@Override
	public List<ServiciosDTO> obtenerServicios(Integer idServicios, String descripcionServicio, Integer precioMetro) {
		
		return servicioRepository.buscarServicios(idServicios, descripcionServicio, precioMetro);
	}

	@Override
	public Integer insertarServicio(Integer idServicios, String descripcionServicio, Integer precioMetro) {
		
		ServiciosEntity servicio = new ServiciosEntity(idServicios, descripcionServicio, precioMetro);
		servicioRepository.save(servicio);

		return null;
	}

	@Override
	public Integer actualizarServicio(Integer idServicios, String descripcionServicio, Integer precioMetro) {
		ServiciosEntity rr = new ServiciosEntity(idServicios, descripcionServicio, precioMetro);
		servicioRepository.save(rr);
		return null;
	}

	@Override
	public Integer borrarServicio(Integer id_servicios) {
		servicioRepository.deleteById(id_servicios);
		return 1;
	}

}
