package com.bancom.bancom.controller;

import com.bancom.bancom.entity.Usuario;
import com.bancom.bancom.repositoy.RepositoryUsuario;
import com.bancom.bancom.service.ServiceUsuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final ServiceUsuario serviceUsuario;
    private final RepositoryUsuario repositoryUsuario;

    @PostMapping
    public ResponseEntity guardarUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity(serviceUsuario.guardarUsuario(usuario), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity consultarUsuario(@PathVariable("id") Long idUsuario){
        return new ResponseEntity(serviceUsuario.consultarUsuario(idUsuario), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity modificarUsuario(@PathVariable("id") Long idUsuario,@RequestBody Usuario usuario){
        return new ResponseEntity(serviceUsuario.modificarUsuario(idUsuario, usuario), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarUsuario(@PathVariable("id") Long idUsuario){
        boolean rpta = serviceUsuario.eliminarUsuario(idUsuario);
        if(rpta){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping("/listarUsuario")
    @ResponseBody
    public List<Usuario> listarUsuario(){
        return serviceUsuario.listaUsuario();
    }

}
