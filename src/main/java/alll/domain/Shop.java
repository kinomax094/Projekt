package alll.domain;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static int idOfOrder = 0;
    private String name;
    private Address address;
    private ArrayList<Customer> listOfCustomer;
    private ArrayList<Product> listOfProduct;

    public Shop(String name, Address address, ArrayList<Customer> listOfCustomer, ArrayList<Product> listOfProduct) {
        this.name = name;
        this.address = address;
        this.listOfCustomer = listOfCustomer;
        this.listOfProduct = listOfProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Customer> getListOfCustomer() {
        return listOfCustomer;
    }

    public void setListOfCustomer(ArrayList<Customer> listOfCustomer) {
        this.listOfCustomer = listOfCustomer;
    }

    public ArrayList<Product> getListOfProduct() {
        return listOfProduct;
    }

    public void setListOfProduct(ArrayList<Product> listOfProduct) {
        this.listOfProduct = listOfProduct;
    }

    public boolean createOrder(ArrayList<Product> list, Customer customer) {
        boolean result = true;

        if (listOfCustomer.contains(customer)) {
            if (listOfProduct.containsAll(list)) {
                listOfProduct.removeAll(list);
                customer.getOrders().add(new Order(idOfOrder++, list, customer.getAddress()));
            } else {
                result = false;
            }
        } else {
            listOfCustomer.add(customer);
            if (listOfProduct.containsAll(list)) {
                listOfProduct.removeAll(list);
                customer.getOrders().add(new Order(idOfOrder++, list, customer.getAddress()));
            } else {
                result = false;
            }

        }

        return result;
    }

    public void addNewProduct(List<Product> list) {
        this.listOfProduct.addAll(list);

    }

    public boolean addNewCustomer(Customer customer) {
        boolean result = false;

        if (!listOfCustomer.contains(customer)) {
            listOfCustomer.add(customer);
            result = true;
        }
        return result;

    }
}
