package heranca;

public class AccountBussiness extends Account {

	private Double loanLimit;

	public AccountBussiness() {
		super();
	}

	public AccountBussiness(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance -= amount - 10.0;
		}
	}

	@Override
	public double withdraw(double amount) {
		super.withdraw(amount);
		return balance -= 2.0;
	}
	
	
}
