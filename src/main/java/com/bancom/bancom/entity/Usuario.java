package com.bancom.bancom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(length = 9)
    private String cellphone;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaReg;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaAct;

    @OneToMany(mappedBy = "usuario")
    private List<Post> post;

    public Long getId() {
        return this.id;
    }

    public String getCellphone() {
        return this.cellphone;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
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
        if (!(o instanceof Usuario)) return false;
        final Usuario other = (Usuario) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$cellphone = this.getCellphone();
        final Object other$cellphone = other.getCellphone();
        if (this$cellphone == null ? other$cellphone != null : !this$cellphone.equals(other$cellphone)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Usuario;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $cellphone = this.getCellphone();
        result = result * PRIME + ($cellphone == null ? 43 : $cellphone.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        return result;
    }

    public String toString() {
        return "Usuario(id=" + this.getId() + ", cellphone=" + this.getCellphone() + ", name=" + this.getName() + ", lastName=" + this.getLastName() + ", password=" + this.getPassword() + ")";
    }
}
