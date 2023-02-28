package application;

import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student stu = new Student();

		System.out.println("Name Student: ");
		stu.name = sc.nextLine();

		System.out.println("First Note: ");
		stu.note1 = sc.nextDouble();

		System.out.println("Second Note: ");
		stu.note2 = sc.nextDouble();

		System.out.println("Third Note: ");
		stu.note3 = sc.nextDouble();

		System.out.println("Final Grade: " + stu.finalGrade());

		if (stu.finalGrade() < 60.00) {
			System.out.println(" FAILED! Missing:  " + stu.missingPoints());
		} else {
			System.out.println("PASS " + stu.finalGrade());
		}

		sc.close();

	}

}
