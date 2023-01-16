package com.rcm.sistemas.api.brasil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rcm.sistemas.api.brasil.models.entity.Empresa;
import com.rcm.sistemas.api.brasil.service.EmpresaService;

@RestController
@RequestMapping("cnpj")
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;

	@GetMapping("/{cnpj}")
	public ResponseEntity<Empresa> getCbpj(@PathVariable String cnpj) {

		Empresa empresa = empresaService.buscaEmpresa(cnpj);

		return empresa != null ? ResponseEntity.ok().body(empresa) : ResponseEntity.notFound().build();
	}

}
