package cl.ElPiero.Modulo6Maven.domain.repository;

import cl.ElPiero.Modulo6Maven.domain.dto.CheckVisit;
import cl.ElPiero.Modulo6Maven.domain.dto.Payment;

import java.util.List;
import java.util.Optional;

/**
 * El Piero
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
public interface ICheckDomainRepository {
    List<CheckVisit> findAll();
    Optional<CheckVisit> findById(Integer checkId);
    CheckVisit save(CheckVisit checkVisit);
    void delete(Integer checkId);
}
