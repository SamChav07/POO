package org.example.ProyectoPlanificacion.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.View;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Entity
@Getter
@Setter
@Table(name="ambiente")
@View(name="simple", members = "codigo, tipoAmbiente, capacidad")
public class Ambiente extends Identifiable {

    private String codigo;
    private TIPOAMBIENTE tipoAmbiente;
    private ESTADOAMBIENTE estadoAmbiente;
    private int capacidad;

}
