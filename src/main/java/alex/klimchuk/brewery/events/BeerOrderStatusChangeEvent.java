package alex.klimchuk.brewery.events;

import alex.klimchuk.brewery.domain.BeerOrder;
import alex.klimchuk.brewery.domain.OrderStatusEnum;
import org.springframework.context.ApplicationEvent;

public class BeerOrderStatusChangeEvent extends ApplicationEvent {

    private final OrderStatusEnum previousStatus;

    public BeerOrderStatusChangeEvent(BeerOrder source, OrderStatusEnum previousStatus) {
        super(source);
        this.previousStatus = previousStatus;
    }

    public OrderStatusEnum getPreviousStatus() {
        return previousStatus;
    }

    public BeerOrder getBeerOrder(){
        return (BeerOrder) this.source;
    }
}
