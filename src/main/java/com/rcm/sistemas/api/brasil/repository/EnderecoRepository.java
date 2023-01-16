package com.rcm.sistemas.api.brasil.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rcm.sistemas.api.brasil.models.entity.Endereco;

@FeignClient(url = "https://brasilapi.com.br/api/cep/v2/", name = "brasilapicep")
public interface EnderecoRepository {

	@GetMapping("{cep}")
	Endereco buscaEndereco(@PathVariable("cep") String cep);

}
