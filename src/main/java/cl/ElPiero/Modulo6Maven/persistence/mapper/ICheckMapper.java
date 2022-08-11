package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.CheckVisit;
import cl.ElPiero.Modulo6Maven.domain.dto.User;
import cl.ElPiero.Modulo6Maven.persistence.entity.CheckVisitas;
import cl.ElPiero.Modulo6Maven.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * El Piero
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Mapper(componentModel = "spring")
public interface ICheckMapper {
    @Mappings({
            @Mapping(source = "checkId", target = "checkId"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "estadoCheck", target = "statusCheck")
    })
    CheckVisit toCheckVisit(CheckVisitas checkVisitas);
    List<CheckVisit> toCheckVisitList(List<CheckVisitas> checkVisitas);

    @InheritInverseConfiguration
    CheckVisitas toCheckVisitas(CheckVisit checkVisit);
}
