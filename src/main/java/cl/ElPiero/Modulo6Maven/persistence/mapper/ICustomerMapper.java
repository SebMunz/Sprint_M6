package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.Customer;
import cl.ElPiero.Modulo6Maven.domain.dto.User;
import cl.ElPiero.Modulo6Maven.persistence.entity.Cliente;
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
public interface ICustomerMapper {

    @Mappings({
            @Mapping(source = "rutCliente", target = "customerId"),
            @Mapping(source = "nombres", target = "name"),
            @Mapping(source = "apellidos", target = "lastName"),
            @Mapping(source = "telefono", target = "phone"),
            @Mapping(source = "afp", target = "afp"),
            @Mapping(source = "sistemaSalud", target = "healthSystem"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "comuna", target = "comuna")
    })
    Customer toCustomer(Cliente cliente);
    List<Customer> toCustomerList(List<Cliente> cliente);

    @InheritInverseConfiguration
    Cliente toUsuario(Customer customer);
}
