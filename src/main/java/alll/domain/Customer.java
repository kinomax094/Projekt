package alll.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String idCustomer;
    private String name;
    private String surmane;
    private List<Order> orders = new ArrayList<>();
    private Address address;

    public Customer(String idCustomer, String name, String surmane, List<Order> orders, Address address) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.surmane = surmane;
        this.orders = orders;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurmane() {
        return surmane;
    }

    public void setSurmane(String surmane) {
        this.surmane = surmane;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public double getAllAmountOfOrder() {
        double result = 0;
        for (Order order : orders) {
            result += order.getAmountOfOrder();
        }
        return result;
    }

}
