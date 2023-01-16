package com.rcm.sistemas.api.brasil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcm.sistemas.api.brasil.models.entity.Banco;
import com.rcm.sistemas.api.brasil.repository.BancoRepository;

@Service
public class BancoService implements BancoRepository {

	@Autowired
	private BancoRepository bancoRepository;

	@Override
	public Banco buscaBancoPorCodigo(String codigo) {
		return bancoRepository.buscaBancoPorCodigo(codigo);
	}

	@Override
	public List<Banco> buscaBanco() {
		return bancoRepository.buscaBanco();
	}

	@Override
	public Banco findByName(String name) {
		return bancoRepository.findByName(name);
	}

}
