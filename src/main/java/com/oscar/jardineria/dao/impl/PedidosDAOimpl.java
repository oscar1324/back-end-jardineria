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
	public List<PedidosDTO> obtenerPedidos(Integer idPedidos, String fechaPedido, String username) {
		
		return pedidosRepository.buscarPedidos(idPedidos, fechaPedido, username);
	}

	@Override
	public Integer insertarPedido(Integer idPedidos, String fechaPedido, String username) {
		
		PedidosEntity pedidos = new PedidosEntity(idPedidos, fechaPedido, username);
		pedidosRepository.save(pedidos);
		return null;
	}

	@Override
	public Integer actualizarPedido(Integer idPedidos, String fechaPedido, String username) {
		PedidosEntity pedidos = new PedidosEntity(idPedidos, fechaPedido, username);
		pedidosRepository.save(pedidos);
		return null;
	}

	@Override
	public Integer eliminarPedido(Integer idPedidos) {
		pedidosRepository.deleteById(idPedidos);
		return 1;
	}

}
