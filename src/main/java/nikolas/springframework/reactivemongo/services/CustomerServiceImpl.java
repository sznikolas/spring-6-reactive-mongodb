package nikolas.springframework.reactivemongo.services;

import lombok.RequiredArgsConstructor;
import nikolas.springframework.reactivemongo.model.CustomerDTO;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
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
