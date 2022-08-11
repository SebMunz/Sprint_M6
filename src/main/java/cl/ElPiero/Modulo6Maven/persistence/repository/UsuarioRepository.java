package cl.ElPiero.Modulo6Maven.persistence.repository;

import cl.ElPiero.Modulo6Maven.domain.dto.User;
import cl.ElPiero.Modulo6Maven.domain.repository.IUserDomainRepository;
import cl.ElPiero.Modulo6Maven.persistence.crud.IUsuarioCrudRepository;
import cl.ElPiero.Modulo6Maven.persistence.entity.Capacitacion;
import cl.ElPiero.Modulo6Maven.persistence.entity.Usuario;
import cl.ElPiero.Modulo6Maven.persistence.mapper.IUserMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * El Piero tiene sueño
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Repository
public class UsuarioRepository implements IUserDomainRepository {

    private final IUsuarioCrudRepository usuaCrudRepository;
    private final IUserMapper userMapper;

    public UsuarioRepository(IUsuarioCrudRepository usuaCrudRepository, IUserMapper userMapper) {
        this.usuaCrudRepository = usuaCrudRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<User> findAll() {
        return userMapper.toUser((List<Usuario>) usuaCrudRepository.findAll());
    }

    @Override
    public Optional<User> findById(Integer userId) {
        return usuaCrudRepository.findById(userId).map(userMapper::toUser);
    }

    @Override
    public User save(User user) {
        return userMapper.toUser(usuaCrudRepository.save(userMapper.toUsuario(user)));
    }

    @Override
    public void delete(Integer userId) {
        usuaCrudRepository.deleteById(userId);
    }

    @Override
    public void del(Integer userId) {

    }
}
