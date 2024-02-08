package com.bancom.bancom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpost", nullable = false)
    private Long idpost;
    @Column(nullable = false)
    private String texto;
    @Column(nullable = false)
    private Long idusuario;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaReg;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaAct;

    @ManyToOne
    @JoinColumn(name = "id")
    Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public Long getIdpost() {
        return this.idpost;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setIdpost(Long idpost) {
        this.idpost = idpost;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public LocalDateTime getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(LocalDateTime fechaReg) {
        this.fechaReg = fechaReg;
    }

    public LocalDateTime getFechaAct() {
        return fechaAct;
    }

    public void setFechaAct(LocalDateTime fechaAct) {
        this.fechaAct = fechaAct;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Post)) return false;
        final Post other = (Post) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$idpost = this.getIdpost();
        final Object other$idpost = other.getIdpost();
        if (this$idpost == null ? other$idpost != null : !this$idpost.equals(other$idpost)) return false;
        final Object this$texto = this.getTexto();
        final Object other$texto = other.getTexto();
        if (this$texto == null ? other$texto != null : !this$texto.equals(other$texto)) return false;
        final Object this$usuario = this.getUsuario();
        final Object other$usuario = other.getUsuario();
        if (this$usuario == null ? other$usuario != null : !this$usuario.equals(other$usuario)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Post;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $idpost = this.getIdpost();
        result = result * PRIME + ($idpost == null ? 43 : $idpost.hashCode());
        final Object $texto = this.getTexto();
        result = result * PRIME + ($texto == null ? 43 : $texto.hashCode());
        final Object $usuario = this.getUsuario();
        result = result * PRIME + ($usuario == null ? 43 : $usuario.hashCode());
        return result;
    }

    public String toString() {
        return "Post(idpost=" + this.getIdpost() + ", texto=" + this.getTexto() + ", usuario=" + this.getUsuario() + ")";
    }
}
