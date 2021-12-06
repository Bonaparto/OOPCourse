package HW.HW4.task1;

import java.math.BigDecimal;

public class GoldenAccount extends Account{
    public GoldenAccount(String number, String status, Client owner, BigDecimal balance) {
        super(number, status, owner, balance);
    }

    public void credit(BigDecimal balance) {
        this.balance = this.balance.add(balance);
    }
 
    public void debit(BigDecimal balance) {
        BigDecimal newBalance = this.balance.subtract(balance);

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Not enough money");
		}
    }
}
