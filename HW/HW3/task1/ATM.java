package HW.HW3.task1;

import java.math.BigDecimal;

public class ATM implements Device{

    public ATM(){};

    public void withdraw(Account account, BigDecimal amount){
        account.credit(amount);
    }

    public void deposit(Account account, BigDecimal amount) {
        account.debit(amount);
    }

    public void getStatement(Account account) {
        account.getStatement();
    }

    public void getBalance(Account account) {
        System.out.println(account.getBalance());
    }
}
