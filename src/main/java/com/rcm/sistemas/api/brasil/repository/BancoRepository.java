package com.rcm.sistemas.api.brasil.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rcm.sistemas.api.brasil.models.entity.Banco;

@FeignClient(url = "https://brasilapi.com.br/api/banks/v1/", name = "brasilapibanco")
public interface BancoRepository {

	@GetMapping("{codigo}")
	Banco buscaBancoPorCodigo(@PathVariable("codigo") String codigo);

	@GetMapping()
	List<Banco> buscaBanco();

	@GetMapping("{name}")
	Banco findByName(@PathVariable("name") String name);

}
