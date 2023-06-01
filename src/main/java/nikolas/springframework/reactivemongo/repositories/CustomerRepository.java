package nikolas.springframework.reactivemongo.repositories;

import nikolas.springframework.reactivemongo.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {

    Mono<Customer> findFirstByCustomerName(String customerName);

}
