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
@Table(name="visita")
public class Visitas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="visita_id")
    private Integer idVisita;
    @Column(name="fecha_visita")
    private String fechaVisita;
    @Column(name="id_usuario")
    private Integer idUsuario;
    @Column(name="rut_empresa")
    private  Integer rutEmpresa;
    @Column(name="nombre_empresa")
    private String nombreEmpresa;
    @Column(name="direccion_empresa")
    private String direccionEmpresa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private Usuario usuario;

    public Integer getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Integer idVisita) {
        this.idVisita = idVisita;
    }

    public String getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(String fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(Integer rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
