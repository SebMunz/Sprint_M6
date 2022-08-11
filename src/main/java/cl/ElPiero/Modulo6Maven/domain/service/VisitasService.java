package cl.ElPiero.Modulo6Maven.domain.service;

import cl.ElPiero.Modulo6Maven.domain.dto.Training;
import cl.ElPiero.Modulo6Maven.domain.dto.Visit;
import cl.ElPiero.Modulo6Maven.domain.repository.IVisitasDomeinRespoitory;
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
public class VisitasService {

    private final IVisitasDomeinRespoitory iVisitasDomeinRespoitory;

    public VisitasService(IVisitasDomeinRespoitory iVisitasDomeinRespoitory) {
        this.iVisitasDomeinRespoitory = iVisitasDomeinRespoitory;
    }


    public List<Visit> getAll(){
        return iVisitasDomeinRespoitory.findAll();
    }
    public Optional<Visit> getOne(Integer visitId){
        return iVisitasDomeinRespoitory.findById(visitId);
    }
    public Visit save(Visit visit){
        return iVisitasDomeinRespoitory.save(visit);
    }

    public boolean delete(Integer visitId){
        return getOne(visitId)
                .map(visita -> {iVisitasDomeinRespoitory.delete(visitId);
                    return true;})
                .orElse(false);
    }
}
