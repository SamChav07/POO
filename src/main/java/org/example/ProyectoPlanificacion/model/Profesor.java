package org.example.ProyectoPlanificacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.View;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Getter
@Setter
@Table(name="profesor")
@View(name = "simple", members = "nombreCompleto")
public class Profesor extends Identifiable {

    private String nombreCompleto;
    private String email;
    private String cif;

}
