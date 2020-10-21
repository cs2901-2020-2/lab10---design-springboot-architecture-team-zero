package com.example.demo;

import java.util.List;

public class UsuarioService {
    private UsuarioRepository repository;

    public List<Usuario> findAll(){
        return repository.findAll();
    }
    public Usuario findOne(long id){
        return repository.findById(id);
    }
    public Usuario create(Usuario user){
        return repository.save(user);
    }
    public void delete(long id){
        repository.deleteById(id);
    }
    public Usuario buscarUsuario(String a, String b);
    public Usuario findOneByEmail(String email);
}