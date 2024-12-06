package org.example.ProyectoPlanificacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;
import org.openxava.annotations.View;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@DiscriminatorValue("logistica")
@View(name="simple", members = "nombreCompleto")
public class Logistica extends Usuario {

    @Required
    private String nombre;
    @Required
    private String apellido;
    private String email;
    private String telefono;


    @Override
    public String getNombreCompleto() {
        return new StringBuffer(nombre)
                .append(" " + apellido)
                .toString();
    }
}
