package cl.ElPiero.Modulo6Maven.persistence.entity;

import javax.persistence.*;

/**
 * Modulo6Grupal4
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Entity
@Table(name="capacitacion")
public class Capacitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer identificador;
    @Column(name="rutcliente")
    private Integer rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    @Column(name="cantidadasistentes")
    private Integer cantidadAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(Integer identificador) {
        this.identificador = identificador;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Integer getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Integer rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Integer getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(Integer cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "identificador=" + identificador +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}';
    }
}
