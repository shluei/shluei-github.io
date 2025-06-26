package com.scetop.bank;

public class Account {

   protected double balance;

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
    public void withdraw(double amt){
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            throw new OverdraftException("资金不足",(amt-balance));
        }
        balance -=amt;

    }
}
