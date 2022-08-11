package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.User;
import cl.ElPiero.Modulo6Maven.persistence.entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-09T11:11:02-0400",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class IUserMapperImpl implements IUserMapper {

    @Override
    public User toUser(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        User user = new User();

        user.setUserId( usuario.getIdUsuario() );
        user.setUserName( usuario.getUserName() );
        user.setPassword( usuario.getClave() );
        user.setDni( usuario.getRun() );
        user.setBirthDate( usuario.getFechaNacimiento() );
        user.setUserAge( usuario.getEdadUsuario() );
        user.setUserType( usuario.getTipoUsuario() );
        user.setUserStatus( usuario.getEstado() );

        return user;
    }

    @Override
    public List<User> toUser(List<Usuario> usuario) {
        if ( usuario == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( usuario.size() );
        for ( Usuario usuario1 : usuario ) {
            list.add( toUser( usuario1 ) );
        }

        return list;
    }

    @Override
    public Usuario toUsuario(User user) {
        if ( user == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setIdUsuario( user.getUserId() );
        usuario.setUserName( user.getUserName() );
        usuario.setClave( user.getPassword() );
        usuario.setRun( user.getDni() );
        usuario.setFechaNacimiento( user.getBirthDate() );
        usuario.setEdadUsuario( user.getUserAge() );
        usuario.setTipoUsuario( user.getUserType() );
        usuario.setEstado( user.getUserStatus() );

        return usuario;
    }
}
