package cl.ucn.disc.isof.fivet.domain.model;

import com.durrutia.ebean.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Clase que representa un Examen de la veterinaria.
 *
 * 
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class Examen extends BaseModel {

    /**
     * Nombre del Examen
     */
    @Getter
    @NotNull
    @Column
    private String nombre;

    /**
     * Fecha del Examen
     */
    @Getter
    @NotNull
    @Column
    private Date fecha;

    /**
     * Resultado del Examen
     */
    @Getter
    @NotNull
    @Column
    private String resultado;

    /**
     * identificador del examen
     */
    @Getter
    @NotNull
    @Column
    private String identificador;

}
