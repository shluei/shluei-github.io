package com.scetop.bank;

public class SavingsAccount extends Account{
    private SavingsAccount protectedBy;

    public SavingsAccount(double init_balance){
        super(init_balance);
    }
    public SavingsAccount(double init_balance, SavingsAccount protectedBy){
        super(init_balance);
        this.protectedBy = protectedBy;
    }

    public SavingsAccount(double balance, double intersted_rate) {
        super(0.03);
    }

    public void withdraw(double amt){
        if (balance >= amt){
            balance -= amt;
        }else{
            if (protectedBy.getBalance() >=(amt - balance)){
                protectedBy.withdraw(amt - balance);
                balance = 0;
            }
            else {

            }
        }

    }



}
