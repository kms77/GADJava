package Model;

public interface OrderState {
    void next(Order order);
    void previous(Order order);
    String getState();
}
