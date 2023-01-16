package com.rcm.sistemas.api.brasil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcm.sistemas.api.brasil.models.entity.Endereco;
import com.rcm.sistemas.api.brasil.repository.EnderecoRepository;

@Service
public class EnderecoService implements EnderecoRepository {

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Override
	public Endereco buscaEndereco(String cep) {

		Endereco endereco = this.enderecoRepository.buscaEndereco(cep);

		return endereco;
	}

}
