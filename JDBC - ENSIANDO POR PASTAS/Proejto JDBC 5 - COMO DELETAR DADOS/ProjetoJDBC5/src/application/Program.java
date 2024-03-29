package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {

//DELETANDO DADOS NO BANCO DE DADOS

		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement("DELETE FROM department " + "WHERE " +
			// DELETANDO DEPARTAMENTO
					"Id = ? ");

			st.setInt(1, 5);

			int rowAffect = st.executeUpdate();

			System.out.println("Done! Rows affected: " + rowAffect);

		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
