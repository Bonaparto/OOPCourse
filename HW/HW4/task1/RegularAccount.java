import java.math.BigDecimal;

public class RegularAccount extends Account{
    public RegularAccount(String number, String status, Client owner, BigDecimal balance) {
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

        this.balance = newBalance;
    }

    protected String balanceBuilder() {
        return "Your regular account balance is " + balance.toString();
    }
}
