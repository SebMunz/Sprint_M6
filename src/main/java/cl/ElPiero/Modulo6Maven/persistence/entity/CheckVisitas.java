package cl.ElPiero.Modulo6Maven.persistence.entity;

import javax.persistence.*;

/**
 * El Piero
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Entity
@Table(name="check_revision")
public class CheckVisitas {

    @Id
    @Column(name="check_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer checkId;
    private String descripcion;
    @Column(name="estado_check")
    private Boolean estadoCheck;

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstadoCheck() {
        return estadoCheck;
    }

    public void setEstadoCheck(Boolean estadoCheck) {
        this.estadoCheck = estadoCheck;
    }
}
