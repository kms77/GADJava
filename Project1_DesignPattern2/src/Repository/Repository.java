package Repository;

import Model.Order;
import Model.OrderState;

import java.util.AbstractMap;
import java.util.HashMap;

public class Repository {

    private HashMap<Integer, Order> allOrders;
    private Integer currentID;
    private AbstractMap.SimpleEntry<Integer, Order> objectToReturn;

    public Repository(){
        this.allOrders = new HashMap<>();
        this.currentID = 0;
    }

    public void Add_NewOrder_ToList(Order orderToBeAdded){
        this.allOrders.put(currentID, orderToBeAdded);
        this.currentID++;
    }

    public Order Remove_OrderByID_FromList(Integer orderID){
        return this.allOrders.remove(orderID);
    }

    public Order Update_OrderByID_FromList(Integer orderID, Order orderToBeUpdated){
        if(this.allOrders.get(orderID) == null){
            return null;
        }
        this.allOrders.put(orderID, orderToBeUpdated);
        return orderToBeUpdated;
    }

    public HashMap<Integer, Order> Get_AllOrders_List(){
        return this.allOrders;
    }

}
