package cl.ElPiero.Modulo6Maven.domain.service;

import cl.ElPiero.Modulo6Maven.domain.dto.Training;
import cl.ElPiero.Modulo6Maven.domain.repository.ITrainingDomainRepository;
import cl.ElPiero.Modulo6Maven.persistence.entity.Capacitacion;
import cl.ElPiero.Modulo6Maven.persistence.repository.CapacitacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Módulo6
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Service
public class CapacitacionService {
    private final ITrainingDomainRepository trainingRepository;

    public CapacitacionService(CapacitacionRepository capaRepository, ITrainingDomainRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    public List<Training> getAll(){
        return trainingRepository.findAll();
    }
    public Optional<Training> getOne(Integer trainingId){
        return trainingRepository.findById(trainingId);
    }
    public Training save(Training training){
        return trainingRepository.save(training);
    }

    public boolean delete(Integer trainingId){
        return getOne(trainingId)
                .map(capacitacion -> {trainingRepository.delete(trainingId);
                    return true;})
                .orElse(false);
    }
}
