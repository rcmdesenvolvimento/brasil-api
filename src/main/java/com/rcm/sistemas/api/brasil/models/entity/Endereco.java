package com.rcm.sistemas.api.brasil.models.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonPropertyOrder({ "cep", "street", "neighborhood", "city", "state" })
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("cep")
	private String cep;

	@JsonProperty("state") // estado
	private String state; 

	@JsonProperty("city") // cidade 
	private String city;

	@JsonProperty("neighborhood") // bairro
	private String neighborhood; 

	@JsonProperty("street") // logradouro
	private String street;

}
