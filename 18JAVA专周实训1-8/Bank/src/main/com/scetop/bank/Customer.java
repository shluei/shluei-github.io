package com.scetop.bank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
    public static double getSavingsAccount;
    private String firstName;
    private String lastName;
    private SavingsAccount savingsAccount;
    private CheckingAccount checkingAccount;
    private List<Account> accounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public SavingsAccount getSavingsAccount(){
        return savingsAccount;
    }
    public void setSavingsAccount(SavingsAccount savingsAccount){
        this.savingsAccount = savingsAccount;
    }
    public CheckingAccount getCheckingAccount(){
        return checkingAccount;
    }
    public void setCheckingAccount(CheckingAccount checkingAccount){
        this.checkingAccount = checkingAccount;
    }

    public int getNumOfAccounts() {
        return accounts.size();
    }
    public Account getAccount(int index){
        return accounts.get(index);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
    public void addAccount(SavingsAccount savingsAccount) {
    }
    public Iterator<Account> getAccounts(){

        return accounts.iterator();
    }
}
