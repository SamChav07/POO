package org.example.ProyectoPlanificacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ReferenceView;
import org.openxava.model.Identifiable;

import javax.persistence.*;


@Entity
@Getter
@Setter
//@Table(name="asignacion")
public class Asignacion extends Identifiable {

    @ReferenceView("simple")
    @ManyToOne
    @JoinColumn(name = "ambiente_id", referencedColumnName = "id")
    private Ambiente ambiente;

    //@ReferenceView("simple")
    @ManyToOne
    @JoinColumn(name="actividad_id", referencedColumnName = "id")
    private Actividad actividad;

    @Enumerated(EnumType.STRING)
    private HORARIO horario;

    @ManyToOne
    @JoinColumn(name="proyeccion_id")
    private Proyeccion proyeccion;

}
