package caelum;

import java.util.Scanner;

public class Um_caelum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int totalMesesDoAno = 12;
		int mes;

		System.out.println("Entre com o mes da suas ferias");
		int mesFerias = sc.nextInt();

		System.out.println("CALENDÁRIO");
		System.out.println(" 1 - Janeiro");
		System.out.println(" 2 - Fevereiro");
		System.out.println(" 3 - Março");
		System.out.println(" 4 - Abril");
		System.out.println(" 5 - Maio");
		System.out.println(" 6 - Junho");
		System.out.println(" 7 - Julho");
		System.out.println(" 8 - Agosto");
		System.out.println(" 9 - Setembro");
		System.out.println(" 10 - Outubro");
		System.out.println(" 11 - Novemnbro");
		System.out.println(" 12 - Dezembro");
		mes = sc.nextInt();
		switch (mes) {

		case 1:
			System.out.println("Janeiro: ");
			break;

		case 2:
			System.out.println("Fevereiro: ");
			break;

		case 3:
			System.out.println("Março: ");
			break;

		case 4:
			System.out.println("Abril: ");
			break;

		case 5:
			System.out.println("Maio: ");
			break;

		case 6:
			System.out.println("Junho: ");
			break;

		case 7:
			System.out.println("Julho: ");
			break;

		case 8:
			System.out.println("Agosto: ");
			break;

		case 9:
			System.out.println("Setembro: ");
			break;

		case 10:
			System.out.println("Outubro: ");
			break;

		case 11:
			System.out.println("Novembro: ");
			break;

		case 12:
			System.out.println("Dezembro: ");
			break;

		default:
			System.out.println("Mês inválido!  ");
			break;
		}

		if (mesFerias == mes) {
			System.out.println("Você está de FÉRIAS UHUUUL");
		} else {
			mesFerias = (mesFerias - mes) + 12;
			System.out.println("FATAL " + mesFerias + " mês/meses para você sair de férias ");
		}

		sc.close();
	}
}
