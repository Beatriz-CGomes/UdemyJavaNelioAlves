package caelumPoo;

import java.util.Scanner;

public class E_2ContaProgram {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		E_2Conta conta = new E_2Conta();

		System.out.println("Nome: ");
		conta.titual.nome = sc.next();
		
		System.out.println("Sobrenome: ");
		conta.titual.sobreNome = sc.next();
		
        System.out.println(conta.titual);
        
		/*
		cliente.nome = "Beatriz";
		conta.numero = 12345;
		conta.saldo = 3600;

	
		// conta.saca(2500);
		conta.deposita(150);

		boolean consegui = conta.saca(2000);
		if (consegui) {
			System.out.println("Consegui sacar " + conta.saldo);
		} else {
			System.out.println("Não consegui sacar");
		}

		Conta conta1 = new Conta();
		conta1.numero = 12346;
		conta1.saldo = 1000;

		conta1.saca(200);
		conta1.deposita(500);

		Conta conta2 = new Conta();
		conta2.saldo = 227;

		Conta conta3 = new Conta();
		conta3.saldo = 227;

		if (conta2 == conta3) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		System.out.println("---- conta 2 e 3 ");
		System.out.println(conta2.saldo);
		System.out.println(conta3.saldo);

		System.out.println("---------------");
		System.out.printf("%.2f %n", conta.saldo);
		System.out.printf("%.2f %n", conta1.saldo);
*/
        
        
        sc.close();
	}

}
