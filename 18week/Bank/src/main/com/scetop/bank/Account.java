package com.scetop.bank;

public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }
    public double getBalance() {
        return balance;
    }
    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        }
        return true;
    }
    public boolean withdraw(double amt){
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            return true;
        }
        return false;
    }
}
