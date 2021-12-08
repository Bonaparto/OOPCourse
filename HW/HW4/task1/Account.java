import java.math.BigDecimal;

public abstract class Account {
    protected String accountNumber;
    protected Client ownerName;
    protected BigDecimal balance;

    public Account(String accountNumber, String status, Client ownerName, BigDecimal balance) {
        this.accountNumber = accountNumber;
        if(status == null || !"1".equals(status) && !"2".equals(status)) {
            throw new IllegalArgumentException("Invalid status!");
        }
        this.ownerName = new Client(ownerName.getName(), ownerName.getPhone(), 
        ownerName.getID());
        this.balance = balance;
    }

    Client getOwner() {
        return new Client(ownerName.getName(), ownerName.getPhone(), ownerName.getID());
    }

    String getBalance() {
        return balanceBuilder();
    }
    
    protected abstract String balanceBuilder();
    public abstract void credit(BigDecimal balance);
    public abstract void debit(BigDecimal balance);
}
