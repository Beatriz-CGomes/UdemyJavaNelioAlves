package caelumPoo;

import java.util.Scanner;

public class CarroProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Carro meuCarro = new Carro();
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
