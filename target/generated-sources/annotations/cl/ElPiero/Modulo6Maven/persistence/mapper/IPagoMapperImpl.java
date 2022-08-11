package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.Payment;
import cl.ElPiero.Modulo6Maven.persistence.entity.Pago;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-09T17:42:20-0400",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class IPagoMapperImpl implements IPagoMapper {

    @Autowired
    private ITrainingMapper iTrainingMapper;
    @Autowired
    private IUserMapper iUserMapper;

    @Override
    public Payment toPayment(Pago pago) {
        if ( pago == null ) {
            return null;
        }

        Payment payment = new Payment();

        payment.setPayId( pago.getIdPago() );
        payment.setCustomerId( pago.getRutCliente() );
        payment.setStatusPayId( pago.getEstadoPagoId() );
        payment.setTrainingId( pago.getCapacitacionId() );
        payment.setAmount( pago.getMonto() );
        payment.setPayDate( pago.getFechaPago() );
        payment.setPayType( pago.getTipoPago() );
        payment.setTotalToPay( pago.getTotalAPagar() );
        payment.setAccumulatedPayments( pago.getPagoAcumulado() );
        payment.setTraining( iTrainingMapper.toTraining( pago.getCapacitacion() ) );
        payment.setUserId( pago.getIdUsuario() );
        payment.setUser( iUserMapper.toUser( pago.getUsuario() ) );

        return payment;
    }

    @Override
    public List<Payment> toPaymentList(List<Pago> pago) {
        if ( pago == null ) {
            return null;
        }

        List<Payment> list = new ArrayList<Payment>( pago.size() );
        for ( Pago pago1 : pago ) {
            list.add( toPayment( pago1 ) );
        }

        return list;
    }

    @Override
    public Pago toPago(Payment payment) {
        if ( payment == null ) {
            return null;
        }

        Pago pago = new Pago();

        pago.setIdPago( payment.getPayId() );
        pago.setRutCliente( payment.getCustomerId() );
        pago.setEstadoPagoId( payment.getStatusPayId() );
        pago.setCapacitacionId( payment.getTrainingId() );
        pago.setMonto( payment.getAmount() );
        pago.setFechaPago( payment.getPayDate() );
        pago.setTipoPago( payment.getPayType() );
        pago.setTotalAPagar( payment.getTotalToPay() );
        pago.setPagoAcumulado( payment.getAccumulatedPayments() );
        pago.setCapacitacion( iTrainingMapper.toCapacitacion( payment.getTraining() ) );
        pago.setIdUsuario( payment.getUserId() );
        pago.setUsuario( iUserMapper.toUsuario( payment.getUser() ) );

        return pago;
    }
}
