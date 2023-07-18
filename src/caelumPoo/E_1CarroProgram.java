package caelumPoo;

import java.util.Scanner;

public class E_1CarroProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		E_1Carro meuCarro = new E_1Carro();
		meuCarro.cor = "Preto";
		meuCarro.modelo = "Toyota Etios";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.ligar();
		meuCarro.acelerar(20);
		System.out.println(meuCarro.velocidadeAtual);
		
		
		sc.close();

	}

}
