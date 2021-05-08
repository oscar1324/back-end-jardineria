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
	public List<PresupuestosDTO> obtenerPresupuestos(Integer id_presupuestos, String username, Integer cantidad_terreno,
			String fecha_presupuesto, String comentario, Integer disabled) {
		
		return presupuestosRepository.buscarPresupuestos(id_presupuestos, username, cantidad_terreno, fecha_presupuesto, comentario,disabled);
	}

	@Override
	public Integer insertarPresupuestos(Integer id_presupuestos, String username, Integer cantidad_terreno,
			String fecha_presupuesto, String comentario, Integer disabled) {
		Optional<UserEntity> u = usuarioRepository.findById(username);		
		UserEntity usuario = u.get();
		
		PresupuestosEntity presupuesto = new PresupuestosEntity(id_presupuestos, usuario, cantidad_terreno, fecha_presupuesto, comentario,disabled);
		presupuestosRepository.save(presupuesto);
		return null;
	}

	@Override
	public Integer actualizarPresupuestos(Integer id_presupuestos, String username, Integer cantidad_terreno,
			String fecha_presupuesto, String comentario, Integer disabled) {
		
		Optional<UserEntity> u = usuarioRepository.findById(username);		
		UserEntity usuario = u.get();
		
		PresupuestosEntity presupuesto = new PresupuestosEntity(id_presupuestos, usuario, cantidad_terreno, fecha_presupuesto, comentario,disabled);
		presupuestosRepository.save(presupuesto);
		return null;
	}

	@Override
	public Integer eliminarPresupuestos(Integer id_presupuestos) {
		presupuestosRepository.deleteById(id_presupuestos				);
		return 1;
	}

}
