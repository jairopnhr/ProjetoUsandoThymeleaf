package com.example.ProjetoComThymeleaf.model.dto;

import com.example.ProjetoComThymeleaf.model.Usuario;

public class UsuarioDTO {
private String nome;
private String email;
private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Usuario toUsuario(){
        Usuario usuario = new Usuario();
        usuario.setEmail(this.email);
        usuario.setNome(this.nome);

        return usuario;
    }
}
