package Model;

public class Order {

    private String customerName;
    private Integer priceOfOrder;
    private String observations;
    private OrderState orderState;

    public Order(String customerName, Integer priceOfOrder, String observations) {
        this.customerName = customerName;
        this.priceOfOrder = priceOfOrder;
        this.observations = observations;
        this.orderState = new CreateOrderState();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getPriceOfOrder() {
        return priceOfOrder;
    }

    public void setPriceOfOrder(Integer priceOfOrder) {
        this.priceOfOrder = priceOfOrder;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void previousState(){
        orderState.previous(this);
    }

    public void nextState(){
        orderState.next(this);
    }

    public String getState(){
       return orderState.getState();
    }

    public void setState(OrderState state){
        this.orderState = state;
    }

    @Override
    public String toString() {
        return " Order: { " +
                "customerName= " + customerName +
                ", priceOfOrder= " + priceOfOrder +
                ", observations= " + observations +
                ", orderState= " + this.getState() +
                " }\n";
    }
}
