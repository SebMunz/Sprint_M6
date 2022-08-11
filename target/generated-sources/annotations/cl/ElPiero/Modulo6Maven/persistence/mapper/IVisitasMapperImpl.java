package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.Visit;
import cl.ElPiero.Modulo6Maven.persistence.entity.Visitas;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-10T12:42:43-0400",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class IVisitasMapperImpl implements IVisitasMapper {

    @Autowired
    private IUserMapper iUserMapper;

    @Override
    public Visit toVisit(Visitas vistas) {
        if ( vistas == null ) {
            return null;
        }

        Visit visit = new Visit();

        visit.setVisitId( vistas.getIdVisita() );
        visit.setVisitDate( vistas.getFechaVisita() );
        visit.setUserId( vistas.getIdUsuario() );
        visit.setCompanyId( vistas.getRutEmpresa() );
        visit.setCompanyName( vistas.getNombreEmpresa() );
        visit.setCompanyAddress( vistas.getDireccionEmpresa() );
        visit.setUser( iUserMapper.toUser( vistas.getUsuario() ) );

        return visit;
    }

    @Override
    public List<Visit> toVisitList(List<Visitas> visitasList) {
        if ( visitasList == null ) {
            return null;
        }

        List<Visit> list = new ArrayList<Visit>( visitasList.size() );
        for ( Visitas visitas : visitasList ) {
            list.add( toVisit( visitas ) );
        }

        return list;
    }

    @Override
    public Visitas toVisitas(Visit visit) {
        if ( visit == null ) {
            return null;
        }

        Visitas visitas = new Visitas();

        visitas.setIdVisita( visit.getVisitId() );
        visitas.setFechaVisita( visit.getVisitDate() );
        visitas.setIdUsuario( visit.getUserId() );
        visitas.setRutEmpresa( visit.getCompanyId() );
        visitas.setNombreEmpresa( visit.getCompanyName() );
        visitas.setDireccionEmpresa( visit.getCompanyAddress() );
        visitas.setUsuario( iUserMapper.toUsuario( visit.getUser() ) );

        return visitas;
    }
}
