package Controller;

import Model.Order;
import Model.OrderState;
import Repository.Repository;
import java.util.HashMap;

public class Service {

    private final Repository repository;
    public Service(Repository repository){
        this.repository = repository;
    }

    public void Add_NewOrder_ToRepositoryList(String customerName, Integer priceOfOrder, String observations){
        Order orderToBeAdded = new Order(customerName, priceOfOrder, observations);
        this.repository.Add_NewOrder_ToList(orderToBeAdded);
    }

    public Order Remove_OrderByID_FromRepository(Integer orderID){
        return repository.Remove_OrderByID_FromList(orderID);
    }

    public Order Update_OrderStateByID_FromRepository(Integer orderID, String newOrderState){
        HashMap<Integer, Order> allOrders = this.repository.Get_AllOrders_List();
        Order orderToBeUpdated = allOrders.get(orderID);
        if(orderToBeUpdated == null)
            return null;
        else{
            if(newOrderState.equals("NEXT")){
                orderToBeUpdated.nextState();
            }
            else{
                orderToBeUpdated.previousState();
            }
            return this.repository.Update_OrderByID_FromList(orderID,orderToBeUpdated);
        }
    }

    public Order Update_OrderByID_FromRepository(Integer orderID, String customerName, Integer priceOfOrder, String observations){
        Order orderToBeUpdated = new Order(customerName, priceOfOrder, observations);
        return this.repository.Update_OrderByID_FromList(orderID,orderToBeUpdated);
    }

    public HashMap<Integer, Order> Get_AllOrder_FromRepository(){
        return this.repository.Get_AllOrders_List();
    }

    public Order Get_OrderByID_FromList(Integer orderID){
        HashMap<Integer, Order> allOrders = this.repository.Get_AllOrders_List();
        return allOrders.get(orderID);
    }

}
