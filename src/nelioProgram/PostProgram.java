package nelioProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


import nelioEntites.PostComentario;
import nelioEntites.PostNovo;

public class PostProgram {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		PostComentario cc1 = new PostComentario("Tenha uma ótima viagem");
		PostComentario cc2 = new PostComentario("Isso é maravilhoso");
		PostComentario cc3 = new PostComentario("Boa noite ");
		PostComentario cc4 = new PostComentario("Que a força esteja com você");

	
        PostNovo post1 = new PostNovo(sdf.parse("10/07/2023 13:05:44"), " Viajando para nova Zelandia", " Eu vou viajar para esse pais maravilhoso", 12);
		post1.addComentarios(cc1);
		post1.addComentarios(cc2);
        
		PostNovo post2 = new PostNovo(sdf.parse("28/07/2018 13:05:44"), "Good night guys ", "See you tomorrow", 5);

		post2.addComentarios(cc3);
		post2.addComentarios(cc4);

		
		System.out.println(post1);
		System.out.println();
		System.out.println(post2);
		
		sc.close();
	}

}
