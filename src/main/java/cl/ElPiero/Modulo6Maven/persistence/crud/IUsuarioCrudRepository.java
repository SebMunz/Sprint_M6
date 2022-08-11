package cl.ElPiero.Modulo6Maven.persistence.crud;

import cl.ElPiero.Modulo6Maven.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 * El Piero tiene Sueño
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
public interface IUsuarioCrudRepository extends CrudRepository<Usuario, Integer> {
}
