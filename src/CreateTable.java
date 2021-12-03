import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public  void createTable() throws SQLException {

        Connection connection = JDBCConeection.createConnection();
        Statement statement = connection.createStatement();

        String table1="create table task3.galemployee(id int(20) primary key auto_increment,name varchar(200))";
        statement.executeUpdate(table1);
        System.out.println("table created");
    }
}
