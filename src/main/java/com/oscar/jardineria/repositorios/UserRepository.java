package com.oscar.jardineria.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.oscar.jardineria.dtos.UserDTO;
import com.oscar.jardineria.entities.UserEntity;

import java.util.List;

@Repository
public interface UserRepository  extends CrudRepository<UserEntity, Integer>{
	
	@Query(value = "select new com.oscar.jardineria.dtos.userDTO (u.idUsuarios, u.dni, u.direccion, u.telefono, u.email, u.fanNumerosa, u.usuario, u.password) "
			+ "FROM com.oscar.jardineria.entities.UserEntity u "
			+ "WHERE u.idUsuarios LIKE CONCAT ('%', :id, '%') or :id is null "
			+ "AND u.dni LIKE CONCAT ('%', :dni, '%') "
			+ "AND u.direccion LIKE CONCAT ('%', :direccion, '%') "
			+ "AND u.telefono LIKE CONCAT ('%', :telefono, '%') "
			+ "AND u.email LIKE CONCAT ('%', :email, '%') "
			+ "AND u.famNumerosa LIKE CONCAT ('%', :famNumerosa, '%') "
			+ "AND u.usuario LIKE CONCAT ('%', :usuario, '%') "
		)
	List<UserDTO>buscarUsuario( @Param("idUsuarios") Integer id,
								@Param("usuario" )String usuario,
								@Param("dni") Integer dni,
								@Param("direccion") String direccion,
								@Param("telefono") Integer telefono,
								@Param("email") String email,
								@Param("famNumerosa") Integer famNumerosa
								);
}



