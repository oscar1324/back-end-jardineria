package com.oscar.jardineria.daos;

import java.util.List;

import com.oscar.jardineria.dtos.PedidosDTO;

public interface PedidosDAO {
	
	List<PedidosDTO> obtenerPedidos(Integer idPedidos, String fechaPedido, String username);
	Integer insertarPedido(Integer idPedidos, String fechaPedido, String username);
	Integer actualizarPedido(Integer idPedidos, String fechaPedido, String username);
	Integer eliminarPedido(Integer idPedidos);

}
