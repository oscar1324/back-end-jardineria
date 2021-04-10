package com.oscar.jardineria.daos;

import java.util.List;

import com.oscar.jardineria.dtos.UserDTO;

public interface UserDAO {
	
	List<UserDTO> obtenerUusariosporIdyNombre(Integer id, String nombre);
	Integer insertarUsuario(Integer id, String usuario, Integer password, Integer dni, String direccion, String email, Integer telefono, Integer famNumerosa);
	Integer actualizarUsuario(Integer id, String usuario, Integer password, Integer dni, String direccion, String email, Integer telefono);
	Integer eliminarUsuario(Integer id);
	boolean familiaNumerosa(Integer id);
}
