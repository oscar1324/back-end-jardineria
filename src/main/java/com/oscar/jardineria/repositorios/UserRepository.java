package com.oscar.jardineria.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.oscar.jardineria.dtos.UserDTO;
import com.oscar.jardineria.entities.ServiciosEntity;
import com.oscar.jardineria.entities.UserEntity;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {
	
	@Query(value = "select new com.oscar.jardineria.dtos.UserDTO (u.username, u.password,u.enabled, u.nombre, u.apellido, u.direccion ) "
			+ "FROM com.oscar.jardineria.entities.UserEntity u "
			+ "WHERE (u.username LIKE CONCAT ('%', :username, '%') or :username is null) "
			+ "AND u.password LIKE CONCAT ('%', :password, '%') "
			+ "AND u.enabled LIKE CONCAT ('%', :enabled, '%') "
			+ "AND u.nombre LIKE CONCAT ('%', :nombre, '%') "
			+ "AND u.apellido LIKE CONCAT ('%', :apellido, '%') "
			+ "AND u.direccion LIKE CONCAT ('%', :direccion, '%') "

		)
	List<UserDTO>buscarUsuario( @Param("username") String username,
								@Param("password" )String password,
								@Param("enabled") Integer enabled,
								@Param("nombre") String nombre,
								@Param("apellido") String apellido,
								@Param("direccion") String direccion

								);



}



