package com.example.ProjetoComThymeleaf.controller;

import com.example.ProjetoComThymeleaf.Exception.UsuarioNaoEncotrando;
import com.example.ProjetoComThymeleaf.model.Usuario;
import com.example.ProjetoComThymeleaf.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EndPointUsuario {
    private UsuarioRepositorio usuarioRepositorio;
    @Autowired
    public EndPointUsuario(UsuarioRepositorio repositorio)
    {
        this.usuarioRepositorio = repositorio;
    }

    @GetMapping("login")
    public ModelAndView Login(Usuario usuario){
        ModelAndView md = new ModelAndView("pagina-inicial");

        return md;
    }
    @PostMapping("login")
    public ModelAndView salvaUsuario(Usuario usuario){
        ModelAndView md = new ModelAndView("pagina-inicial");
        ConferirUSER(usuario.getId());
        this.usuarioRepositorio.save(usuario);
        return md;
    }

    private void ConferirUSER(Long id){
        if (!this.usuarioRepositorio.existsById(id)){
            throw new UsuarioNaoEncotrando("usuario nao encontrado: "+id);
        }
    }


}
