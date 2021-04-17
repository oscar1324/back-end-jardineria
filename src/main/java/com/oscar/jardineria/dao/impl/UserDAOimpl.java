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
	public List<UserDTO> obtenerUsuariosporIdyNombre(Integer id, String usuario, Integer dni, String direccion,
			Integer telefono, String gmail, Integer famNumerosa) {
		return  userRepository.buscarUsuario(id, usuario, dni, direccion, telefono, gmail, famNumerosa);
	}


	@Override
	public Integer insertarUsuario(Integer id, String usuario, Integer password, Integer dni, String direccion,
			String email, Integer telefono, Integer famNumerosa) {
		
		famNumerosa = (famNumerosa == null)? 0 : 1;
		UserEntity user = new UserEntity(id, dni, direccion, telefono, email, famNumerosa, usuario, password);
		userRepository.save(user);
		return 1;
	}

	@Override
	public Integer actualizarUsuario(Integer id, String usuario, Integer password, Integer dni, String direccion,
			String email, Integer telefono) {
		UserEntity user = new UserEntity(id, dni, direccion, telefono, email, usuario, password);
		userRepository.save(user);
		return 1;
	}

	@Override
	public Integer eliminarUsuario(Integer id) {
		userRepository.deleteById(id);
		return 1;
	}

	@Override
	public boolean familiaNumerosa(Integer id) {
		Optional<UserEntity> a = userRepository.findById(id);
		UserEntity user = a.get();
		
		if(user.getFamNumerosa() == 1) {
			return true;
		}else {
			return false;
		}
	}



}
