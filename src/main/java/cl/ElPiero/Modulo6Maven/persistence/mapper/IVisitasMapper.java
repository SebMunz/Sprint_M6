package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.Payment;
import cl.ElPiero.Modulo6Maven.domain.dto.Visit;
import cl.ElPiero.Modulo6Maven.persistence.entity.Pago;
import cl.ElPiero.Modulo6Maven.persistence.entity.Visitas;
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
@Mapper(componentModel = "spring", uses = {IUserMapper.class})
public interface IVisitasMapper {
    @Mappings({
            @Mapping(source = "idVisita", target = "visitId"),
            @Mapping(source = "fechaVisita", target = "visitDate"),
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "rutEmpresa", target = "companyId"),
            @Mapping(source = "nombreEmpresa", target = "companyName"),
            @Mapping(source = "direccionEmpresa", target = "companyAddress"),
            @Mapping(source = "usuario", target = "user")

    })
    Visit toVisit(Visitas vistas);
    List<Visit> toVisitList(List<Visitas> visitasList);

    @InheritInverseConfiguration
    Visitas toVisitas(Visit visit);

}
