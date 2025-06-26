import com.scetop.bank.Account;
import com.scetop.bank.Customer;

/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */
public class SecondTest {

    public static void main(String[] args) {
        Customer customer;
        Account account;

        // Create an account that can has a 500.00 balance.
        System.out.println("Creating the customer Jane Smith.");
        customer = new Customer("Jane","Smith");
        //code
        System.out.println("Creating her account with a 500.00 balance.");
        account = new Account(500.00);
        //code
        System.out.println("Withdraw 150.00");
        account.withdraw(150.00);

        //code
        System.out.println("Deposit 22.50");
        account.deposit(22.50);
        //code
        System.out.println("Withdraw 47.62");
        account.withdraw(47.62);
        //code
        // Print out the final account balance
        String lastName = customer.getLastName();
        String firstName = customer.getFirstName();
        System.out.println("Customer [" + customer.getLastName()
                + ", " + customer.getFirstName()
                + "] has a balance of " + account.getBalance());
    }
}
