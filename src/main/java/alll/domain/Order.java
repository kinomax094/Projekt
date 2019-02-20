package alll.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int idOrder;
    private ArrayList<Product> listOfItem;
    private Address address;

    public Order(int idOrder, ArrayList<Product> listOfItem, Address address) {
        this.idOrder = idOrder;
        this.listOfItem = listOfItem;
        this.address = address;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public ArrayList<Product> getListOfItem() {
        return listOfItem;
    }

    public void setListOfItem(ArrayList<Product> listOfItem) {
        this.listOfItem = listOfItem;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getAmountOfOrder() {
        double result = 0;
        for (Product product : listOfItem) {
            result += product.getPrice();
        }

        return  result;
    }
}
