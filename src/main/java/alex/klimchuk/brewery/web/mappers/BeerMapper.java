package alex.klimchuk.brewery.web.mappers;

import alex.klimchuk.brewery.domain.Beer;
import alex.klimchuk.brewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
