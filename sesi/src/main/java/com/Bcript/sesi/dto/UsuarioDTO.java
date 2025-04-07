package com.Bcript.sesi.dto;

import com.Bcript.sesi.entities.Usuario;

public class UsuarioDTO {
	private Long id;
	private String senha;
	private String email;
	
	//construtor vazio
	public UsuarioDTO() {
	}
	//construtor normal
	public UsuarioDTO(Long id, String senha, String email) {
		this.id = id;
		this.senha = senha;
		this.email = email;
	}
	//construtor para entidade fazer o get
	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		senha = entity.getSenha();
		email = entity.getEmail();
	}
	
	//get e setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
