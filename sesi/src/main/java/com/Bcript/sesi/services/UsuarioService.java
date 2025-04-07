package com.Bcript.sesi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Bcript.sesi.dto.UsuarioDTO;
import com.Bcript.sesi.entities.Usuario;
import com.Bcript.sesi.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	//para salvar usuario o banco de dados
	@Autowired
	UsuarioRepository usuarioRepository;
	
	//implementar para codificar a senha 
	@Autowired
	PasswordEncoder config;
	
	//salvar usuario
	public UsuarioDTO salvarUsuario(UsuarioDTO dto) {
		//criar um novo usuario
		Usuario usuario = new Usuario();
		
		//verificar o email
		usuario.setEmail(dto.getEmail());
		
		//verificar a senha
		usuario.setSenha(config.encode(dto.getSenha()));
		
		usuario = usuarioRepository.save(usuario);
		
		return new UsuarioDTO(usuario); 
	}
	public boolean login(UsuarioDTO dto) {
		
		Usuario usuario = usuarioRepository.findByEmail(dto.getEmail());
		if (usuario == null) {
		return false;
		}
		
		return config.matches(dto.getSenha(), usuario.getSenha());	
		
	}

}
