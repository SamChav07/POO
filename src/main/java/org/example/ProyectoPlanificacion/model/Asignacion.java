package org.example.ProyectoPlanificacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ReferenceView;
import org.openxava.model.Identifiable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Getter
@Setter
//@Table(name="asignacion")
public class Asignacion extends Identifiable {

    @ReferenceView("simple")
    @ManyToOne
    @JoinColumn(name = "ambiente_id", referencedColumnName = "id")
    @NotNull(message = "El ambiente no puede ser nulo")
    private Ambiente ambiente;


    //@ReferenceView("simple")
    @ManyToOne
    @JoinColumn(name="actividad_id", referencedColumnName = "id")
    @NotNull(message = "La actividad no puede ser nulo")
    private Actividad actividad;


    @Enumerated(EnumType.STRING)
    private HORARIO horario;


    @ManyToOne
    @JoinColumn(name="proyeccion_id")
    private Proyeccion proyeccion;

    @PrePersist
    @PreUpdate
    public void validarCapacidadAmbiente() throws IllegalArgumentException {
        if (ambiente != null && actividad != null) {
            if (ambiente.getCapacidad() < actividad.getTamanio()) {
                throw new IllegalArgumentException("El ambiente seleccionado no tiene capacidad suficiente para la actividad.");
            }
        }
    }
}