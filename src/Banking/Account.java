package Banking;

import java.math.BigDecimal;

public abstract class Account {

    private Long accountId;
    private Customer customer;
    private BigDecimal balance;
    private String currency;

    public Account(Long accountId, Customer customer, String currency){
        this.accountId = accountId;
        this.customer = customer;
        this.balance = new BigDecimal(0);
        this.currency = currency;
    }

    public Long getAccountId(){
        return accountId;
    }

    public void setAccountId(Long accountId){
        this.accountId = accountId;
    }
    // taking all the private peices and making them public
    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public BigDecimal getBalance(){
        return balance;
    }

    public void setBalance(BigDecimal balance){
        this.balance = balance;
    }

    public String getCurrency(){
        return currency;
    }

    public void setCurrency(String currency){
        this.currency = currency;
    }

    @Override
    public String toString(){
/*        return "Acccount{" +
                "accountId = " + accountId +
                ", customer = " + customer +
                ", balance = " + balance +
                we can do it this way but its clunky and long*/
        return "\n" + this.getClass().getSimpleName()
                .replace("Account","") + "{" +
                "id=" + accountId +
                ", cust=" + customer.getCustomerId() +
                ", " + currency + balance +
                "}";


    }

}
