package View;

import Controller.Service;
import Model.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UI {

    private Service service;

    public UI(Service service){
        this.service = service;
    }

    public UI(){}

    public void Print_ApplicationMenu_View(){
        System.out.println("\n-------------------Menu-------------------");
        System.out.println("1. Print all orders");
        System.out.println("2. Search order by ID");
        System.out.println("3. Add a new order");
        System.out.println("4. Next order state");
        System.out.println("5. Previous order state");
        System.out.println("6. Update order by ID");
        System.out.println("7. Remove an order");
        System.out.println("0. Exit");
    }

    public void run(){
        boolean runProgram = true;
        UI userInterface = new UI();
        while(runProgram){
            userInterface.Print_ApplicationMenu_View();
            System.out.println("Choose one option: ");
            Scanner scanner = new Scanner(System.in);
            int chosenOption = scanner.nextInt();
            switch (chosenOption) {
                case 1 -> {
                    HashMap<Integer, Order> allOrders = this.service.Get_AllOrder_FromRepository();
                    if(allOrders.size() == 0){
                        System.out.println("The list is empty!");
                    }
                    else{
                        System.out.println("List of orders: ");
                        for(Map.Entry<Integer, Order> order: allOrders.entrySet()){
                            System.out.print("Order ID: " + order.getKey() + " || " + order.getValue());
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Order ID: ");
                    Scanner orderScanner = new Scanner(System.in);
                    Integer orderID = orderScanner.nextInt();
                    Order searchedOrder = this.service.Get_OrderByID_FromList(orderID);
                    if(searchedOrder == null){
                        System.out.println("The searched order ID does not exist!");
                    }
                    else{
                        System.out.print("Order ID= " + orderID + " || " + searchedOrder);
                    }
                }
                case 3 -> {
                    System.out.println("Customer name: ");
                    Scanner orderScanner = new Scanner(System.in);
                    String customerName = orderScanner.nextLine();;
                    System.out.println("Total price of order: ");
                    orderScanner = new Scanner(System.in);
                    Integer priceOfOrder = orderScanner.nextInt();
                    orderScanner.nextLine();
                    System.out.println("Observations: ");
                    orderScanner = new Scanner(System.in);
                    String observations = orderScanner.nextLine();
                    this.service.Add_NewOrder_ToRepositoryList(customerName, priceOfOrder, observations);
                    System.out.println("The order was processed!");
                }
                case 4 -> {
                    System.out.println("Order ID: ");
                    Scanner orderScanner = new Scanner(System.in);
                    Integer orderID = orderScanner.nextInt();
                    Order updatedOrder = this.service.Update_OrderStateByID_FromRepository(orderID,"NEXT");
                    if(updatedOrder == null){
                        System.out.println("The given order ID does not exist!");
                    }
                    else{
                        System.out.println("The order was updated with the new state!");
                    }
                }
                case 5 -> {
                    System.out.println("Order ID: ");
                    Scanner orderScanner = new Scanner(System.in);
                    Integer orderID = orderScanner.nextInt();
                    Order updatedOrder = this.service.Update_OrderStateByID_FromRepository(orderID,"PREVIOUS");
                    if(updatedOrder == null){
                        System.out.println("The given order ID does not exist!");
                    }
                    else{
                        System.out.println("The order was updated with the new state!");
                    }
                }
                case 6 -> {
                    System.out.println("Order ID: ");
                    Scanner orderScanner = new Scanner(System.in);
                    Integer orderID = orderScanner.nextInt();
                    orderScanner.nextLine();
                    System.out.println("Customer name: ");
                    orderScanner = new Scanner(System.in);
                    String customerName = orderScanner.nextLine();;
                    System.out.println("Total price of order: ");
                    orderScanner = new Scanner(System.in);
                    Integer priceOfOrder = orderScanner.nextInt();
                    orderScanner.nextLine();
                    System.out.println("Observations: ");
                    orderScanner = new Scanner(System.in);
                    String observations = orderScanner.nextLine();
                    Order updatedOrder = this.service.Update_OrderByID_FromRepository(orderID, customerName, priceOfOrder, observations);
                    if(updatedOrder == null){
                        System.out.println("The given order ID does not exist!");
                    }
                    else{
                        System.out.println("The order was updated!");
                    }
                }
                case 7 -> {
                    System.out.println("Order ID: ");
                    Scanner orderScanner = new Scanner(System.in);
                    Integer orderID = orderScanner.nextInt();
                    Order removedOrder = this.service.Remove_OrderByID_FromRepository(orderID);
                    if(removedOrder == null){
                        System.out.println("The given order ID does not exist!");
                    }
                    else{
                        System.out.println("The order was removed from list!");
                    }
                }
                case 0 -> {
                    System.out.println("Program closed!");
                    runProgram = false;
                }
                default -> System.out.println("Invalid selected option!");
            }
        }
    }

}
