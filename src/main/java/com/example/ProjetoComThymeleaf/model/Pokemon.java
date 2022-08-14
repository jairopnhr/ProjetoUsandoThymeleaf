package com.example.ProjetoComThymeleaf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
public class Pokemon extends ModeloGenerico{
    public Pokemon() {
    }
    @Column(name = "Nome")
    private String Nome;
    @Enumerated
    private TipoPK tipoPK ;
    @ManyToOne(optional = true)
    private Usuario usuario;

}
