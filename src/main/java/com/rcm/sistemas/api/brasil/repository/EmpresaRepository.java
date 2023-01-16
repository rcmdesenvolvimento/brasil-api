package com.rcm.sistemas.api.brasil.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rcm.sistemas.api.brasil.models.entity.Empresa;

@FeignClient(url = "https://brasilapi.com.br/api/cnpj/v1/", name = "brasilapicnpj")
public interface EmpresaRepository {

	@GetMapping("{cnpj}")
	Empresa buscaEmpresa(@PathVariable("cnpj") String cnpj);

}
