package com.Bcript.sesi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bcript.sesi.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	//para buscar por email, o JpaRepository não tem como função buscar email
	Usuario findByEmail(String email);
}
