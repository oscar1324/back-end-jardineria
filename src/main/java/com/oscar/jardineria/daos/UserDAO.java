package com.oscar.jardineria.daos;

import java.util.List;

import com.oscar.jardineria.dtos.UserDTO;

public interface UserDAO {
	
	List<UserDTO> obtenerUsuariosporIdyNombre(Integer id, String usuario,Integer dni,String direccion,Integer telefono,String gmail, Integer famNumerosa);
	Integer insertarUsuario(Integer id, String usuario, Integer password, Integer dni, String direccion, String email, Integer telefono, Integer famNumerosa);
	Integer actualizarUsuario(Integer id, String usuario, Integer password, Integer dni, String direccion, String email, Integer telefono);
	Integer eliminarUsuario(Integer id);
	boolean familiaNumerosa(Integer id);
}
