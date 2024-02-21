import java.sql.Connection;

import DAO.ProductDAO;
import DAOImpl.ProductDAOImpl;
import util.ConnectionUtil;

public class jdbcMain {

	public static void main(String[] args) {
		try (Connection con = ConnectionUtil.getConnection()) {
			ProductDAO dao = new ProductDAOImpl();
			dao.getAllProducts(con);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
