import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConeection {
//    static Connection connection;
        static Connection connection=null;
        private JDBCConeection(){
        }

        public static Connection createConnection () {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdb", "root", "Happy420@");

            }catch (Exception e){
                e.printStackTrace();
            }
        return connection;
    }

}
