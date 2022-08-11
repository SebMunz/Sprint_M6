package cl.ElPiero.Modulo6Maven.persistence.entity;

import org.hibernate.annotations.DiscriminatorFormula;

import javax.persistence.*;

/**
 * Sprint Final Módulo 6
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="disc_usuario",
        discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("0")
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Integer idUsuario;
    @Column(name="username")
    private String userName;
    private String clave;
    private Integer run;
    @Column(name="fechanacimiento")
    private String fechaNacimiento;
    @Column(name="edadusuario")
    private Integer edadUsuario;
    @Column(name="tipousuario")
    private Integer tipoUsuario;
    private Integer estado;

    public Usuario() {
    }
    public Usuario(Integer idUsuario, String userName, String clave, Integer run, String fechaNacimiento, Integer edadUsuario, Integer tipoUsuario, Integer estado) {
        this.idUsuario = idUsuario;
        this.userName = userName;
        this.clave = clave;
        this.run = run;
        this.fechaNacimiento = fechaNacimiento;
        this.edadUsuario = edadUsuario;
        this.tipoUsuario = tipoUsuario;
        this.estado = estado;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        this.run = run;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEdadUsuario() {
        return edadUsuario;
    }

    public void setEdadUsuario(Integer edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

    public Integer getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Integer tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
