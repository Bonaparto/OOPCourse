package HW.HW3.task1;

import java.math.BigDecimal;

public class GoldenAccount extends Account{
    public GoldenAccount(String number, String status, Client owner, BigDecimal balance) {

    }

    public void credit(BigDecimal balance) {
        this.balance.add(balance);
    }
 
    public void debit(BigDecimal balance) {
        this.balance.subtract(balance);
    }

    public void paymentForService() {
        this.balance.subtract(new BigDecimal("250"));
    }

    public void getStatement() {

    }

    protected String balanceBuilder() {
        return "bala";
    }
    
}
