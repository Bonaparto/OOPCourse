package HW.HW4.task1;

import java.math.BigDecimal;;

public class ATM <T extends Account> {

    public void withdraw(Account T, BigDecimal amount) {
        T.credit(amount);
    }
    
    public void deposit(Account T, BigDecimal amount) {
        T.debit(amount);
    }
}