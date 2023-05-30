package nikolas.springframework.reactivemongo.mappers;

import nikolas.springframework.reactivemongo.domain.Customer;
import nikolas.springframework.reactivemongo.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);

}
