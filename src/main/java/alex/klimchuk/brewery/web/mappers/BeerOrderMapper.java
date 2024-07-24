package alex.klimchuk.brewery.web.mappers;

import alex.klimchuk.brewery.domain.Beer;
import alex.klimchuk.brewery.domain.BeerOrder;
import alex.klimchuk.brewery.domain.BeerOrderLine;
import alex.klimchuk.brewery.web.model.BeerOrderDto;
import alex.klimchuk.brewery.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);

    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    default BeerOrderLine dtoToBeerOrder(BeerOrderLineDto dto){
        return BeerOrderLine.builder()
                .orderQuantity(dto.getOrderQuantity())
                .beer(Beer.builder().id(dto.getBeerId()).build())
                .build();
    }
}
