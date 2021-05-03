package com.oscar.jardineria.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oscar.jardineria.entities.PedidosEntity;
import com.oscar.jardineria.repositorios.PedidosRepository;

/**
 * @author Óscar Izquierdo
 * Controller de los pedidos
 */

@RestController
@RequestMapping("/v1")
public class PedidosController {
	
	@Autowired
	private PedidosRepository pedidosRepository;
	
	// INSERTAR -----------------------------------------------------------------------
	@PostMapping(value ="/pedidos")
	public ResponseEntity<String> insertarPedido(@RequestBody PedidosEntity pedidos) {
		pedidosRepository.save(pedidos);
		return new ResponseEntity<>("Inserción de pedido correcta", HttpStatus.OK);
	}
	
	// LISTAR -----------------------------------------------------------------------
	
	@GetMapping(value= "/pedidos")
	public Iterable<PedidosEntity> listarPedidos() {
		return pedidosRepository.findAll();
	}
	
	@GetMapping(value = "/pedidos/{id_pedidos}")
	public Optional<PedidosEntity> listarUsuarioporID( @PathVariable("id_pedidos") Integer id_pedidos){
		return pedidosRepository.findById(id_pedidos);
	}
	
	
	// ACTUALIZAR -----------------------------------------------------------------------
	
	@PutMapping(value="/pedidos")
	public ResponseEntity<String> actualizarPedido( @RequestBody PedidosEntity pedidos){
		pedidosRepository.save(pedidos);
		return new ResponseEntity<String> ("Actualización correcta de pedido", HttpStatus.OK);
	}
	
	// BORRAR -----------------------------------------------------------------------
	
	@DeleteMapping(value="/pedidos/{id_pedidos}")
	public ResponseEntity<String> borrarUsuario (@PathVariable("id_pedidos") Integer id_pedidos){
		pedidosRepository.deleteById(id_pedidos);
		return new ResponseEntity<> ("Pedido borrado con exito", HttpStatus.OK);
	}

}
