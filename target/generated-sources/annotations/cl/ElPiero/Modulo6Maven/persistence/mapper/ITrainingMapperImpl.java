package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.Training;
import cl.ElPiero.Modulo6Maven.persistence.entity.Capacitacion;
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
public class ITrainingMapperImpl implements ITrainingMapper {

    @Override
    public Training toTraining(Capacitacion capacitacion) {
        if ( capacitacion == null ) {
            return null;
        }

        Training training = new Training();

        training.setTrainingId( capacitacion.getIdentificador() );
        training.setCustomerId( capacitacion.getRutCliente() );
        training.setDay( capacitacion.getDia() );
        training.setHour( capacitacion.getHora() );
        training.setPlace( capacitacion.getLugar() );
        training.setDuration( capacitacion.getDuracion() );
        training.setNumberAttendees( capacitacion.getCantidadAsistentes() );

        return training;
    }

    @Override
    public List<Training> toTrainings(List<Capacitacion> capacitacion) {
        if ( capacitacion == null ) {
            return null;
        }

        List<Training> list = new ArrayList<Training>( capacitacion.size() );
        for ( Capacitacion capacitacion1 : capacitacion ) {
            list.add( toTraining( capacitacion1 ) );
        }

        return list;
    }

    @Override
    public Capacitacion toCapacitacion(Training training) {
        if ( training == null ) {
            return null;
        }

        Capacitacion capacitacion = new Capacitacion();

        capacitacion.setIdentificador( training.getTrainingId() );
        capacitacion.setRutCliente( training.getCustomerId() );
        capacitacion.setDia( training.getDay() );
        capacitacion.setHora( training.getHour() );
        capacitacion.setLugar( training.getPlace() );
        capacitacion.setDuracion( training.getDuration() );
        capacitacion.setCantidadAsistentes( training.getNumberAttendees() );

        return capacitacion;
    }
}
