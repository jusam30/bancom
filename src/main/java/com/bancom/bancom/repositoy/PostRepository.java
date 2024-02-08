package com.bancom.bancom.repositoy;

import com.bancom.bancom.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Post findByIdpostAndIdusuario(Long idpost, Long idusuario);
    boolean existsByIdpostAndIdusuario(Long idpost, Long idusuario);
    @Transactional
    @Modifying
    @Query("update Post p set p.texto = ?1 where p.idpost = ?2")
    int updateTextoByIdpost(String texto, Long idpost);


}
