package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.Professional;
import cl.ElPiero.Modulo6Maven.persistence.entity.Profesional;
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
public class IProfesionalMapperImpl implements IProfesionalMapper {

    @Override
    public Professional toProfessional(Profesional profesional) {
        if ( profesional == null ) {
            return null;
        }

        Professional professional = new Professional();

        professional.setTitle( profesional.getTitulo() );
        professional.setAdmissionDate( profesional.getFechaDeIngreso() );

        return professional;
    }

    @Override
    public List<Professional> toProfessionalList(List<Profesional> profesionales) {
        if ( profesionales == null ) {
            return null;
        }

        List<Professional> list = new ArrayList<Professional>( profesionales.size() );
        for ( Profesional profesional : profesionales ) {
            list.add( toProfessional( profesional ) );
        }

        return list;
    }

    @Override
    public Profesional toProfesional(Professional professional) {
        if ( professional == null ) {
            return null;
        }

        Profesional profesional = new Profesional();

        profesional.setTitulo( professional.getTitle() );
        profesional.setFechaDeIngreso( professional.getAdmissionDate() );

        return profesional;
    }
}
