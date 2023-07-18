package fucoesETryCacth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PrimeiraSolucao_MuitoRuimProgram {

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
			PrimeiraSolucao_MuitoRuimEntities muitoRuim = new PrimeiraSolucao_MuitoRuimEntities(roomNumber, checkIn,
					checkOut);
			System.out.println(muitoRuim);

			System.out.println();
			System.out.println("Enter data to update the reservation:");

			System.out.println("Check-in date (dd/MM/yyyy):");
			checkIn = sdf.parse(sc.next());

			System.out.println("Check-out date (dd/MM/yyyy):");
			checkOut = sdf.parse(sc.next());

			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			} else if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			} else {
				muitoRuim.updateDates(checkIn, checkOut);
				System.out.println(muitoRuim);
			}

		}

		sc.close();

	}

}
