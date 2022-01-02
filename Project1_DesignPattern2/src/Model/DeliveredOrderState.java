package Model;

public class DeliveredOrderState implements OrderState{
    @Override
    public void next(Order order) {
        order.setState(new ReceivedOrderState());
    }

    @Override
    public void previous(Order order) {
        order.setState(new PlacedOrderState());
    }

    @Override
    public String getState() {
        return  "The order was delivered, but not received by the customer!";
    }
}
