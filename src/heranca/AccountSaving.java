package heranca;

public class AccountSaving extends Account {

	private Double interestRate;

	public AccountSaving() {
		super();
	}

	public AccountSaving(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		//fazendo um update do balance
		balance += balance * interestRate;
	}

	@Override
	public final double withdraw(double amount) {
		return balance -= amount;
	}
	
}


