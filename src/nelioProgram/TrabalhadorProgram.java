package nelioProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import nelioEntites.Trabalhador;
import nelioEntites.TrabalhadorDepartamento;
import nelioEntites.TrabalhadorHora;
import nelioEnum.TrabalhadorStatus;

public class TrabalhadorProgram {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Entre com departamento: ");
		String departamentoNome = sc.nextLine();

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		//sc.nextLine();
		System.out.print("Nivel: ");
		String status = sc.nextLine();

		System.out.print("Salário:");
		double baseSalario = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nome, TrabalhadorStatus.valueOf(status), baseSalario,
				new TrabalhadorDepartamento(departamentoNome));

		// associando os contratos
		System.out.println();
		System.out.println("Quantos contratos o trabalhador vai ter?");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Entre com contrato # " + (i + 1));
			System.out.print("Data (MM/yyyy): ");
			Date contratoData = sdf.parse(sc.next());

			System.out.print("Valor por hora");
			double valorPorHora = sc.nextDouble();

			System.out.print("Duração - Horas: ");
			int horas = sc.nextInt();
			TrabalhadorHora contrato = new TrabalhadorHora(contratoData, valorPorHora, horas);
			trabalhador.addContrato(contrato);
		}

		// entrando com mes e ano
		System.out.println();
		System.out.println("Entre com mes e ano para calcular a renda (MM/yyyy)");
		String mesEAno = sc.next();

		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));

		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento " + trabalhador.getDepartamento().getNome());
		System.out.println("Salário de mes e ano " + mesEAno + " : " +  String.format("%.2f", trabalhador.renda(ano, mes)));

		sc.close();
	}
}
