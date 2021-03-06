package HW.HW3.task1;

import java.math.BigDecimal;
import java.util.ArrayList;

public abstract class Account {
    protected String accountNumber;
    protected String status;
    protected Client ownerName;
    protected BigDecimal balance;
    protected ArrayList<Operation> operations;

    public Account(String accountNumber, String status, Client ownerName, BigDecimal balance) {
        this.accountNumber = accountNumber;
        if(status == null || !"1".equals(status) && !"2".equals(status)) {
            throw new IllegalArgumentException("Invalid status!");
        }
        this.status = status;
        this.ownerName = new Client(ownerName.getName(), ownerName.getPhone(), 
        ownerName.getID());
        this.balance = balance;
        this.operations = new ArrayList<Operation>();
    }

    String getNumber() {
        return accountNumber;
    }

    String getStatus() {
        return status;
    }
    
    String getBalance() {
        return balanceBuilder();
    }

    Client getOwner() {
        return new Client(ownerName.getName(), ownerName.getPhone(), ownerName.getID());
    }
    
    void setStatus(String status) {
        if (status == null || !"1".equals(status) && !"2".equals(status)) {
			throw new IllegalArgumentException("Invalid status!");
		}
		this.status = status;
    }

    protected abstract String balanceBuilder();
    public abstract void credit(BigDecimal balance);
    public abstract void debit(BigDecimal balance);
    public abstract void paymentForService();
    public abstract void getStatement();
}
