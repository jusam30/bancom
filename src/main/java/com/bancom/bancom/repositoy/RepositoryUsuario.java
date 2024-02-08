package com.bancom.bancom.repositoy;

import com.bancom.bancom.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface RepositoryUsuario extends JpaRepository<Usuario, Long> {
    @Transactional
    @Modifying
    @Query("update Usuario u set u.name = ?1, u.lastName = ?2 where u.id = ?3")
    int updateNameAndLastNameById(String name, String lastName, Long id);
    @Transactional
    @Modifying
    @Query("update Usuario u set u.name = ?1, u.lastName = ?2 where u.id is not null")
    int updateNameAndLastNameByIdNotNull(String name, String lastName);
}
