package alll.utils;

import alll.domain.Customer;
import alll.domain.Order;
import alll.domain.Shop;

import java.util.*;

public class ShopUtils {

    // wskaz sklep który zarobił najwięcej
    public Shop shopWithBigestpPofit(ArrayList<Shop> shops) {
        Shop result = null;
        for (Shop shop : shops) {
            double suma = 0;
            double max = 0;
            for (Customer customer : shop.getListOfCustomer()) {
              suma += customer.getAllAmountOfOrder();
            }
            if(max < suma) {
                max = suma;
                suma = 0;
                result = shop;

            }
        }
        return  result;
    }




    // wskaz w którym mieście jest najwięcej sklepów

    public String cityWithBigestNumberOfShop(ArrayList<Shop> shops) {
        Map<String, Integer> map = new HashMap<>();
        for (Shop shop : shops) {
            if(map.containsKey(shop.getName())) {
               map.put(shop.getName(), map.get(shop.getName()) + 1) ;
            }
            else {
                map.put(shop.getName(), 1);
            }
        }
        int max = 0;
        String result = "";
        for (String s : map.keySet()) {
            if (map.get(s) > max ) {
                result = s;
            }
        }

        return result;
    }
    // znajdz zamówienie które ma najwyższą kwote oraz zwróc jego id i nazwę sklep

    public String findOrderWithBigestAmount(ArrayList<Shop> shops) {
        double max = 0;
        int id = 0;
        Shop shop2 = null;
        for (Shop shop : shops) {
            for (Customer customer : shop.getListOfCustomer()) {
                for (Order order : customer.getOrders()) {
                    if(max < order.getAmountOfOrder()) {
                        max = order.getAmountOfOrder();
                        id = order.getIdOrder();
                        shop2 = shop;
                    }
                }
            }
        }
        return id + " " + shop2.getName();

    }



    // wydrukuj imie i nazwisko klienta który ma najwięcej zamówień
    
    public String findCustomerWithBigestNumberOfOrder(ArrayList<Shop> shops) {
        Customer result = null;
        int max = 0;
        for (Shop shop : shops) {
            for (Customer customer : shop.getListOfCustomer()) {
                if (customer.getOrders().size() > max) {
                    max = customer.getOrders().size();
                    result = customer;
                }
            }
        }

        return result.getName() + " " + result.getSurmane();
    }
}
