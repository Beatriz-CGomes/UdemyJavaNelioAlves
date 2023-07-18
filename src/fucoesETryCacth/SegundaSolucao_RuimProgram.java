package fucoesETryCacth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SegundaSolucao_RuimProgram {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

		System.out.print("Room number:");
		int roomNumber = sc.nextInt();

		System.out.println("Check-in date (dd/MM/yyyy):");
		Date checkIn = sdf.parse(sc.next());

		System.out.println("Check-out date (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			SegundaSolucao_RuimEntites ruim = new SegundaSolucao_RuimEntites(roomNumber, checkIn, checkOut);
			System.out.println(ruim);

			System.out.println();
			System.out.println("Enter data to update the reservation:");

			System.out.println("Check-in date (dd/MM/yyyy):");
			checkIn = sdf.parse(sc.next());

			System.out.println("Check-out date (dd/MM/yyyy):");
			checkOut = sdf.parse(sc.next());

			String error = ruim.updateDates(checkIn, checkOut);
			if (error != null) {
				System.out.println("Error in reservation " + error);
			} else {
				System.out.println(ruim);
			}
		}

		sc.close();

	}

}
