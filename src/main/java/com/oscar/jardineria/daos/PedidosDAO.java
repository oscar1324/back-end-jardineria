package com.oscar.jardineria.daos;

import java.util.List;

import com.oscar.jardineria.dtos.PedidosDTO;

public interface PedidosDAO {
	
	List<PedidosDTO> obtenerPedidos(Integer id_pedidos, String fecha_pedido, String username);
	Integer insertarPedido(Integer id_pedidos, String fecha_pedido, String username);
	Integer actualizarPedido(Integer id_pedidos, String fecha_pedido, String username);
	Integer eliminarPedido(Integer id_pedidos);

}
