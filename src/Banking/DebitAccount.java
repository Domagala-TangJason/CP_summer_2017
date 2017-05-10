package Banking;

public class DebitAccount extends Account{


    public DebitAccount(Long accountId, Customer customer, String currency) {
        super(accountId, customer, currency);
    }
}
