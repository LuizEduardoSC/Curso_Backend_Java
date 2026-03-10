/**
 * @author Eduardo
 */
package br.com.eduardo.controller;

import br.com.eduardo.domain.Cliente;
import br.com.eduardo.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private IClienteRepository clienteRepository;

	// Método para buscar todos os clientes no banco
	@GetMapping
	public ResponseEntity<List<Cliente>> listarTodos() {
		List<Cliente> clientes = clienteRepository.findAll();
		return ResponseEntity.ok(clientes);
	}

	// Método para salvar um novo cliente via JSON
	@PostMapping
	public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente) {
		Cliente clienteSalvo = clienteRepository.save(cliente);
		return ResponseEntity.ok(clienteSalvo);
	}
}