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
	
	@Query(value = "select new com.oscar.jardineria.dtos.userDTO (u.idUsuarios, u.dni, u.direccion, u.telefono, u.email, u.fanNumerosa, u.usuario, u.password)"
			+ "FROM com.oscar.jardineria.entities.UserEntity u"
			+ "WHERE u.id LIKE CONCAT ('%', :id, '%') "
			+ "AND u.id LIKE CONCAT ('%', :id, '%') ")
	List<UserDTO>buscarUsuario( @Param("id") Integer id,
			
			
								@Param("usuario" )String nombre);

}



