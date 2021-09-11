package com.fiap.dimDimApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.dimDimApi.model.Boleto;
import com.fiap.dimDimApi.repository.BoletoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/boleto")
public class BoletoController {

	@Autowired
	private BoletoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Boleto>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Boleto> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Boleto> post (@RequestBody Boleto boleto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(boleto));
	}
	
	@PutMapping
	public ResponseEntity<Boleto> put (@RequestBody Boleto boleto){
		return ResponseEntity.ok(repository.save(boleto));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
