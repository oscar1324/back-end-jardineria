package com.oscar.jardineria.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.jardineria.daos.PedidosDAO;
import com.oscar.jardineria.dtos.PedidosDTO;
import com.oscar.jardineria.entities.PedidosEntity;
import com.oscar.jardineria.repositorios.PedidosRepository;

@Service
public class PedidosDAOimpl implements PedidosDAO{
	
	@Autowired
	private PedidosRepository pedidosRepository;
	
	

	@Override
	public List<PedidosDTO> obtenerPedidos(Integer id_pedidos, String fecha_pedido, String username) {
		
		return pedidosRepository.buscarPedidos(id_pedidos, fecha_pedido, username);
	}

	@Override
	public Integer insertarPedido(Integer id_pedidos, String fecha_pedido, String username) {
		
		PedidosEntity pedidos = new PedidosEntity(id_pedidos, fecha_pedido, username);
		pedidosRepository.save(pedidos);
		return null;
	}

	@Override
	public Integer actualizarPedido(Integer id_pedidos, String fecha_pedido, String username) {
		PedidosEntity pedidos = new PedidosEntity(id_pedidos, fecha_pedido, username);
		pedidosRepository.save(pedidos);
		return null;
	}

	@Override
	public Integer eliminarPedido(Integer id_pedidos) {
		pedidosRepository.deleteById(id_pedidos);
		return 1;
	}

}
