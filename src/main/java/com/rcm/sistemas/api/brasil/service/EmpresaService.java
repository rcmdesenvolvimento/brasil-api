package com.rcm.sistemas.api.brasil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcm.sistemas.api.brasil.models.entity.Empresa;
import com.rcm.sistemas.api.brasil.repository.EmpresaRepository;

@Service
public class EmpresaService implements EmpresaRepository {

	@Autowired
	private EmpresaRepository empresaRepository;

	@Override
	public Empresa buscaEmpresa(String cnpj) {
		return empresaRepository.buscaEmpresa(cnpj);
	}

}
