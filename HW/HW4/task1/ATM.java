import java.math.BigDecimal;;

public class ATM <T extends Account> {

    public void withdraw(T anyname, BigDecimal amount) {
        anyname.credit(amount);
    }
    
    public void deposit(T anyname, BigDecimal amount) {
        anyname.debit(amount);
    }
}