package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class UsuarioService {
    private UsuarioRepository repository;

    public List<Usuario> findAll(){
        List<Usuario> users = new ArrayList<>();
        for (Usuario user : repository.findAll())
            users.add(user);
        return users;
    }
    public Usuario findOne(long id){
        if (repository.findById(id).isPresent())
            return repository.findById(id).get();
        else throw new NoSuchElementException();
    }
    public Usuario create(Usuario user){
        return repository.save(user);
    }

    public Usuario update(Usuario user){
        return repository.save(user);
    }

    public void delete(long id){
        repository.deleteById(id);
    }
    public Usuario buscarUsuario(String email, String passwd){
        return repository.findUsuarioByEmailAndPasswd(email, passwd);
    }
    public Usuario findOneByEmail(String email){
        return repository.findUsuarioByEmail(email);
    }
}