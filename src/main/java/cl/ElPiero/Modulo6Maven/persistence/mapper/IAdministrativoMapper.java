package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.Administrative;
import cl.ElPiero.Modulo6Maven.persistence.entity.Administrativo;
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
public interface IAdministrativoMapper {
    @Mappings({
            @Mapping(source = "area", target = "area"),
            @Mapping(source = "experienciaPrevia", target = "previousExperience")
    })
    Administrative toAdministrative(Administrativo administrativo);
    List<Administrative> toAdminList(List<Administrativo> administrativos);

    @InheritInverseConfiguration
    Administrativo toAdministrativo(Administrative administrative);
}
