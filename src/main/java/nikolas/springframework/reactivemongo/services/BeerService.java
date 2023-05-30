package nikolas.springframework.reactivemongo.services;

import com.mongodb.MongoCredential;
import nikolas.springframework.reactivemongo.domain.Beer;
import nikolas.springframework.reactivemongo.model.BeerDTO;
import reactor.core.publisher.Mono;

public interface BeerService {

    Mono<BeerDTO> saveBeer(BeerDTO beerDTO);

    Mono<BeerDTO> getBeerById(String beerId);
}
