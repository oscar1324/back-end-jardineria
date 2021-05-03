package com.oscar.jardineria.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.jardineria.daos.DescuentosDAO;
import com.oscar.jardineria.dtos.DescuentosDTO;
import com.oscar.jardineria.dtos.PresupuestosDTO;
import com.oscar.jardineria.entities.DescuentosEntity;
import com.oscar.jardineria.repositorios.DescuentosRepository;

@Service
public class DescuentosDAOimpl implements DescuentosDAO{
	
	@Autowired
	private DescuentosRepository descuentosRepository;

	@Override
	public List<DescuentosDTO> obtenerDescuentos(Integer id_descuentos, Integer cantidad,
			Integer descuento) {
		
		return descuentosRepository.buscarDescuento(id_descuentos, cantidad, descuento);
	}

	@Override
	public Integer insertarDescuentos(Integer id_descuentos, Integer cantidad, Integer descuento) {
		
		DescuentosEntity descuentos = new DescuentosEntity(id_descuentos, cantidad, descuento);
		descuentosRepository.save(descuentos);
		return null;
	}

	@Override
	public Integer actualizarDescuentos(Integer id_descuentos, Integer cantidad, Integer descuento) {
		DescuentosEntity descuentos = new DescuentosEntity(id_descuentos, cantidad, descuento);
		descuentosRepository.save(descuentos);
		return null;
	}

	@Override
	public Integer eliminarDescuentos(Integer id_descuentos) {
		descuentosRepository.deleteById(id_descuentos);
		return null;
	}


	

}
