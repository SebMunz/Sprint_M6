package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.Administrative;
import cl.ElPiero.Modulo6Maven.domain.dto.Professional;
import cl.ElPiero.Modulo6Maven.persistence.entity.Administrativo;
import cl.ElPiero.Modulo6Maven.persistence.entity.Profesional;
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
public interface IProfesionalMapper {
    @Mappings({
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "fechaDeIngreso", target = "admissionDate")
    })
    Professional toProfessional(Profesional profesional);
    List<Professional> toProfessionalList(List<Profesional> profesionales);

    @InheritInverseConfiguration
    Profesional toProfesional(Professional professional);
}
