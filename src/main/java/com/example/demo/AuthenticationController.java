package com.example.demo;

import org.springframework.http.ResponseEntity;

public class AuthenticationController{
    private UsuarioService usuarioService;

    public ResponseEntity<Usuario> create(Usuario user){
        return usuarioService.create(user);
    }

    public ResponseEntity<Usuario> read(Long id){
        return usuarioService.findOne(id);
    }

    public ResponseEntity<Usuario> update(Long id, Usuario user){
        Usuario user_ = usuarioService.findOne(id);
        user_ = user;
        return usuarioService.update(user_);
    }
}