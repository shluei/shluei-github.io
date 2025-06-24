import com.scetop.bank.Account;
import com.scetop.bank.Customer;

public class ThirdTest {
    public static void main(String[] args) {
        Customer customer;
        Account account;

        // Create an account that can has a 500.00 balance.
        System.out.println("Creating the customer Jane Smith.");
        customer = new Customer("Jane","Smith");
        //code
        System.out.println("Creating her account with a 500.00 balance.");
        account = new Account(500.00);
        customer.setAccount(account);

        //code
        // Perform some account transactions
        System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
        System.out.println("Deposit 22.50: " + account.deposit(22.50));
        System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
        System.out.println("Withdraw 400.00: " + account.withdraw(400.00));

        // Print out the final account balance
        String lastName = customer.getLastName();
        String firstName = customer.getFirstName();
        double balance = customer.getAccount(1).getBalance();
        System.out.println("Customer [" + customer.getLastName()
                + ", " + customer.getFirstName()
                + "] has a balance of " + account.getBalance());
    }
}

