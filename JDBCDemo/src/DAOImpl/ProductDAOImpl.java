package DAOImpl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.ProductDAO;

import java.sql.*;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public void getAllProducts(Connection con) throws Exception {
		Statement statement = con.createStatement();

		ResultSet rst = statement.executeQuery("select * from product");

		while (rst.next()) {
			System.out.println(rst.getInt(1) + " " + rst.getString(2) + " " + rst.getDouble(3));
		}

	}

	@Override
	public void CreateProducts(Connection con) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void UpdateProducts(Connection con) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProducts(Connection con) throws SQLException {
		// TODO Auto-generated method stub

	}

}
