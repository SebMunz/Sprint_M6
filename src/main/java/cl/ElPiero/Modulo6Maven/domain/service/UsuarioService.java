package cl.ElPiero.Modulo6Maven.domain.service;

import cl.ElPiero.Modulo6Maven.domain.dto.Training;
import cl.ElPiero.Modulo6Maven.domain.dto.User;
import cl.ElPiero.Modulo6Maven.domain.repository.IUserDomainRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * El Piero tiene sueño
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Service
public class UsuarioService {
    private final IUserDomainRepository userRepository;

    public UsuarioService(IUserDomainRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAll(){
        return userRepository.findAll();
    }
    public User save(User user){
        return userRepository.save(user);
    }

    public Optional<User> getOne(Integer userId){
        return userRepository.findById(userId);
    }

    public boolean delete(Integer userId){
        return getOne(userId)
                .map(usuario -> {userRepository.delete(userId);
                    return true;})
                .orElse(false);
    }
}
