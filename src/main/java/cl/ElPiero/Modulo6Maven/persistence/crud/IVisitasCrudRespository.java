package cl.ElPiero.Modulo6Maven.persistence.crud;

import cl.ElPiero.Modulo6Maven.persistence.entity.Visitas;
import org.springframework.data.repository.CrudRepository;

/**
 * El Piero
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
public interface IVisitasCrudRespository extends CrudRepository<Visitas, Integer> {
}
