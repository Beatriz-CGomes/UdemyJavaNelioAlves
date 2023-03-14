package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Post;
import entities.PostComment;

public class ProgramPost {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		PostComment c1 = new PostComment("Have nice a trip");
		PostComment c2 = new PostComment("Wow that's awesome! ");
		PostComment c3 = new PostComment("Good night ");
		PostComment c4 = new PostComment("May the Force be with you");

		Post p1 = new Post(sdf.parse("21/06/2023 13:05:44"), "Traveling to New Zealand",
				"I'm going to visit this wonderful country!", 12);

		p1.addComment(c1);
		p1.addComment(c2);

		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys ", "See you tomorrow", 5);

		p2.addComment(c3);
		p2.addComment(c4);

		System.out.println(p1);
		System.out.println();
		System.out.println(p2);

		sc.close();

	}

}
