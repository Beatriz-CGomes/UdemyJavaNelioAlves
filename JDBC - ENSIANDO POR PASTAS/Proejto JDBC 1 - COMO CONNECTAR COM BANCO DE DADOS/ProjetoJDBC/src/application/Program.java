package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {

		// feita conexao com banco
		Connection conn = DB.getConnection();
		// fechando a conexao com banco
		DB.closeConnection();

	}

}
