package org.autoaventura.autoaventura.dominio;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;



//CREO MI PERSONA DE DOMINIO
@Data //ES UNA PROPIEDAD DE LOOMBOK QUE PERMITE CREAR SETTHERS GETTERE CONSTRUCTORES DE FORMA LIMPIA SIN TENER
//QUE ESCRIBIR TODO
@Entity
@Table(name = "vehiculos")
public class Vehiculos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "El campo está vacía")
    private String marca;
    @NotEmpty
    private String modelo;

    private int anio;
    @NotEmpty
    private String matricula;

    private double precioPorDia;

    @Column(name = "disponible", columnDefinition = "TINYINT(1)")
    private boolean disponible;


}
