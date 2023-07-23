package tryCacth;

public class FixacaoAccountEntites {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public FixacaoAccountEntites() {

	}

	public FixacaoAccountEntites(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}

	private void validateWithdraw(double amount) {
		if (amount > getBalance()) {
			throw new FixacaoAccount_ExceptionPersonalizada("Withdraw error: Not enough balance");
		}
		if (amount > getWithdrawLimit()) {
			throw new FixacaoAccount_ExceptionPersonalizada("Withdraw error: The amount exceeds withdraw limit");
		}
	}

}
