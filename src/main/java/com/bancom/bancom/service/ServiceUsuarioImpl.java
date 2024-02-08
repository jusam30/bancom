package com.bancom.bancom.service;

import com.bancom.bancom.entity.Usuario;
import com.bancom.bancom.repositoy.RepositoryUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ServiceUsuarioImpl implements ServiceUsuario{

    private final RepositoryUsuario repositoryUsuario;

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        LocalDateTime datetime = LocalDateTime.now();
        usuario.setFechaReg(datetime);
        return repositoryUsuario.save(usuario);
    }

    @Override
    public Usuario consultarUsuario(Long idUsuario) {
        return repositoryUsuario.findById(idUsuario).orElseThrow(() -> {throw new RuntimeException();});
    }

    @Override
    public Usuario modificarUsuario(Long idUsuario, Usuario usuario) {
        Usuario usuarioModificado = repositoryUsuario.findById(idUsuario).get();
        usuarioModificado.setCellphone(usuario.getCellphone());
        usuarioModificado.setName(usuario.getName());
        usuarioModificado.setLastName(usuario.getLastName());
        usuarioModificado.setPassword(usuario.getPassword());
        LocalDateTime datetime = LocalDateTime.now();
        usuarioModificado.setFechaAct(datetime);
        repositoryUsuario.updateNameAndLastNameById(usuario.getName(), usuario.getLastName(), usuario.getId());
        return repositoryUsuario.findById(idUsuario).orElseThrow(() -> {throw new RuntimeException();});
    }

    @Override
    public Boolean eliminarUsuario(Long idUsuario) {
        try {
            repositoryUsuario.deleteById(idUsuario);
            return true;

        }catch (Exception e){
            return false;
        }

    }

    @Override
    public List<Usuario> listaUsuario() {
        return repositoryUsuario.findAll();
    }
}
