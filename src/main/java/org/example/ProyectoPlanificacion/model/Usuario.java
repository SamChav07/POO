package org.example.ProyectoPlanificacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.model.Identifiable;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name="usuario")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="tipoUsuario")
public abstract class Usuario extends Identifiable {

    private String usuario;
    private String password;
    private ROL rol;

    public abstract String getNombreCompleto();
}
