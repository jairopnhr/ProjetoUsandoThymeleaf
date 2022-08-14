package com.example.ProjetoComThymeleaf.repository;

import com.example.ProjetoComThymeleaf.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario , Long> {

}
