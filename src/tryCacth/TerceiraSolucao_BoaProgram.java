package tryCacth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TerceiraSolucao_BoaProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

		try {
			System.out.print("Room number:");
			int roomNumber = sc.nextInt();

			System.out.println("Check-in date (dd/MM/yyyy):");
			Date checkIn = sdf.parse(sc.next());

			System.out.println("Check-out date (dd/MM/yyyy)");
			Date checkOut = sdf.parse(sc.next());

			TerceiraSolucao_BoaEntities boa = new TerceiraSolucao_BoaEntities(roomNumber, checkIn, checkOut);
			System.out.println(boa);

			System.out.println();
			System.out.println("Enter data to update the reservation:");

			System.out.println("Check-in date (dd/MM/yyyy):");
			checkIn = sdf.parse(sc.next());

			System.out.println("Check-out date (dd/MM/yyyy):");
			checkOut = sdf.parse(sc.next());

			boa.updateDates(checkIn, checkOut);
			System.out.println(boa);

		} catch (ParseException e) {
			System.out.println("Invalida date format");
		} catch (TerceiraSolucao_BoaExceptionPersonalizada e) {
			System.out.println("Error in reservation " + e.getMessage());
		} catch (RuntimeException e) { //colocando o runtime para que o código não quebra caso haja outro erro de exceção
			System.out.println("Unexpected error");
		}

		sc.close();

	}

}
