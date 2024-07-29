package alex.klimchuk.brewery.services;

import alex.klimchuk.brewery.web.model.BeerDto;
import alex.klimchuk.brewery.web.model.BeerPagedList;
import alex.klimchuk.brewery.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);

    BeerDto findBeerById(UUID beerId);
}
