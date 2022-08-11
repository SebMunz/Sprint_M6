package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.Payment;
import cl.ElPiero.Modulo6Maven.domain.dto.Training;
import cl.ElPiero.Modulo6Maven.persistence.entity.Capacitacion;
import cl.ElPiero.Modulo6Maven.persistence.entity.Pago;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * El Piero
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Mapper(componentModel = "spring", uses = {ITrainingMapper.class, IUserMapper.class})
public interface IPagoMapper {

    @Mappings({
            @Mapping(source = "idPago", target = "payId"),
            @Mapping(source = "rutCliente", target = "customerId"),
            @Mapping(source = "estadoPagoId", target = "statusPayId"),
            @Mapping(source = "capacitacionId", target = "trainingId"),
            @Mapping(source = "monto", target = "amount"),
            @Mapping(source = "fechaPago", target = "payDate"),
            @Mapping(source = "tipoPago", target = "payType"),
            @Mapping(source = "totalAPagar", target = "totalToPay"),
            @Mapping(source = "pagoAcumulado", target = "accumulatedPayments"),
            @Mapping(source = "capacitacion", target = "training"),
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "usuario", target = "user")

    })
    Payment toPayment(Pago pago);
    List<Payment> toPaymentList(List<Pago> pago);

    @InheritInverseConfiguration
    Pago toPago(Payment payment);
}
