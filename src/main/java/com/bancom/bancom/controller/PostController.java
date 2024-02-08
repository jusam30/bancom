package com.bancom.bancom.controller;

import com.bancom.bancom.entity.Post;
import com.bancom.bancom.repositoy.PostRepository;
import com.bancom.bancom.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor

public class PostController {

    private final PostService postService;
    private final PostRepository postRepository;

    @PostMapping
    public ResponseEntity guardarPost(@RequestBody Post post){
        return new ResponseEntity(postService.guardarPost(post), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity consultarPost(@PathVariable("id") Long idPost){
        return new ResponseEntity(postService.consultarPost(idPost), HttpStatus.OK);
    }

    @PutMapping("/{id}/{idUsuario}")
    public ResponseEntity modificarPost(@PathVariable("id") Long idPost, @PathVariable Long idUsuario, @RequestBody Post post){
        return new ResponseEntity(postService.modificarPost(idPost, idUsuario, post), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarPost(@PathVariable("id") Long idPost){
        boolean rpta = postService.eliminarPost(idPost);
        if(rpta){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping("/listarPost")
    @ResponseBody
    public List<Post> listarUsuario(){
        return postService.listaPost();
    }

}
