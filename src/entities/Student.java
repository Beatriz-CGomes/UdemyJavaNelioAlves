package entities;

public class Student {

	public String name;
	public double note1;
	public double note2;
	public double note3;

	public double finalGrade() {
		double grade = note1 + note2 + note3;
		return grade;
	}

	public double missingPoints() {
		if (finalGrade() < 60.00) {
			return 60.00 - finalGrade();

		} else {
			return 0.0;
		}
	}

}
