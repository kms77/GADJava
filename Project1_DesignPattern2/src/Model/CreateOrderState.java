package Model;

public class CreateOrderState implements OrderState{
    @Override
    public void next(Order order) {
        order.setState(new PlacedOrderState());
    }

    @Override
    public void previous(Order order) {
        System.out.println("The created order was not placed!");
    }

    @Override
    public String getState() { return "The order was created, but not placed!";
    }
}
