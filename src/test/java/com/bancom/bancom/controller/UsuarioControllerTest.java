package com.bancom.bancom.controller;

import com.bancom.bancom.entity.Usuario;
import com.bancom.bancom.repositoy.RepositoryUsuario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UsuarioControllerTest {

    @Mock
    RepositoryUsuario repositoryUsuario;

    @Test
    void guardarUsuario() {
        /*
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setName("JUAN");
        usuario.setLastName("JUSTINIANO");
        usuario.setCellphone("333333333");
        usuario.setPassword("3333");
        //repositoryUsuario.save(usuario);
        when(repositoryUsuario.save(usuario)).thenReturn(usuario);
        */
    }

    @Test
    void consultarUsuario() {
    }

    @Test
    void modificarUsuario() {
    }

    @Test
    void eliminarUsuario() {
    }

    @Test
    void listarUsuario() {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGuardarUsuario() {
    }

    @Test
    void testConsultarUsuario() {
    }

    @Test
    void testModificarUsuario() {
    }

    @Test
    void testEliminarUsuario() {
    }

    @Test
    void testListarUsuario() {
    }
}