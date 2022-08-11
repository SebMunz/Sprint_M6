package cl.ElPiero.Modulo6Maven.persistence.repository;

import cl.ElPiero.Modulo6Maven.domain.dto.Payment;
import cl.ElPiero.Modulo6Maven.domain.repository.IPagoDomainRepository;
import cl.ElPiero.Modulo6Maven.persistence.crud.IPagoCrudRepository;
import cl.ElPiero.Modulo6Maven.persistence.entity.Pago;
import cl.ElPiero.Modulo6Maven.persistence.entity.Usuario;
import cl.ElPiero.Modulo6Maven.persistence.mapper.IPagoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * El Piero
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Repository
public class PagoRespository implements IPagoDomainRepository {

    private final IPagoCrudRepository pagoCrudRepository;
    private final IPagoMapper pagoMapper;

    public PagoRespository(IPagoCrudRepository pagoCrudRepository, IPagoMapper pagoMapper) {
        this.pagoCrudRepository = pagoCrudRepository;
        this.pagoMapper = pagoMapper;
    }

    @Override
    public List<Payment> findAll() {
        return  pagoMapper.toPaymentList((List<Pago>) pagoCrudRepository.findAll());
    }

    @Override
    public Optional<Payment> findById(Integer payId) {
        return pagoCrudRepository.findById(payId).map(pagoMapper::toPayment);
    }

    @Override
    public Payment save(Payment payment) {
        return pagoMapper.toPayment(pagoCrudRepository.save(pagoMapper.toPago(payment)));
    }

    @Override
    public void delete(Integer payId) {
        pagoCrudRepository.deleteById(payId);
    }
}
