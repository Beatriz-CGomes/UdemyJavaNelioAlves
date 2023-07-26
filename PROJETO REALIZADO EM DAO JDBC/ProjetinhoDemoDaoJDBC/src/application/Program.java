package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SellerDao sD = DaoFactory.createSellerDao();
		System.out.println("=== TEST 1: seller findyById ==== ");
		Seller seller = sD.findById(3);

		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findyByDepartment ==== ");
		Department department = new Department(2, null);
		List<Seller> list = sD.findByDepartment(department);
		for (Seller sell : list) {
			System.out.println(sell);
		}

		System.out.println("\n=== TEST 3: seller findAll ==== ");
		list = sD.findAll();
		for (Seller sell : list) {
			System.out.println(sell);
		}

		System.out.println("\n=== TEST 4: seller insert ==== ");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 3000.0, department);
		sD.insert(newSeller); // inserido no banco de dados
		System.out.println("Inserted! New id: " + newSeller.getId());

		System.out.println("\n=== TEST 5: seller update ==== ");
		seller = sD.findById(1);
		seller.setName("Martha Waine");
		sD.update(seller); // aqui salvado a alteração
		System.out.println("Update Completed");

		System.out.println("\n=== TEST 6: seller delete ==== ");
		System.out.println("Entre id for delete set");
		int numberId = sc.nextInt();
		sD.deleteById(numberId);
		System.out.println("Delete completed");

		sc.close();
	}

}
