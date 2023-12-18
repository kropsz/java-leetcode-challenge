package entities;

import enums.OrderStatus;
import service.OrderItem;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Instant creationDate;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(Instant creationDate, OrderStatus status, Client client, List<OrderItem> orderItems) {
        this.creationDate = creationDate;
        this.status = status;
        this.client = client;
        this.orderItems = orderItems;
    }

    public Order(){

    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }

    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }

    public Double total(){
        double totalPrice = 0.0;
        for (OrderItem i : orderItems) {
            totalPrice = totalPrice + i.subTotal();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder items = new StringBuilder();
        for (OrderItem i : orderItems){
            items.append(i.toString() + "\n");
        }
          return "ORDER SUMMARY: \n" +
                "Order moment: " + getCreationDate() + "\n" +
                "Order Status: " + getStatus() + "\n" +
                "Client: " + getClient().toString() + "\n" +
                "Order Items: \n" +
                items.toString() + "\n" +
                "Total price: $" + total();

    }
}
