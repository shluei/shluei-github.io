package com.scetop.bank;
import java.util.ArrayList;

public class Bank {

    private ArrayList<Customer> customers = new ArrayList<>();
    private int numberOfCustomers;
    public Bank() {
        customers = new ArrayList<>(24);
    }


    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f,l);
        customers.add(customer);
        numberOfCustomers++;
    }
    public int getNumOfCustomers() {
        return numberOfCustomers;
    }
    public Customer getCustomer(int index) {
        if ((index >= 0) && (index < customers.size())) {
            return customers.get(index);
        }
        return null;
    }
}
