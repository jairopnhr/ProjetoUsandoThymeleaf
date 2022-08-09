package com.example.ProjetoComThymeleaf.Exception;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNaoEncotrando extends RuntimeException {
    public UsuarioNaoEncotrando(String s)
    {
        super(s);
    }



}
