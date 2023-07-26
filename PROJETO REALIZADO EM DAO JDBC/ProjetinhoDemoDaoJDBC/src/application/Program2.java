package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// FINDBYID
		DepartmentDao dD = DaoFactory.createDepartmentDao();
		System.out.println("=== TEST 1: department findyById ==== ");
		Department dp = dD.findById(9);
		System.out.println(dp);

		// FINDALL
		System.out.println("\n=== TEST 2: seller findAll ==== ");
        List<Department> list = dD.findAll();
        for(Department dpa: list) {
        	System.out.println(dpa);
        }
		// INSERT
		System.out.println("\n=== TEST 3: department insert ==== ");
		Department newDp = new Department(12, "Cook");
		dD.insert(newDp);
		System.out.println("Inserted! New id: " + newDp.getId());

		// UPDATE
		System.out.println("\n=== TEST 4: department update ==== ");
		dp = dD.findById(1);
		dp.setName("Food");
		dD.update(dp);
		System.out.println("Update Completed");

		// DELETE
		System.out.println("\n=== TEST 5: department delete ==== ");
		System.out.println("Entre id for delete set");
		int numberId = sc.nextInt();
		dD.deleteById(numberId);
		System.out.println("Delete completed");

		sc.close();
	}

}
