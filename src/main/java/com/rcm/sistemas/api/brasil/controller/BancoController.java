package com.rcm.sistemas.api.brasil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rcm.sistemas.api.brasil.models.entity.Banco;
import com.rcm.sistemas.api.brasil.service.BancoService;

@RestController
@RequestMapping("banco")
public class BancoController {

	@Autowired
	private BancoService bancoService;

	@GetMapping()
	public ResponseEntity<List<Banco>> getBanco() {

		List<Banco> banco = bancoService.buscaBanco();

		return banco != null ? ResponseEntity.ok().body(banco) : ResponseEntity.notFound().build();
	}

	@GetMapping("/{codigo}")
	public ResponseEntity<Banco> getBancoPorCodigo(@PathVariable String codigo) {

		Banco banco = bancoService.buscaBancoPorCodigo(codigo);

		return banco != null ? ResponseEntity.ok().body(banco) : ResponseEntity.notFound().build();
	}
	
	
	// Esse Get, só irá funcionar se o banco pesquisado, estiver salvo em uma tabela própria.
	@GetMapping("/{name}")
	public ResponseEntity<Banco> getBancoName(@PathVariable String name) {

		Banco banco = bancoService.findByName(name);

		return banco != null ? ResponseEntity.ok().body(banco) : ResponseEntity.notFound().build();
	}

}
