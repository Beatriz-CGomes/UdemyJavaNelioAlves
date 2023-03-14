package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Request;
import entities.RequestClient;
import entities.RequestItem;
import entities.RequestProduct;
import entities.enums.RequestStatus;

public class ProgramRequest {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter Cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.println("Bityh date (DD/MM/YYYY)");
		Date birthDate = sdf.parse(sc.next());

		RequestClient client = new RequestClient(name, email, birthDate);

		System.out.println("Enter order data: ");
		System.out.println("Status: ");
		RequestStatus status = RequestStatus.valueOf(sc.next());

		Request res = new Request(new Date(), status, client);

		System.out.println("How many items to this order? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Entre # " + (i + 1) + " item data: ");
			System.out.print("Product Name: ");
			sc.nextLine();
			String productName = sc.nextLine();

			System.out.print("Product Price: ");
			double productPrice = sc.nextDouble();

			RequestProduct products = new RequestProduct(productName, productPrice);

			System.out.println("Quantity: ");
			int quantity = sc.nextInt();

			RequestItem resque = new RequestItem(quantity, productPrice, products);

			res.addItem(resque);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(res);

		sc.close();
	}

}
