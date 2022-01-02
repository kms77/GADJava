package Model;

public class PlacedOrderState implements OrderState{
    @Override
    public void next(Order order) {
        order.setState(new DeliveredOrderState());
    }

    @Override
    public void previous(Order order) {
        order.setState(new CreateOrderState());
    }

    @Override
    public String getState() {
        return "The order was placed, but not delivered to the customer!";
    }
}
