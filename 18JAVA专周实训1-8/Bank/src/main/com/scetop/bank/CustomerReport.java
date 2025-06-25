package com.scetop.bank;

import java.util.Iterator;

public class CustomerReport {
    public void generateReport(){
        Bank bank = Bank.getBank();
                //Bank.getBank();
        Customer customer = null;
        // Generate a report
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        Iterator<Customer> customerIterator = bank.getCustomers();

//        for ( int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++ )
//        {
        while(customerIterator.hasNext()){
//            customer = bank.getCustomer(cust_idx);
            customer = customerIterator.next();

            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());
Iterator<Account> accountIterator=customer.getAccounts();
//            for ( int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++ ) {
            while(accountIterator.hasNext()){
                Account account = accountIterator.next();
//                Account account = customer.getAccount(acct_idx);
                String  account_type = "";

                // Determine the account type
                /*** Step 1:
                 **** Use the instanceof operator to test what type of account
                 **** we have and set account_type to an appropriate value, such
                 **** as "Savings Account" or "Checking Account".
                 ***/

                // Print the current balance of the account
                /*** Step 2:
                 **** Print out the type of account and the balance.
                 **** Feel free to use the currency_format formatter
                 **** to generate a "currency string" for the balance.
                 ***/
            }
        }
    }
}

