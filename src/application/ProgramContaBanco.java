package application;

import java.util.Scanner;

import entities.ContaBanco;
import entities.ContaBancoNegocio;
import entities.ContaBancoSalve;

public class ProgramContaBanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ContaBanco conta = new ContaBanco(1001, "Alex", 0.0);
		ContaBancoNegocio contaB = new ContaBancoNegocio(1002, "João", 234.56, 500.00);
		ContaBancoSalve contaBS = new ContaBancoSalve(1003, "Barbara", 1.000, 5.000);

		// UPCASTING subclasse para superclass
		ContaBanco conta1 = contaB;
		conta1.getBalance();

		ContaBanco conta2 = new ContaBancoNegocio(1004, "Bob", 0.0, 200.00);
		ContaBanco conta3 = new ContaBancoSalve(1005, "Ana", 0.0, 0.01);

		// DOWNCASTING superclass para subclass

		ContaBancoNegocio contaB2 = (ContaBancoNegocio) conta2;
		contaB2.loan(100.0);

		// ContaBancoNegocio contaB3 = (ContaBancoNegocio)conta3;
		if (conta3 instanceof ContaBancoNegocio) {
			ContaBancoNegocio contaB3 = (ContaBancoNegocio) conta3;
			contaB3.loan(200.00);
			System.out.println(" Loan! ");
		}

		if (conta3 instanceof ContaBancoSalve) {
			ContaBancoSalve contaB3 = (ContaBancoSalve) conta3;
			contaB3.updateBalance();
			System.out.println(" Update! ");
		}

		ContaBanco conta7 = new ContaBanco(1006, "Bea", 1000.00);
		conta7.withdraw(200.00);
		System.out.println(conta7.getBalance());

		ContaBanco conta8 = new ContaBancoSalve(1008, "Maria", 1000.00, 0.02);
		conta8.withdraw(200.00);
		System.out.println(conta8.getBalance());

		ContaBancoSalve contaBS3 = new ContaBancoSalve(1007, "Paula", 1000.00, 0.10);
		contaBS3.withdraw(100.00);
		System.out.println(contaBS3.getBalance());
		sc.close();

		ContaBanco conta9 = new ContaBancoNegocio(1009, "Beatriz", 2000.00, 500.00);
		conta9.withdraw(500.00);
		System.out.println(conta9.getBalance());
		
	}

}
