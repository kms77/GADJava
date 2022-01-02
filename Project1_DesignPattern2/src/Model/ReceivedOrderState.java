package Model;

public class ReceivedOrderState implements OrderState{
    @Override
    public void next(Order order) {
        System.out.println("This order is already received by the customer!");
    }

    @Override
    public void previous(Order order) {
        order.setState(new DeliveredOrderState());
    }

    @Override
    public String getState() {
        return "The order was received by the customer!";
    }
}
