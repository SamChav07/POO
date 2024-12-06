package org.example.ProyectoPlanificacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ReferenceView;
import org.openxava.annotations.View;
import org.openxava.model.Identifiable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@DiscriminatorValue("clase")
@View(name="simple", members = "")
public class Clase extends Actividad {

    private int grupo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carrera_id")
    @ReferenceView("simple")
    private Carrera carrera;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesor_id")
    @ReferenceView("simple")
    private Profesor profesor;

}
