package com.scetop.bank;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public Account getAccount(){
        return account;
    }
    //设置与获取
    public void setAccount(Account acct) {
        account = acct;
    }
}
