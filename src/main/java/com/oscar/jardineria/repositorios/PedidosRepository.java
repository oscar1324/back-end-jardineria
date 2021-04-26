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
	
	@Query (value = "select new com.oscar.jardineria.dtos.PedidosDTO (p.idPedidos, p.fechaPedido, p.comentario, p.username) "
			+ "FROM com.oscar.jardineria.entities.PedidosEntity p "
			+ "WHERE (p.idPedidos LIKE CONCAT ('%', :idPedidos, '%') or :idPedidos is null) "
			+ "AND p.fechaPedido LIKE CONCAT ('%', :fechaPedido, '%') "
			+ "AND p.comentario LIKE CONCAT ('%', :comentario, '%') "
			+ "AND p.username LIKE CONCAT ('%', :username, '%') "
			)
	
	List<PedidosDTO> buscarPedidos(
									@Param("idPedidos") Integer idPedidos,
									@Param("fechaPedido") String fechaPedido,
									@Param("comentario") String comentario,
									@Param("username") String username
									);
							
	

}
