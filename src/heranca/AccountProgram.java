package heranca;

public class AccountProgram {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		AccountBussiness accB = new AccountBussiness(1002, "Maria", 0.0, 500.0);

		// UPCASTING - SUBINDO UMA SUBCLASSE PARA SUPERCALSSE - SUBCLASSE (ACCOUNTB)
		// SUPERCLASS(ACCUN)
		// UMA ACCOUNTBUSSINESS É UMA CONTA ACCOUNT -
		Account acc1 = accB;

		Account acc2 = new AccountBussiness(1003, "Bob", 100.3, 200.0);
		Account acc3 = new AccountSaving(1004, "Ana", 0.0, 0.1);

		// DOWNCASTING - SUBINDO UMA SUPERCLASSE PARA UMA SUBCLASSE
		// NÃO É POSSÍVEL CONVERTER O TIPO SUPERCLASSE PARA SUBCLASSE
		// SÓ FICA POSSÍVEL PORQUE TEM QUE FAZER UM CASTING MANUAL - CASTING ->
		// (AccountBussiness)
		AccountBussiness accb2 = (AccountBussiness) acc2;
		accb2.loan(0);

		// ESSA OPERAÇÃO SÓ GERA O ERRO NO MOMENTO DA EXECUÇÃO
		// AccountBussiness acc5 = (AccountBussiness) acc3;
		// PARA NÃO GERAR O ERRO PRECISA SABER O CASTING (AccountBussiness) É DO TIPO
		// ACCOUNT
		if (acc3 instanceof AccountBussiness) {
			AccountBussiness acc5 = (AccountBussiness) acc3;
			acc5.loan(200.0);
			System.out.println("Emprestimo realizado!");
		}

		if (acc3 instanceof AccountSaving) {
			AccountSaving acc5 = (AccountSaving) acc3;
			acc5.updateBalance();
			System.out.println("Update realizado!");
		}

		Account acc6 = new Account(1006, "Bea", 1000.0);
		acc6.withdraw(200.00);
		System.out.println(acc6.getBalance());

		Account acc7 = new AccountSaving(1007, "Poly", 500.00, 0.01);
		acc7.withdraw(200.00);
		System.out.println(acc7.getBalance());

		Account acc8 = new AccountBussiness(1008, "Ana", 1000.0, 2000.0);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());

	}

}
