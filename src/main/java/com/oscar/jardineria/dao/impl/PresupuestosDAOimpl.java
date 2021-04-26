package com.oscar.jardineria.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.jardineria.daos.PresupuestosDAO;
import com.oscar.jardineria.dtos.PresupuestosDTO;
import com.oscar.jardineria.entities.PresupuestosEntity;
import com.oscar.jardineria.repositorios.PresupuestosRepository;

@Service
public class PresupuestosDAOimpl implements PresupuestosDAO{
	
	@Autowired
	private PresupuestosRepository presupuestosRepository;

	@Override
	public List<PresupuestosDTO> obtenerPresupuestos(Integer idPresupuestos, String username, Integer cantidadTerreno,
			String fechaPresupuesto, String comentario) {
		
		return presupuestosRepository.buscarPresupuestos(idPresupuestos, username, cantidadTerreno, fechaPresupuesto, comentario);
	}

	@Override
	public Integer insertarPresupuestos(Integer idPresupuestos, String username, Integer cantidadTerreno,
			String fechaPresupuesto, String comentario) {
		PresupuestosEntity presupuesto = new PresupuestosEntity(idPresupuestos, username, cantidadTerreno, fechaPresupuesto, comentario);
		presupuestosRepository.save(presupuesto);
		return null;
	}

	@Override
	public Integer actualizarPresupuestos(Integer idPresupuestos, String username, Integer cantidadTerreno,
			String fechaPresupuesto, String comentario) {
		PresupuestosEntity presupuesto = new PresupuestosEntity(idPresupuestos, username, cantidadTerreno, fechaPresupuesto, comentario);
		presupuestosRepository.save(presupuesto);
		return null;
	}

	@Override
	public Integer eliminarPresupuestos(Integer idPresupuestos) {
		presupuestosRepository.deleteById(idPresupuestos);
		return 1;
	}

}
