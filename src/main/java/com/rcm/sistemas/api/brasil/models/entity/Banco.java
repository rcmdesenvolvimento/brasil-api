package com.rcm.sistemas.api.brasil.models.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Banco implements Serializable {

	private static final long serialVersionUID = 1L;

	private String ispb;
	private String name;
	private float code;
	private String fullName;

}
