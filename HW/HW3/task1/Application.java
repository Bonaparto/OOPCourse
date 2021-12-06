package HW.HW3.task1;

import java.math.BigDecimal;

public class Application {
    static Account rAcc;
    static Account pAcc;
    static Account gAcc;

    public static void main(String[] args) {
        Client client = new Client("John", "+727277272", "912312121212");

		rAcc = new RegularAccount("4400********0001", "1", client, new BigDecimal("10000.00"));
		pAcc = new PremiumAccount("4400********0001", "1", client, new BigDecimal("10000.00"));
		gAcc = new GoldenAccount("4400********0001", "1", client, new BigDecimal("10000.00"));
	
		ATM atm = new ATM();

		atm.withdraw(rAcc, new BigDecimal("1000.00"));
		atm.withdraw(pAcc, new BigDecimal("1000.00"));
		atm.withdraw(gAcc, new BigDecimal("1000.00"));

		print();

		atm.deposit(rAcc, new BigDecimal("1000.00"));
		atm.deposit(pAcc, new BigDecimal("1000.00"));
		atm.deposit(gAcc, new BigDecimal("1000.00"));
		
		print();

		// rAcc.credit(new BigDecimal("1000.00"));
		// pAcc.credit(new BigDecimal("1000.00"));
		// gAcc.credit(new BigDecimal("1000.00"));

		// print();

		// rAcc.debit(new BigDecimal("1000.00"));
		// pAcc.debit(new BigDecimal("1000.00"));
		// gAcc.debit(new BigDecimal("1000.00"));

		// print();

		// rAcc.paymentForService();
		// pAcc.paymentForService();
		// gAcc.paymentForService();

		// print();


		// print();
		//printOne(rAcc);
		//printOne(pAcc);
		//printOne((GoldenAccount)gAcc);

	}

	private static void print() {
		System.out.println(rAcc.getBalance());
		System.out.println(pAcc.getBalance());
		System.out.println(gAcc.getBalance());
		System.out.println();
	}

	// private static void printOne(Account account) {
	// 	System.out.println(account.getBalance());
	// 	System.out.println(account.sample());
	// 	System.out.println();
	// }
}
