package applicationBeecrowd;

import java.util.Scanner;

import entitiesBeecrowd.Exercicio_4Lacnhe;

public class Exercicio_4ProgramLanche {

	public static void main(String[] args) {
		// BEE 1038 Respondendo com metados
		Scanner sc = new Scanner(System.in);

		Exercicio_4Lacnhe lanche = new Exercicio_4Lacnhe();
		
		System.out.println("LANCHONETE DA PAZ");
		System.out.println("1 - Cachorro Quente R$ 4,00");
		System.out.println("2 - X-Salada R$ 4,50");
		System.out.println("3 - X-Bacon R$ 5,00");
		System.out.println("4 - Torradas Simples R$ 2,00");
		System.out.println("5 - Refrigerante R$ 1,50");
		System.out.println();
		System.out.println("---");
		
		System.out.println("O que você gostaria de comer? ");
        System.out.println("Entre com valor: ");
        lanche.price = sc.nextDouble();
        
        System.out.println("Entre com quantidade: ");
        lanche.quantity = sc.nextInt();
        
        System.out.println(lanche);
        
        
		sc.close();

	}

}
