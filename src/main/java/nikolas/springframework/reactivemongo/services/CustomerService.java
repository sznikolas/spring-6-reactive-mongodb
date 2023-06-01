package nikolas.springframework.reactivemongo.services;

import nikolas.springframework.reactivemongo.domain.Customer;
import nikolas.springframework.reactivemongo.model.BeerDTO;
import nikolas.springframework.reactivemongo.model.CustomerDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.ui.Model;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {

    Mono<CustomerDTO> findFirstByCustomerName (String customerName);
    Flux<CustomerDTO> listCustomers();

    Mono<CustomerDTO> saveNewCustomer(CustomerDTO customerDTO);

    Mono<CustomerDTO> saveNewCustomer(Mono<CustomerDTO> customerDTO);

    Mono<CustomerDTO> getCustomerById(String customerId);

    Mono<CustomerDTO> updateCustomer(String customerId, CustomerDTO customerDTO);

    Mono<CustomerDTO> patchCustomer(String customerId, CustomerDTO customerDTO);

    Mono<Void> deleteCustomerById(String customerId);
}
