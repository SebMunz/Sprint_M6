package cl.ElPiero.Modulo6Maven.persistence.entity;

import javax.persistence.*;
import java.util.List;

/**
 * El Piero tiene sueño
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Entity
@Table(name="pago")
public class Pago {
    @Id
    @Column(name="pago_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPago;
    @Column(name="rutcliente")
    private Integer rutCliente;
    @Column(name="estado_pago_id")
    private Integer estadoPagoId;
    @Column(name="capacitacion_id")
    private Integer capacitacionId;

    private Integer monto;
    @Column(name="fecha_pago")
    private String fechaPago;
    @Column(name="tipo_pago")
    private String tipoPago;
    @Column(name="total_a_pagar")
    private Integer totalAPagar;
    @Column(name="pago_acumulado")
    private Integer pagoAcumulado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "capacitacion_id", insertable = false, updatable = false)
    private Capacitacion  capacitacion;

    @Column(name="id_usuario")
    private Integer idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private Usuario usuario;

    public Pago() {
    }

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public Integer getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Integer rutCliente) {
        this.rutCliente = rutCliente;
    }

    public Integer getEstadoPagoId() {
        return estadoPagoId;
    }

    public void setEstadoPagoId(Integer estadoPagoId) {
        this.estadoPagoId = estadoPagoId;
    }

    public Integer getCapacitacionId() {
        return capacitacionId;
    }

    public void setCapacitacionId(Integer capacitacionId) {
        this.capacitacionId = capacitacionId;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Integer getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(Integer totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public Integer getPagoAcumulado() {
        return pagoAcumulado;
    }

    public void setPagoAcumulado(Integer pagoAcumulado) {
        this.pagoAcumulado = pagoAcumulado;
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }
    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
    }

    public Integer getIdUsuario() { return idUsuario;}

    public void setIdUsuario(Integer idUsuario) {this.idUsuario = idUsuario;}

    public Usuario getUsuario() {return usuario;}

    public void setUsuario(Usuario usuario) { this.usuario = usuario;}
}
