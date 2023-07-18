package ApostilaJavaDoisEntities;

public class ContaCorrente {

	private Integer number;
	private String name;
	private Double balance;

	public ContaCorrente() {
	}

	public ContaCorrente(Integer number, String name, Double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public double deposito(double quantidade) {
		return balance += quantidade;
	}

	public double saque(double quantidade) {
		return balance -= quantidade;
	}
	
	public String alterarNome(String name) {
		return this.name = name;
	}

	@Override
	public String toString() {
		return "Dados da Conta\n " +  "Número da Conta: " +   number  + ", "  + name + ", Saldo R$:" + balance ;
	}

	
	
}
