package cl.ElPiero.Modulo6Maven.persistence.mapper;

import cl.ElPiero.Modulo6Maven.domain.dto.Customer;
import cl.ElPiero.Modulo6Maven.persistence.entity.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-09T16:13:52-0400",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class ICustomerMapperImpl implements ICustomerMapper {

    @Override
    public Customer toCustomer(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setCustomerId( cliente.getRutCliente() );
        customer.setName( cliente.getNombres() );
        customer.setLastName( cliente.getApellidos() );
        customer.setPhone( cliente.getTelefono() );
        customer.setAfp( cliente.getAfp() );
        customer.setHealthSystem( cliente.getSistemaSalud() );
        customer.setAddress( cliente.getDireccion() );
        customer.setComuna( cliente.getComuna() );

        return customer;
    }

    @Override
    public List<Customer> toCustomerList(List<Cliente> cliente) {
        if ( cliente == null ) {
            return null;
        }

        List<Customer> list = new ArrayList<Customer>( cliente.size() );
        for ( Cliente cliente1 : cliente ) {
            list.add( toCustomer( cliente1 ) );
        }

        return list;
    }

    @Override
    public Cliente toUsuario(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setRutCliente( customer.getCustomerId() );
        cliente.setNombres( customer.getName() );
        cliente.setApellidos( customer.getLastName() );
        cliente.setTelefono( customer.getPhone() );
        cliente.setAfp( customer.getAfp() );
        cliente.setSistemaSalud( customer.getHealthSystem() );
        cliente.setDireccion( customer.getAddress() );
        cliente.setComuna( customer.getComuna() );

        return cliente;
    }
}
