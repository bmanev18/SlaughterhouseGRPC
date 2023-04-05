import com.database.DAO;
import com.database.DAOImpl;

import java.sql.SQLException;

public class testche {
    public static void main(String[] args) throws SQLException {
        DAO dao = new DAOImpl();
        /*dao.createAnimalPart(1,"Wing",5);
        dao.createTray(9,"Wing");
        dao.createTrayContains(2,1);
        dao.createProduct("Wing");
        dao.createProductContains(1,2);*/
        System.out.println(dao.getAllRegNumber(1));
        System.out.println(dao.getAllProducts(1));


    }
}
