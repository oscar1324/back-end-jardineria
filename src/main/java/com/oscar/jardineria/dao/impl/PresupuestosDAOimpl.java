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
			String fechaPresupuesto, String comentario, Integer disabled, Double precio) {
		
		return presupuestosRepository.buscarPresupuestos(idPresupuestos, username, cantidadTerreno, fechaPresupuesto, comentario,disabled, precio);
	}
	
	
	@Override
	public Integer insertarPresupuestos(Integer idPresupuestos, String username, Integer cantidadTerreno,
			String fechaPresupuesto, String comentario, Integer disabled, Double precio) {
		Optional<UserEntity> u = usuarioRepository.findById(username);		
		UserEntity usuario = u.get();
		
		PresupuestosEntity presupuesto = new PresupuestosEntity(idPresupuestos, usuario, cantidadTerreno, fechaPresupuesto, comentario,disabled,precio);
		presupuestosRepository.save(presupuesto);
		return null;
	}

	// Revisión, no actualiza bien para cambiar disabled
	@Override
	public Integer actualizarPresupuestos(Integer idPresupuestos, String username, Integer cantidadTerreno,
			String fechaPresupuesto, String comentario, Integer disabled, Double precio) {
		
		Optional<UserEntity> u = usuarioRepository.findById(username);		
		UserEntity usuario = u.get();
		
		PresupuestosEntity presupuesto = new PresupuestosEntity(idPresupuestos, usuario, cantidadTerreno, fechaPresupuesto, comentario,disabled,precio);
		presupuestosRepository.save(presupuesto);
		return null;
	}

	@Override
	public Integer eliminarPresupuestos(Integer idPresupuestos) {
		presupuestosRepository.deleteById(idPresupuestos);
		return 1;
	}

	@Override
	public double obtenerCantidadTerreno(Integer cantidadTerreno) {
		// TRATAR 
		//return presupuestosRepository.buscarPresupuestos(cantidad_terreno);
		return 0;
	}

	@Override
	public double obtenerPrecio(double precio) {
		// Preguntar ----- ES ERROENO
		Optional<PresupuestosEntity> presu = presupuestosRepository.findById((int) precio);
		PresupuestosEntity presupuesto = presu.get(); 
		return presupuesto.getPrecio();
	}
	




}
