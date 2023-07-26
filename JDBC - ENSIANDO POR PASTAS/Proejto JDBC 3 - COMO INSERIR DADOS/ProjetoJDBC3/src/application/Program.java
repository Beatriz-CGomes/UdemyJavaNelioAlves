package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args)  {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = null;
		//PreparedStatement faz a inserção de dados
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
             /*
			st = conn.prepareStatement("INSERT INTO seller " + "("
					+ " Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES " + "(?, ?, ?, ?, ?)", 
					//
				 Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, "Carl Purple");
			st.setString(2, "carl@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 3500.00);
			st.setInt(5, 4);
			
			//para alteração de dados precisa chamar o executeUpdate
			*/
			//UMA FUNÇÃO QUE ESTÁ INSERINDO DOIS DEPARTAMENTOS AO MESMO TEMPO
			st = conn.prepareStatement("INSERT INTO department (Name) VALUES ('D1'), ('D2')", 
					Statement.RETURN_GENERATED_KEYS);
			//variavel que recebe o valor alterado no banco de dados
			int rowsAffectefd = st.executeUpdate();
			
			if(rowsAffectefd > 0) {
				ResultSet rs = st.getGeneratedKeys(); //função que retorna um resultset
				//resulset pode retornar mais de um valor
				
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! id = " + id);
				}
			} else {
				System.out.println("No rowns affected!");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		//} catch(ParseException e) {
			//e.printStackTrace();
		} finally {
			//FECHANDO A CONEXAO COM BANCO DE DADOS
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}
}
