package HW.HW3.task1;

import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class Account {
    protected String accountNumber;
    protected String status;
    protected Client ownerName;
    protected BigDecimal balance;
    protected ArrayList<Operation> operations;

    public BankAccount(String accountNumber, String status, String ownerName, BigDecimal balance) {

    }

    String getNumber() {
        return accountNumber;
    }

    String getStatus() {
        return status;
    }
    
    BigDecimal getBalance() {
        return balance;
    }

    Client getOwner() {
        return ownerName;
    }
    
    void setStatus(String status) {
        this.status = status;
    }

    protected String balanceBuilder() {
        return 
    } 

    public void credit(BigDecimal balance) {
        this.balance.add(balance);
    }

    public void debit(BigDecimal balance) {
        this.balance.subtract(balance);
    }

    public void paymentForService() {
        this.balance.subtract(new BigDecimal("100.00"));
    }     

    public void getStatement() {
        
    }

}
