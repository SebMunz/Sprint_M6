package cl.ElPiero.Modulo6Maven.domain.service;

import cl.ElPiero.Modulo6Maven.domain.dto.Payment;
import cl.ElPiero.Modulo6Maven.domain.dto.User;
import cl.ElPiero.Modulo6Maven.domain.repository.IPagoDomainRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * El Piero
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Service
public class PagoService {

    private final IPagoDomainRepository iPagoDomainRepository;

    public PagoService(IPagoDomainRepository iPagoDomainRepository) {
        this.iPagoDomainRepository = iPagoDomainRepository;
    }


    public List<Payment> getAll(){
        return iPagoDomainRepository.findAll();
    }
    public Payment save(Payment payment){
        return iPagoDomainRepository.save(payment);
    }

    public Optional<Payment> getOne(Integer payId){
        return iPagoDomainRepository.findById(payId);
    }

    public boolean delete(Integer payId){
        return getOne(payId)
                .map(pago -> {iPagoDomainRepository.delete(payId);
                    return true;})
                .orElse(false);
    }
}
