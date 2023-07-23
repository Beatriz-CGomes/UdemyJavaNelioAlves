package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args)  {
		

		//ATUALIZANDO O SALARIO DE UM VENDEDOR
		
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					//INSERINDO O COMANDO PARA ATUALIZAR OS DADOS NO BANCO DE DADOS
					"UPDATE seller " +
				    //PEGANDO O SALARIO JÁ EXISTENTE E INSERINDO MAIS UM VALOR
				    "SET BaseSalary = BaseSalary + ?" +
				    //ATUALIZANDO O SALARIO POR DETERMINDO DEPARTAMENTO
				    "WHERE " + "(departmentId = ?)");
			
			st.setDouble(1, 500.00); //mudando o salario para mais 500 reais
			st.setInt(2, 3); //mudando o salario de todos que estão no departamento 3
			
			int rowsAffects = st.executeUpdate(); //atribuindo uma variavel para informar a quantidade de linhas alteradas
			
			System.out.println("Done! Rows affect: " + rowsAffects);
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
		
		
		
		
		
		
	}
}
