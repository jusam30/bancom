package com.bancom.bancom.service;

import com.bancom.bancom.entity.Post;
import com.bancom.bancom.repositoy.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Override
    public Post guardarPost(Post post) {
        LocalDateTime datetime = LocalDateTime.now();
        post.setFechaReg(datetime);
        return postRepository.save(post);
    }

    @Override
    public Post consultarPost(Long idpost) {
        return postRepository.findById(idpost).orElseThrow(() -> {throw new RuntimeException();});
    }

    @Override
    public Post modificarPost(Long idpost, Long idUsuario, Post post) {
        boolean existe = postRepository.existsByIdpostAndIdusuario(idpost, idUsuario);
        if(existe){
            Post postModificado = postRepository.findById(idpost).get();
            postModificado.setTexto(post.getTexto());
            LocalDateTime datetime = LocalDateTime.now();
            postModificado.setFechaAct(datetime);
            postRepository.updateTextoByIdpost(postModificado.getTexto(), postModificado.getIdpost());
        }
        return postRepository.findByIdpostAndIdusuario(idpost, idUsuario);
        //return postRepository.findById(idpost).orElseThrow(() -> {throw new RuntimeException();});
    }

    @Override
    public Boolean eliminarPost(Long idpost) {
        try {
            postRepository.deleteById(idpost);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public List<Post> listaPost() {
        return postRepository.findAll();
    }
}
