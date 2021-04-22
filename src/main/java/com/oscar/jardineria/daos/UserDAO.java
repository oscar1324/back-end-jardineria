package com.oscar.jardineria.daos;

import java.util.List;

import com.oscar.jardineria.dtos.UserDTO;

public interface UserDAO {
	
	List<UserDTO> obtenerUsuariosporUsernameyTodo(String username, String password,Integer enabled,String nombre,String apellido,String direccion);
	Integer insertarUsuario(String username, String password,Integer enabled,String nombre,String apellido,String direccion);
	Integer actualizarUsuario(String username, String password,Integer enabled,String nombre,String apellido,String direccion);
	Integer eliminarUsuario(Integer username);

}
