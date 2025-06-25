import com.scetop.bank.Account;
import com.scetop.bank.Customer;
import com.scetop.bank.Bank;

public class FourthTest {
    public static void main(String[] args) {

        Bank bank = new Bank();

        // Add Customer Jane, Simms
        bank.addCustomer("Jane","Simms");
        //code
        //Add Customer Owen, Bryant
        bank.addCustomer("Owen","Bryant");
        //code
        // Add Customer Tim, Soley
        bank.addCustomer("Tim","Soley");
        //code
        // Add Customer Maria, Soley
        bank.addCustomer("Maria","Soley");
        //code
        for ( int i = 0; i < bank.getNumOfCustomers(); i++ ) {
            Customer customer = bank.getCustomer(i);

            System.out.println("Customer [" + (i+1) + "] is "
                    + customer.getLastName()
                    + ", " + customer.getFirstName());
        }
    }
}