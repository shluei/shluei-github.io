package com.scetop.bank;
import java.util.ArrayList;
import java.util.List;
public class Customer {
    private String firstName;
    private String lastName;
    private Account saingsAccount;
    private Account checkingAccount;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.size()) {
            return accounts.get(index);
        }
        return null;
    }
    public int getNumOfAccounts() {
        return accounts.size();
    }
}
