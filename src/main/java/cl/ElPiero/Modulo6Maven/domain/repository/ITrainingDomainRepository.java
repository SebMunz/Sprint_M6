package cl.ElPiero.Modulo6Maven.domain.repository;

import cl.ElPiero.Modulo6Maven.domain.dto.Training;

import java.util.List;
import java.util.Optional;

/**
 * Módulo 6
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
public interface ITrainingDomainRepository {

    List<Training> findAll();
    Optional<Training> findById(Integer trainingId);
    Training save(Training training);
    void delete(Integer trainingId);

    void del(Integer trainingId);
}
