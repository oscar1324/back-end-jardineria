package com.oscar.jardineria.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;


import com.oscar.jardineria.daos.UserDAO;
import com.oscar.jardineria.dtos.UserDTO;
import com.oscar.jardineria.entities.UserEntity;
import com.oscar.jardineria.repositorios.UserRepository;

@Service
public class UserDAOimpl implements UserDAO{
	
	
	@Autowired
	private UserRepository userRepository;
	



	@Override
	public List<UserDTO> obtenerUsuariosporUsernameyTodo(String username, String password, Integer disabled) {
		return userRepository.buscarUsuario(username, password, disabled);
	
	}


	@Override
	public Integer insertarUsuario(String username, String password,  Integer disabled) {
		UserEntity user = new UserEntity(username, password, disabled);
		userRepository.save(user);
		return null;
	}


	@Override
	public Integer actualizarUsuario(String username, String password, Integer disabled) {
		UserEntity user = new UserEntity(username, password, disabled);
		userRepository.save(user);
		return null;
	}


	@Override
	public Integer eliminarUsuario(String username) {
		userRepository.deleteById(username);
		return 1;
	}
	



	









}
