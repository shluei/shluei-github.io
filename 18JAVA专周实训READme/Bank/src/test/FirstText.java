import com.scetop.bank.Account;

public class FirstText {
        public static void main(String[] args) {
            Account account;
            // Create an account that can has a 500.00 balance.
            System.out.println("Creating an account with a 500.00 balance.");
                 account = new Account(500.00);
//code
            System.out.println("Wi‘thdraw 150.00");
            //code
            account.withdraw(150.00);
            System.out.println("Deposit 22.50");
            account.deposit(22.50);
            //code
            System.out.println("Withdraw 47.62");
            //code
            account.withdraw(47.62);
            // Print out the final account balance
            System.out.println("The account has a balance of " + account.getBalance());
        }

    }
