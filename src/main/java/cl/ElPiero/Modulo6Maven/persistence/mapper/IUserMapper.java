package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.Training;
import cl.ElPiero.Modulo6Maven.domain.dto.User;
import cl.ElPiero.Modulo6Maven.persistence.entity.Capacitacion;
import cl.ElPiero.Modulo6Maven.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * El Piero tiene sueño
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Mapper(componentModel = "spring")
public interface IUserMapper {
    @Mappings({
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "userName", target = "userName"),
            @Mapping(source = "clave", target = "password"),
            @Mapping(source = "run", target = "dni"),
            @Mapping(source = "fechaNacimiento", target = "birthDate"),
            @Mapping(source = "edadUsuario", target = "userAge"),
            @Mapping(source = "tipoUsuario", target = "userType"),
            @Mapping(source = "estado", target = "userStatus")
    })
    User toUser(Usuario usuario);
    List<User> toUser(List<Usuario> usuario);

    @InheritInverseConfiguration
    Usuario toUsuario(User user);
}
