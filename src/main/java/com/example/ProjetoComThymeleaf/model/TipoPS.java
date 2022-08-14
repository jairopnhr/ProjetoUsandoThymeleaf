package com.example.ProjetoComThymeleaf.model;

public enum TipoPS {
ADM("ADM",1),
    USER("USER",2);
String tp;
Integer cd ;
    TipoPS(String tp, Integer cd){
    this.cd = cd ;
    this.tp = tp ;
}
public String getTp(){return this.tp;}

}