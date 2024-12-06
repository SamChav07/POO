package org.example.ProyectoPlanificacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ReferenceView;
import org.openxava.annotations.Required;
import org.openxava.annotations.View;

import javax.persistence.*;

@Entity
@Getter
@Setter
@DiscriminatorValue("coordinador")
@View(name="simple", members="nombreCompleto,carrera" )

public class Coordinador extends Usuario{

        @Required
        private String nombre;
        @Required
        private String apellido;
        private String email;
        private String telefono;

        @Required
        @OneToOne
        @JoinColumn(name = "carrera_id")
        @ReferenceView("simple")
        private Carrera carrera;

    @Override
    public String getNombreCompleto() {
        return new StringBuffer(nombre)
                .append(" " + apellido)
                .toString();
    }
}
