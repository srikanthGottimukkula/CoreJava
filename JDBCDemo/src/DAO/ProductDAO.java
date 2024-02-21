package DAO;
import java.sql.Connection;
import java.sql.SQLException;

public interface ProductDAO {
	
	void getAllProducts(Connection con) throws Exception;
	void CreateProducts(Connection con) throws SQLException;
	void UpdateProducts(Connection con) throws SQLException;
	void deleteProducts(Connection con) throws SQLException;
//	void getAllProducts(Connection con) throws SQLException;
	

}
