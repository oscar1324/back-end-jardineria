package com.oscar.jardineria.daos;

import java.util.List;

import com.oscar.jardineria.dtos.UserDTO;

public interface UserDAO {
	
	List<UserDTO> obtenerUsuariosporUsernameyTodo(String username, String password, Integer disabled);
	Integer insertarUsuario(String username, String password , Integer disabled);
	Integer actualizarUsuario(String username, String password, Integer disabled);
	Integer eliminarUsuario(String username);

}
