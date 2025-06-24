package com.scetop.bank;

public class SavingsAccount extends Account{
    private SavingsAccount protectedBy;

    public CheckingAccount(double init_balance){
        super(init_balance);
    }
    public CheckingAccount(double init_balance,SavingsAccount protectedBy){
        super(init_balance);
        this.protectedBy = protectedBy;
    }
    public boolean withdraw(double amt){
        if (balance >= amt){
            balance -= amt;
        }else{
            if (protectedBy.getBalance() >=(amt - balance)){
                protectedBy.withdraw(amt - balance);
                balance = 0;
            }
            else {
                return false
            }
        }
        return true;
    }



}
