package com.example.controller;

import com.example.business.UsuarioService;
import com.example.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/users")
public class AuthenticationController{

    @Autowired
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

    @SpringBootApplication
    @ComponentScan({"com.example.business"})
    public static class ServiceApplication extends SpringBootServletInitializer {
        static final Logger logger = Logger.getLogger(ServiceApplication.class.getName());

        public static void main(String[] args) {
            SpringApplication.run(ServiceApplication.class, args);
        }

    }
}