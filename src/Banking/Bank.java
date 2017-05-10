package Banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<Customer> customerList = new ArrayList<>(0);
    List<Account> accountList = new ArrayList<>();
    Long lastCustomerId = 0L;
    Long lastAccountId = 0L;

    public Customer createCustomer(
            String firstName, String lastName){
        Long myNewId = lastCustomerId++;
        Customer cu = new Customer (myNewId, firstName,lastName);
        customerList.add(cu);
        return cu;
    }

    public Account createAccount (Customer cust, boolean isSavings, String currency){
                Long myNewId = lastAccountId++;
                Account acc = isSavings ?
                        new SavingsAccount(myNewId, cust,currency)
                        :
                        new DebitAccount(myNewId,cust,currency);
                // replaces the if else statement
                accountList.add(acc);
                return acc;
    }

    @Override
    public String toString() {
        return "Bank{\n" +
                "cust=" + customerList +
                "\nacc=" + accountList +
                "\nlastCustId=" + lastCustomerId +
                ", lastAccId=" + lastAccountId +
                '}';
    }
}


