package org.example.ProyectoPlanificacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ListProperties;
import org.openxava.annotations.ListsProperties;
import org.openxava.annotations.ReferenceView;
import org.openxava.annotations.Required;
import org.openxava.model.Identifiable;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="solicitud")

public class Solicitud extends Identifiable {
    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.EAGER)
    @ReferenceView("simple")
    private Coordinador solicitante;
    //@Required
    private TIPOSOLICITUD tipoSolicitud;


    /*
    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)  // Guarda el nombre del enum como string
    @CollectionTable(
        name = "solicitud_dias", // Nombre de la tabla que guarda los días
        joinColumns = @JoinColumn(name = "solicitud_id") // Relación con la tabla Solicitud
    )
    @Column(name = "dia") // Nombre de la columna en la tabla "solicitud_dias"

    private Set<DIA> dias;*/

    @OneToMany(mappedBy = "solicitud", cascade = CascadeType.ALL)
    private Collection<DetalleSolicitud> detalleSolicitud;


}
