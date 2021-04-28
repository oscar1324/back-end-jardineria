package com.oscar.jardineria.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.jardineria.daos.PresupuestosDAO;
import com.oscar.jardineria.dtos.PresupuestosDTO;
import com.oscar.jardineria.entities.PresupuestosEntity;
import com.oscar.jardineria.entities.UserEntity;
import com.oscar.jardineria.repositorios.PresupuestosRepository;
import com.oscar.jardineria.repositorios.UserRepository;

@Service
public class PresupuestosDAOimpl implements PresupuestosDAO{
	
	@Autowired
	private PresupuestosRepository presupuestosRepository;
	
	@Autowired
	private UserRepository usuarioRepository;

	@Override
	public List<PresupuestosDTO> obtenerPresupuestos(Integer idPresupuestos, String username, Integer cantidadTerreno,
			String fechaPresupuesto, String comentario) {
		
		return presupuestosRepository.buscarPresupuestos(idPresupuestos, username, cantidadTerreno, fechaPresupuesto, comentario);
	}

	@Override
	public Integer insertarPresupuestos(Integer idPresupuestos, String username, Integer cantidadTerreno,
			String fechaPresupuesto, String comentario) {
		Optional<UserEntity> u = usuarioRepository.findById(username);		
		UserEntity usuario = u.get();
		
		PresupuestosEntity presupuesto = new PresupuestosEntity(idPresupuestos, usuario, cantidadTerreno, fechaPresupuesto, comentario);
		presupuestosRepository.save(presupuesto);
		return null;
	}

	@Override
	public Integer actualizarPresupuestos(Integer idPresupuestos, String username, Integer cantidadTerreno,
			String fechaPresupuesto, String comentario) {
		
		Optional<UserEntity> u = usuarioRepository.findById(username);		
		UserEntity usuario = u.get();
		
		PresupuestosEntity presupuesto = new PresupuestosEntity(idPresupuestos, usuario, cantidadTerreno, fechaPresupuesto, comentario);
		presupuestosRepository.save(presupuesto);
		return null;
	}

	@Override
	public Integer eliminarPresupuestos(Integer idPresupuestos) {
		presupuestosRepository.deleteById(idPresupuestos);
		return 1;
	}

}
