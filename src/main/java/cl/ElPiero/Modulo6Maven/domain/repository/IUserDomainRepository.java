package cl.ElPiero.Modulo6Maven.domain.repository;

import cl.ElPiero.Modulo6Maven.domain.dto.Training;
import cl.ElPiero.Modulo6Maven.domain.dto.User;

import java.util.List;
import java.util.Optional;

/**
 * El piero tiene sueño
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
public interface IUserDomainRepository {

    List<User> findAll();
    Optional<User> findById(Integer userId);
    User save(User user);
    void delete(Integer userId);
    void del(Integer userId);
}
