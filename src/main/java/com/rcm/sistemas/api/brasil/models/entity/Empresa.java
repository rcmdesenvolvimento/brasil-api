package com.rcm.sistemas.api.brasil.models.entity;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;

	private String uf;
	private String cep;
	ArrayList<Object> qsa = new ArrayList<Object>();
	private String cnpj;
	private String pais = null;
	private String email = null;
	private String porte;
	private String bairro;
	private String numero;
	private String municipio;
	private String logradouro;
	private float cnae_fiscal;
	private String complemento;
	private float codigo_porte;
	private String razao_social;
	private String nome_fantasia;
	private float capital_social;
	private float codigo_municipio;

}
