package com.rcm.sistemas.api.brasil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rcm.sistemas.api.brasil.models.entity.Endereco;
import com.rcm.sistemas.api.brasil.service.EnderecoService;

@RestController
@RequestMapping("cep")
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;

	@GetMapping("/{cep}")
	public ResponseEntity<Endereco> getCep(@PathVariable String cep) {

		Endereco endereco = enderecoService.buscaEndereco(cep);

		return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();
	}

}
