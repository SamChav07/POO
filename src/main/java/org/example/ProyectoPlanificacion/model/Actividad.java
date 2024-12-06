package org.example.ProyectoPlanificacion.model;


import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.View;
import org.openxava.model.Identifiable;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="actividad")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="tipoActividad")
@View(name="simple", members = "codigo, duracion, tamanio")
public abstract class Actividad extends Identifiable {

    private String codigo;
    private String nombre;
    private String descripcion;
    private int tamanio;
    private int duracion;


}
