package org.example.ProyectoPlanificacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.View;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="facultad")
@View(name = "simple", members = "nombreFacultad")
public class Facultad extends Identifiable {

    private String nombreFacultad;

}
