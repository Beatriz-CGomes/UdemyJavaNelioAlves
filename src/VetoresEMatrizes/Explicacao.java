package VetoresEMatrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Explicacao {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "José", "Jãoo" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		System.out.println("-----------------------------");
		for (String ve : vect) {
			System.out.println(ve);
		}
		System.out.println("*********************************");
		System.out.println("Explicação Sobre Lista");

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add("Joana");
		list.add(2, "Marcos");
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------");
		list.remove(5);
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------");
		System.out.println(list.indexOf("Ana"));
		System.out.println(list.indexOf("Maria"));

		System.out.println("---------------");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("---------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		System.out.println();

		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2);
	}

}
