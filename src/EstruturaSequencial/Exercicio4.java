package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor 
// que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o 
// salário do funcionário, com duas casas decimais

		Scanner sc = new Scanner(System.in);

		float matricula, salario, horasTrabalhadas, horasPagas;

		System.out.println("Entre com a matricula do funcionário");
		matricula = sc.nextFloat();

		System.out.println("Entre com a salario do funcionário");
		salario = sc.nextFloat();

		System.out.println("Entre com valor por hora trabalhada ");
		horasTrabalhadas = sc.nextFloat();

		horasPagas = salario * horasTrabalhadas;

		System.out.println(" Matricula " + matricula);
		System.out.printf(" SalárioA=%.2f%n ", horasPagas);

		sc.close();
	}

}
