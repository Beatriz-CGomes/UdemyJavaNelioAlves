package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {

//DELETANDO DADOS NO BANCO DE DADOS

		Connection conn = null;
		Statement st = null;
		try {
			conn = DB.getConnection();
			//NÃO É PARA CONFIRMAR AS OPERAÇÕES AUTOMATICAMENTE, A OPERAÇÃO VAI DEPENDER DO PROGRAMADOR
			conn.setAutoCommit(false);
			st = conn.createStatement();

			// ATUALIZAÇÃO DOS VENDEDORES
			// TODO VENDEDOR QUE PERTECER AO DEPARTAMENTO 1 TERÁ O SALÁRIO ATUALIZADO PARA
			// 2090
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 " + "WHERE departmentId = 1");

			//PROTEGENDO COM UMA TRANSAÇÃO PARA PODER RODAR TUDO OU NÃO RODAR NADA
			int x = 1;
			if(x < 2) {
				throw new SQLException("Fake error");
			}
			
			// TODO VENDEDOR QUE PERTECER AO DEPARTAMENTO 2 TERÁ O SALÁRIO ATUALIZADO PARA
			// 3090
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 " + "WHERE departmentId = 2");

			//AQUI CONFIRMA QUE A OPERAÇÃO ACABOU
			conn.commit();
			System.out.println("Rows1 " + rows1);
			System.out.println("Rows2 " + rows2);
		} catch (SQLException e) {
			try {
				//SE GERAR O ROLLBACK INDICA QUE GEROU O ERRO E ISSO PRECISA SER INFORMADO PARA A APLICAÇÃO
				conn.rollback();
				//AQUI ESTOU INFORMANDO QUE A TRANSÇÃO NÃO OCORREU E ESTOU INDICANDO O MOTIVO
				throw new DbException("Transaction rolled back! Cause by " + e.getMessage());
			} catch (SQLException el) {
				//AQUI É QUANDO DA UM ERRO NO ROLLBACK, POIS TENTEI VOLTAR E GEROU UM ERRO
				throw new DbException("Error trying to rollback! Cause by " + el.getMessage());
			}
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
