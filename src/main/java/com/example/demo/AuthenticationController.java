package com.example.demo;

import org.springframework.http.ResponseEntity;

public class AuthenticationController{
    private UsuarioService usuarioService;

    public ResponseEntity<Usuario> create(Usuario user){
        return ResponseEntity.accepted().body(usuarioService.create(user));
    }

    public ResponseEntity<Usuario> read(Long id){
        return ResponseEntity.accepted().body(usuarioService.findOne(id));
    }

    public ResponseEntity<Usuario> update(Long id, Usuario user){
        Usuario user_ = usuarioService.findOne(id);
        user_ = user;
        return ResponseEntity.accepted().body(usuarioService.update(user_));
    }
}