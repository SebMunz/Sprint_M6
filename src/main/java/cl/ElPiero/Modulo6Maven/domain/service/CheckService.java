package cl.ElPiero.Modulo6Maven.domain.service;

import cl.ElPiero.Modulo6Maven.domain.dto.CheckVisit;
import cl.ElPiero.Modulo6Maven.domain.dto.Payment;
import cl.ElPiero.Modulo6Maven.domain.repository.ICheckDomainRepository;
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
public class CheckService {

    private final ICheckDomainRepository iCheckDomainRepository;

    public CheckService(ICheckDomainRepository iCheckDomainRepository) {
        this.iCheckDomainRepository = iCheckDomainRepository;
    }


    public List<CheckVisit> getAll(){
        return iCheckDomainRepository.findAll();
    }
    public CheckVisit save(CheckVisit checkVisit){
        return iCheckDomainRepository.save(checkVisit);
    }

    public Optional<CheckVisit> getOne(Integer checkId){
        return iCheckDomainRepository.findById(checkId);
    }

    public boolean delete(Integer checkId){
        return getOne(checkId)
                .map(check -> {iCheckDomainRepository.delete(checkId);
                    return true;})
                .orElse(false);
    }
}
