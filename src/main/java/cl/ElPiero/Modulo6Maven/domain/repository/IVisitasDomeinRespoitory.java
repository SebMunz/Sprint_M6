package cl.ElPiero.Modulo6Maven.domain.repository;

import cl.ElPiero.Modulo6Maven.domain.dto.Payment;
import cl.ElPiero.Modulo6Maven.domain.dto.Visit;

import java.util.List;
import java.util.Optional;

/**
 * El Piero
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
public interface IVisitasDomeinRespoitory {
    List<Visit> findAll();
    Optional<Visit> findById(Integer visitId);
    Visit save(Visit visit);
    void delete(Integer visitId);
}
