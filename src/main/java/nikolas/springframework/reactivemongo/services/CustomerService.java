package nikolas.springframework.reactivemongo.services;

import nikolas.springframework.reactivemongo.domain.Customer;
import nikolas.springframework.reactivemongo.model.CustomerDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.ui.Model;
import reactor.core.publisher.Mono;

public interface CustomerService {

    Mono<CustomerDTO> saveCustomer(CustomerDTO customerDTO);

    Mono<CustomerDTO> getCustomerById(String customerId);

}
