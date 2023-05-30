package nikolas.springframework.reactivemongo.mappers;

import nikolas.springframework.reactivemongo.domain.Beer;
import nikolas.springframework.reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDTO(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);

}
