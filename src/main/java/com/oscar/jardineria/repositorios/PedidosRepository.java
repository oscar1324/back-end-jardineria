package com.oscar.jardineria.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.oscar.jardineria.dtos.PedidosDTO;
import com.oscar.jardineria.entities.PedidosEntity;

/**
 * @author Óscar Izquierdo
 * Fichero que almacena la Query que obtiene todos los pedidos de la base de datos
 */

@Repository
public interface PedidosRepository extends CrudRepository<PedidosEntity, Integer>{
	
	@Query (value = "select new com.oscar.jardineria.dtos.PedidosDTO (p.id_pedidos, p.fecha_pedido, p.username) "
			+ "FROM com.oscar.jardineria.entities.PedidosEntity p "
			+ "WHERE (p.id_pedidos LIKE CONCAT ('%', :id_pedidos, '%') or :id_pedidos is null) "
			+ "AND p.fecha_pedido LIKE CONCAT ('%', :fecha_pedido, '%') "
			+ "AND p.username LIKE CONCAT ('%', :username, '%') "
			)
	
	List<PedidosDTO> buscarPedidos(
									@Param("id_pedidos") Integer id_pedidos,
									@Param("fecha_pedido") String fecha_pedido,
									@Param("username") String username
									);
							
	

}
