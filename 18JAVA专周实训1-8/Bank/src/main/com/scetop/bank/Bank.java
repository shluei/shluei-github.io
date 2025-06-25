package com.scetop.bank;
import java.util.ArrayList;
import java.util.Iterator;

public class Bank {


    private ArrayList<Customer> customers = new ArrayList<>();
//    private int numberOfCustomers;
    public Bank() {
        customers = new ArrayList<>(5);
    }

    public void addCustomer(String f, String l) {
//        Customer customer = new Customer(f,l);
//        customers.add(customer);
//        numberOfCustomers++;
        customers.add(new Customer(f,l));

    }
    public int getNumOfCustomers() {
//        return numberOfCustomers;
        return customers.size();
    }
    public Customer getCustomer(int index) {
//        if ((index >= 0) && index < customers.size()) {
//            return customers.get(index);
//        }
//        return null;
        return customers.get(index);
    }
    private static Bank bank = new Bank();
   public static Bank getBank(){
        return bank;
    }
    public Iterator<Customer> getCustomers(){
       return customers.iterator();
    }

}
