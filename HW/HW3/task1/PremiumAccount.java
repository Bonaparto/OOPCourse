package HW.HW3.task1;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PremiumAccount extends Account{
    public PremiumAccount(String number, String status, Client owner, BigDecimal balance) {
        super(number, status, owner, balance);
    }

    public void credit(BigDecimal balance) {
        this.balance = this.balance.add(balance);

        Operation op = new Operation(
            "credit",
            balance,
            LocalDateTime.now()
        );

        operations.add(op);

    }
 
    public void debit(BigDecimal balance) {
        BigDecimal newBalance = this.balance.subtract(balance);

		if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Not enough money");
		}

		this.balance = newBalance.add(new BigDecimal("100.00"));
		Operation operation = new Operation(
				"debit",
                balance,
                LocalDateTime.now()
			);
		operations.add(operation);
    }

    public void paymentForService() {
        balance = balance.subtract(new BigDecimal("200"));
    }

    public void getStatement() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account statement\n");
        for(Operation o: operations) {
            if(o == null) break;
            sb.append(o.toString()).append("\n");
        }
        System.out.println(sb);
    }

    protected String balanceBuilder() {
        return "Your premium account balance is " + balance.toString();
    }
}
