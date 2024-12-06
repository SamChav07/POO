package org.example.ProyectoPlanificacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ListProperties;
import org.openxava.model.Identifiable;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Getter
@Setter
public class DetalleSolicitud extends Identifiable {


    @ManyToOne
    @JoinColumn(name = "actividad_id", referencedColumnName = "id")
    private Actividad actividad;
    private HORARIO horarioDeseado;

    @ManyToOne
    @JoinColumn(name = "solicitud_id")
    private Solicitud solicitud;

}
