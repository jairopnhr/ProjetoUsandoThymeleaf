package com.example.ProjetoComThymeleaf.model;

import org.hibernate.annotations.Cascade;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

@Entity
public class Usuario extends
        ModeloGenerico
        implements UserDetails {

    @Column(name = "Nome")
    private String nome;
    @Column(name = "Email")
    private String email;

    @Column(name = "DataDeNascimento")
    private Date DataNascimento;

    @Column(name = "Cidade")
    private String cidade;

    @Lob
    @Column(name = "imagem")
    private byte[] imagem;
    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Pokemon>pk;
    @Column(name = "QuantidadeDePokemons")
    private  Integer qtdPokemon ;
    @Enumerated(EnumType.STRING)
    private TipoPS tipoPS;
    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public List<Pokemon> getPk() {
        return pk;
    }

    public void setPk(List<Pokemon> pk) {
        this.pk = pk;
    }

    public Integer getQtdPokemon() {
        return qtdPokemon;
    }

    public void setQtdPokemon(Integer qtdPokemon) {
        this.qtdPokemon = qtdPokemon;
    }

    public TipoPS getTipoPS() {
        return tipoPS;
    }

    public void setTipoPS(TipoPS tipoPS) {
        this.tipoPS = tipoPS;
    }

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

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "senha")
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
