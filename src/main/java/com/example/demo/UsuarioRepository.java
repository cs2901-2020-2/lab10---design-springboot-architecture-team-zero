package com.example.demo;

public interface UsuarioRepository implements CrudRepository{
    public Usuario findUsuarioByEmailAndPasswd(String email, String password);
    public Usuario findUsuarioByEmail(String email);
}