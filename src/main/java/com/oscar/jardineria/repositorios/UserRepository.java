package com.oscar.jardineria.repositorios;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.oscar.jardineria.dtos.UserDTO;
import com.oscar.jardineria.entities.UserEntity;

import java.util.List;

/**
 * @author Óscar Izquierdo
 * Fichero que almacena la Query que obtiene todos los usuarios de la base de datos
 */

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {
	
	@Query(value = "select new com.oscar.jardineria.dtos.UserDTO (u.username, u.password, u.disabled ) "
			+ "FROM com.oscar.jardineria.entities.UserEntity u "
			+ "WHERE (u.username LIKE CONCAT ('%', :username, '%') or :username is null) "
			+ "AND u.password LIKE CONCAT ('%', :password, '%') "
			+ "AND u.disabled LIKE CONCAT ('%', :disabled, '%') "


		)
	List<UserDTO>buscarUsuario( @Param("username") String username,
								@Param("password" )String password,
								@Param("disabled" )Integer disabled

								);



}



