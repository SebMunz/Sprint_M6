package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.CheckVisit;
import cl.ElPiero.Modulo6Maven.persistence.entity.CheckVisitas;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-10T15:39:21-0400",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class ICheckMapperImpl implements ICheckMapper {

    @Override
    public CheckVisit toCheckVisit(CheckVisitas checkVisitas) {
        if ( checkVisitas == null ) {
            return null;
        }

        CheckVisit checkVisit = new CheckVisit();

        checkVisit.setCheckId( checkVisitas.getCheckId() );
        checkVisit.setDescription( checkVisitas.getDescripcion() );
        checkVisit.setStatusCheck( checkVisitas.getEstadoCheck() );

        return checkVisit;
    }

    @Override
    public List<CheckVisit> toCheckVisitList(List<CheckVisitas> checkVisitas) {
        if ( checkVisitas == null ) {
            return null;
        }

        List<CheckVisit> list = new ArrayList<CheckVisit>( checkVisitas.size() );
        for ( CheckVisitas checkVisitas1 : checkVisitas ) {
            list.add( toCheckVisit( checkVisitas1 ) );
        }

        return list;
    }

    @Override
    public CheckVisitas toCheckVisitas(CheckVisit checkVisit) {
        if ( checkVisit == null ) {
            return null;
        }

        CheckVisitas checkVisitas = new CheckVisitas();

        checkVisitas.setCheckId( checkVisit.getCheckId() );
        checkVisitas.setDescripcion( checkVisit.getDescription() );
        checkVisitas.setEstadoCheck( checkVisit.getStatusCheck() );

        return checkVisitas;
    }
}
