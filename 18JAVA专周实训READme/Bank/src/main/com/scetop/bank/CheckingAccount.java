package com.scetop.bank;

public class CheckingAccount extends Account {
    private double OverdraftProtection = -1;

    public CheckingAccount(double init_balance) {
        super(init_balance);

    }

    public CheckingAccount(double init_balance, double OverdraftProtection) {
        super(init_balance);
        this.OverdraftProtection = OverdraftProtection;
    }

    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;

        } else {
            if (OverdraftProtection == -1){
                throw new OverdraftException("",amt - balance);

            }
            double need= amt - balance;
            if (OverdraftProtection >= need) {
                balance = 0;
                OverdraftProtection -=(need) ;

            }
            else {
                throw new OverdraftException("Insufficient funds for overdraft prorection",amt -balance);
            }
        }
    }
}
