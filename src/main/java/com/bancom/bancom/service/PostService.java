package com.bancom.bancom.service;

import com.bancom.bancom.entity.Post;

import java.util.List;

public interface PostService {

    Post guardarPost(Post post);
    Post consultarPost(Long idpost);
    Post modificarPost(Long idpost, Long idUsuario, Post post);
    Boolean eliminarPost(Long idpost);
    public abstract List<Post> listaPost();

}
