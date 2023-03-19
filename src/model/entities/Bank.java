package model.entities;

import model.exceptions.BankDomainException;

public class Bank {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Bank() {

	}

	public Bank(Integer number, String holder, Double balance, Double withdrawLimit) {
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

	public void setBalance(Double balance) {
		this.balance = balance;
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
		search(amount);
		balance -= amount;
	}

	public void search(double amount) {

		if (amount > getWithdrawLimit()) {
			throw new BankDomainException("The amount exceeds withdraw limit");
		}
		if (amount  == 0.0) {
			throw new BankDomainException("Not enough balance");
		}
	}

}
