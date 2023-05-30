package nikolas.springframework.reactivemongo.services;

import nikolas.springframework.reactivemongo.model.CustomerDTO;
import reactor.core.publisher.Mono;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public Mono<CustomerDTO> saveCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public Mono<CustomerDTO> getCustomerById(String customerId) {
        return null;
    }
}
