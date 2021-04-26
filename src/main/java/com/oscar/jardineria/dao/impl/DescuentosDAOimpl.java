package com.oscar.jardineria.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.jardineria.daos.DescuentosDAO;
import com.oscar.jardineria.dtos.PresupuestosDTO;
import com.oscar.jardineria.repositorios.DescuentosRepository;

@Service
public class DescuentosDAOimpl implements DescuentosDAO{
	
	@Autowired
	private DescuentosRepository descuentosRepository;

	@Override
	public List<PresupuestosDTO> obtenerDescuentos(Integer idDescuentos, Integer idServicios, Integer cantidad,
			Integer descuento, String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insertarDescuentos(Integer idDescuentos, Integer idServicios, Integer cantidad, Integer descuento,
			String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer actualizarDescuentos(Integer idDescuentos, Integer idServicios, Integer cantidad, Integer descuento,
			String tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer eliminarDescuentos(Integer idDescuentos) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
