package nikolas.springframework.reactivemongo.mappers;

import nikolas.springframework.reactivemongo.domain.Beer;
import nikolas.springframework.reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);

}
