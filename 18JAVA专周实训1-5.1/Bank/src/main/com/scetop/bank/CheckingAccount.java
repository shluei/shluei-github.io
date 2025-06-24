package com.scetop.bank;

public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
        overdraftProtection = 0;
    }

    public CheckingAccount(double balance, double protect) {
        super(balance);
        overdraftProtection = protect;
    }

    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            return true;
        } else {
            double need = amt - balance;
            if (overdraftProtection >= need) {
                balance = 0;
                overdraftProtection -= need;
                return true;
            }
            return false;
        }
    }
}
