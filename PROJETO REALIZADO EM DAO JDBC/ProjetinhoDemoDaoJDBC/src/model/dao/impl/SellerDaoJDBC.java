package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.DB;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {

	private Connection conn;

	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Seller department) {
		PreparedStatement st = null;
		try {
			st = conn.prepareStatement(
					"INSERT INTO seller " + "(Name, Email, BirthDate, BaseSalary, DepartmentId) " + "VALUES "
							+ "(?, ?, ?, ?, ?)",
					// retornando o ID do novo vendedor inserido por
					Statement.RETURN_GENERATED_KEYS);

			st.setString(1, department.getName());
			st.setString(2, department.getEmail());
			st.setDate(3, new java.sql.Date(department.getBirthDate().getTime()));
			st.setDouble(4, department.getBaseSalary());
			st.setInt(5, department.getDepartment().getId());

			int rowAffected = st.executeUpdate();

			if (rowAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					department.setId(id);
				}
				DB.closeResultSet(rs);
			} else {
				throw new DbException("Unexpected error! No rows affected");
			}

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}

	}

	@Override
	public void update(Seller department) {
		PreparedStatement st = null;
		try {

			st = conn.prepareStatement("UPDATE seller "
					+ "SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? " + "WHERE Id = ? ",
					Statement.RETURN_GENERATED_KEYS);

			st.setString(1, department.getName());
			st.setString(2, department.getEmail());
			st.setDate(3, new java.sql.Date(department.getBirthDate().getTime()));
			st.setDouble(4, department.getBaseSalary());
			st.setInt(5, department.getDepartment().getId());
			st.setInt(6, department.getId());

			st.executeUpdate();

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}
	}

	@Override
	public void deleteById(Integer id) {

		PreparedStatement st = null;
		try {
			st = conn.prepareStatement("DELETE FROM seller " + " WHERE Id = ?");

			st.setInt(1, id);

			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected == 0) {
				throw new DbException("non-existent line");
			}

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
		}

	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName " + "FROM seller INNER JOIN department "
							+ "ON seller.DepartmentId = department.Id " + "WHERE seller.Id = ?");

			st.setInt(1, id);
			rs = st.executeQuery(); // aqui cai o resultado
			if (rs.next()) {
				// AQUI INSTACIAMOS UM DEPARTAMENTO E SETAMOS O VALORES
				Department dep = instantiateDepartment(rs);
				Seller seller = instantiateSeller(rs, dep);
				return seller;
			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}

	}

	private Seller instantiateSeller(ResultSet rs, Department dep) throws SQLException {
		Seller seller = new Seller();
		seller.setId(rs.getInt("Id"));
		seller.setName(rs.getString("Name"));
		seller.setEmail(rs.getString("Email"));
		seller.setBirthDate(rs.getDate("BirthDate"));
		seller.setBaseSalary(rs.getDouble("BaseSalary"));
		seller.setDepartment(dep);
		return seller; // retornando um vendedor por ID
	}

	private Department instantiateDepartment(ResultSet rs) throws SQLException {
		Department dep = new Department();
		dep.setId(rs.getInt("DepartmentId"));
		dep.setName(rs.getString("DepName"));
		return dep;
	}

	@Override
	public List<Seller> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName " + "FROM seller INNER JOIN department "
							+ "ON seller.DepartmentId = department.Id " + "ORDER BY Name ");

			rs = st.executeQuery(); // aqui cai o resultado

			List<Seller> list = new ArrayList<>();
			Map<Integer, Department> map = new HashMap<>(); // aqui é para o objeto está apontando para um único
															// departamento e não um objeto apontando por departamento

			while (rs.next()) {

				// TESTANDO SE O DEPARTAMENTO JÁ EXISTE
				Department dep = map.get(rs.getInt("DepartmentId"));
				// SE O VALOR FOR NULO AI SIM INSTACIAMOS O DEPARTAMENTO
				if (dep == null) {
					dep = instantiateDepartment(rs);
					map.put(rs.getInt("DepartmentId"), dep);
				}

				Seller seller = instantiateSeller(rs, dep);
				list.add(seller);
			}
			return list;

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Seller> findByDepartment(Department department) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName " + "FROM seller INNER JOIN department "
							+ "ON seller.DepartmentId = department.Id " + "WHERE DepartmentId = ? " + "ORDER BY Name ");

			st.setInt(1, department.getId());

			rs = st.executeQuery(); // aqui cai o resultado

			List<Seller> list = new ArrayList<>();
			Map<Integer, Department> map = new HashMap<>(); // aqui é para o objeto está apontando para um único
															// departamento e não um objeto apontando por departamento

			while (rs.next()) {

				// TESTANDO SE O DEPARTAMENTO JÁ EXISTE
				Department dep = map.get(rs.getInt("DepartmentId"));
				// SE O VALOR FOR NULO AI SIM INSTACIAMOS O DEPARTAMENTO
				if (dep == null) {
					dep = instantiateDepartment(rs);
					map.put(rs.getInt("DepartmentId"), dep);
				}

				Seller seller = instantiateSeller(rs, dep);
				list.add(seller);
			}
			return list;

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

}
