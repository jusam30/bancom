package com.bancom.bancom.service;

import com.bancom.bancom.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface ServiceUsuario {

    Usuario guardarUsuario(Usuario usuario);
    Usuario consultarUsuario(Long idUsuario);
    Usuario modificarUsuario(Long idUsuario, Usuario usuario);
    Boolean eliminarUsuario(Long idUsuario);

    public abstract List<Usuario> listaUsuario();
}
