package nikolas.springframework.reactivemongo.services;

import lombok.RequiredArgsConstructor;
import nikolas.springframework.reactivemongo.mappers.CustomerMapper;
import nikolas.springframework.reactivemongo.model.CustomerDTO;
import nikolas.springframework.reactivemongo.repositories.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerMapper customerMapper;
    private final CustomerRepository customerRepository;

    @Override
    public Mono<CustomerDTO> findFirstByCustomerName(String customerName) {
        return customerRepository.findFirstByCustomerName(customerName)
                .map(customerMapper::customerToCustomerDTO);
    }

    @Override
    public Flux<CustomerDTO> listCustomers() {
        return customerRepository.findAll()
                .map(customerMapper::customerToCustomerDTO);
    }

    @Override
    public Mono<CustomerDTO> saveNewCustomer(Mono<CustomerDTO> customerDTO) {
        return customerDTO.map(customerMapper::customerDtoToCustomer)
                .flatMap(customerRepository::save)
                .map(customerMapper::customerToCustomerDTO);
    }

    @Override
    public Mono<CustomerDTO> saveNewCustomer(CustomerDTO customerDTO) {
        return customerRepository.save(customerMapper.customerDtoToCustomer(customerDTO))
                .map(customerMapper::customerToCustomerDTO);
    }

    @Override
    public Mono<CustomerDTO> updateCustomer(String customerId, CustomerDTO customerDTO) {
        return customerRepository.findById(customerId)
                .map(foundCustomer -> {
                    //update properties
                    foundCustomer.setCustomerName(customerDTO.getCustomerName());
                    return foundCustomer;
                }).flatMap(customerRepository::save)
                .map(customerMapper::customerToCustomerDTO);
    }

    @Override
    public Mono<CustomerDTO> patchCustomer(String customerId, CustomerDTO customerDTO) {
        return customerRepository.findById(customerId)
                .map(foundCustomer -> {
                    if (StringUtils.hasText(customerDTO.getCustomerName())){
                        foundCustomer.setCustomerName(customerDTO.getCustomerName());
                    }
                    return foundCustomer;
                }).flatMap(customerRepository::save)
                .map(customerMapper::customerToCustomerDTO);
    }

    @Override
    public Mono<Void> deleteCustomerById(String customerId) {
        return customerRepository.deleteById(customerId);
    }

    @Override
    public Mono<CustomerDTO> getCustomerById(String customerId) {
        return customerRepository.findById(customerId)
                .map(customerMapper::customerToCustomerDTO);
    }
}
