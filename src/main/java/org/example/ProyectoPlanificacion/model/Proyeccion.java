package org.example.ProyectoPlanificacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ReferenceView;
import org.openxava.model.Identifiable;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Getter
@Setter
@Table(name="proyeccion")
public class Proyeccion extends Identifiable{

    private LocalDate fecha;

    @ReferenceView("simple")
    @ManyToOne(fetch = FetchType.LAZY)
    private Logistica planificador;

    @OneToMany(mappedBy = "proyeccion", cascade = CascadeType.ALL)
    private Collection<Asignacion> asignaciones;

}
