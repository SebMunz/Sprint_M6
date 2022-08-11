package cl.ElPiero.Modulo6Maven.persistence.repository;

import cl.ElPiero.Modulo6Maven.domain.dto.Training;
import cl.ElPiero.Modulo6Maven.domain.repository.ITrainingDomainRepository;
import cl.ElPiero.Modulo6Maven.persistence.crud.ICapacitacionCrudRepository;
import cl.ElPiero.Modulo6Maven.persistence.entity.Capacitacion;
import cl.ElPiero.Modulo6Maven.persistence.mapper.ITrainingMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Módulo6
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Repository
public class CapacitacionRepository  implements ITrainingDomainRepository {

    private final ICapacitacionCrudRepository capaCrudRepository;
    private final ITrainingMapper mapper;

    public CapacitacionRepository(ICapacitacionCrudRepository capaCrudRepository, ITrainingMapper mapper) {
        this.capaCrudRepository = capaCrudRepository;
        this.mapper = mapper;
    }


    public List<Capacitacion> getAll(){
        return (List<Capacitacion>) capaCrudRepository.findAll();
    }
    public Optional<Capacitacion> getOne(Integer identificador){
        return capaCrudRepository.findById(identificador);
    }
    public Capacitacion save(Capacitacion capacitacion){
        return capaCrudRepository.save(capacitacion);
    }

    public void delete(Integer identificador){capaCrudRepository.deleteById(identificador);}

    @Override
    public List<Training> findAll() {
        return mapper.toTrainings((List<Capacitacion>) capaCrudRepository.findAll());
    }

    @Override
    public Optional<Training> findById(Integer trainingId) {
        return capaCrudRepository.findById(trainingId).map(mapper::toTraining);
    }

    @Override
    public Training save(Training training) {
        return mapper.toTraining(capaCrudRepository.save(mapper.toCapacitacion(training)));
    }

    @Override
    public void del(Integer trainingId){capaCrudRepository.deleteById(trainingId);
    }


}
