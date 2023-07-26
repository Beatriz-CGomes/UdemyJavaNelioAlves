package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {

		Connection conn = null; // aqui conecta com banco
		Statement st = null; // aqui faz a consulta
		ResultSet rs = null; // aqui guarda a consulta

		try {
			conn = DB.getConnection();

			st = conn.createStatement();

			// rs está guardando o resultado de consulta
			rs = st.executeQuery("select * from department");

			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
