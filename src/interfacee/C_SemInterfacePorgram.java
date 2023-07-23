package interfacee;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C_SemInterfacePorgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro:");
		String carModel = sc.nextLine();

		System.out.print("Retirada (dd/MM/yyyy hh:mm):");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);

		System.out.print("Retorno (dd/MM/yyyy hh:mm):");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

		CarRental_SemInterface carR = new CarRental_SemInterface(start, finish, new Vehicle_SemInterface(carModel));

		System.out.print("Entre com o preço por hora:");

		System.out.print("Entre com o preço por dia:");

		System.out.println("FATURA:");

		
		
		
		
		
		sc.close();
	}

}
