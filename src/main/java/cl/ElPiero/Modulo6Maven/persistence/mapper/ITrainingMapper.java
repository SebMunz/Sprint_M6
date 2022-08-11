package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.Training;
import cl.ElPiero.Modulo6Maven.persistence.entity.Capacitacion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * Módulo 6
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Mapper(componentModel = "spring")
public interface ITrainingMapper {

    @Mappings({
            @Mapping(source = "identificador", target = "trainingId"),
            @Mapping(source = "rutCliente", target = "customerId"),
            @Mapping(source = "dia", target = "day"),
            @Mapping(source = "hora", target = "hour"),
            @Mapping(source = "lugar", target = "place"),
            @Mapping(source = "duracion", target = "duration"),
            @Mapping(source = "cantidadAsistentes", target = "numberAttendees")

    })
    Training toTraining(Capacitacion capacitacion);
    List<Training> toTrainings(List<Capacitacion> capacitacion);

    @InheritInverseConfiguration
    Capacitacion toCapacitacion(Training training);

}
