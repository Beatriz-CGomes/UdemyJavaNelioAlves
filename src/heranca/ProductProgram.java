package heranca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProductProgram {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();

		List<Product> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			System.out.println("Product # " + i + 1 + "data: ");
			System.out.println("Common, used or imported (c/u/i) ");
			char resp = sc.next().charAt(0);

			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Price:");
			double price = sc.nextDouble();

			if (resp == 'i' || resp == 'I') {
				System.out.println("Custons fee: ");
				double customsFee = sc.nextDouble();

				list.add(new ProductImported(name, price, customsFee));

			} else if (resp == 'c' || resp == 'C') {

				list.add(new Product(name, price));

			} else {
				System.out.println("Manufacture date (DD/MM/YYYY):");
				Date manuFacture = sdf.parse(sc.next());

				list.add(new ProductUsed(name, price, manuFacture));
			}

		}

		System.out.println();
		System.out.println("Prices Tags: ");
		for(Product product : list){
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
