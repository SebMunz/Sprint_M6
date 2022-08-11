package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.Administrative;
import cl.ElPiero.Modulo6Maven.persistence.entity.Administrativo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-09T16:50:28-0400",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class IAdministrativoMapperImpl implements IAdministrativoMapper {

    @Override
    public Administrative toAdministrative(Administrativo administrativo) {
        if ( administrativo == null ) {
            return null;
        }

        Administrative administrative = new Administrative();

        administrative.setArea( administrativo.getArea() );
        administrative.setPreviousExperience( administrativo.getExperienciaPrevia() );

        return administrative;
    }

    @Override
    public List<Administrative> toAdminList(List<Administrativo> administrativos) {
        if ( administrativos == null ) {
            return null;
        }

        List<Administrative> list = new ArrayList<Administrative>( administrativos.size() );
        for ( Administrativo administrativo : administrativos ) {
            list.add( toAdministrative( administrativo ) );
        }

        return list;
    }

    @Override
    public Administrativo toAdministrativo(Administrative administrative) {
        if ( administrative == null ) {
            return null;
        }

        Administrativo administrativo = new Administrativo();

        administrativo.setArea( administrative.getArea() );
        administrativo.setExperienciaPrevia( administrative.getPreviousExperience() );

        return administrativo;
    }
}
