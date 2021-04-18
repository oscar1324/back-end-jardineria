package com.oscar.jardineria.daos;

import java.util.List;

import com.oscar.jardineria.dtos.UserDTO;

public interface UserDAO {
	
	List<UserDTO> obtenerUsuariosporIdyNombre(Integer idusuarios, String usuario,Integer dni,String direccion,Integer telefono,String gmail, Integer famNumerosa);
	Integer insertarUsuario(Integer idusuarios, String usuario, Integer password, Integer dni, String direccion, String email, Integer telefono, Integer famNumerosa);
	Integer actualizarUsuario(Integer idusuarios, String usuario, Integer password, Integer dni, String direccion, String email, Integer telefono);
	Integer eliminarUsuario(Integer idusuarios);
	boolean familiaNumerosa(Integer idusuarios);
}
