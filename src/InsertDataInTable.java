import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDataInTable {
    public static boolean InsertData() {
        boolean result=false;
       try {


            Connection connection = JDBCConeection.createConnection();
            String query="INSERT INTO task3.employee VALUES( ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,1);
            statement.setString(2,"ankita");
            statement.setString(3,"rai");
            statement.setString(4,"email");
            statement.setInt(5,10000);
            statement.setString(6,"se");
            statement.setInt(7,2);
            statement.setString(8,"15jan");
            statement.addBatch();
            statement.executeBatch();

           statement.setInt(1,2);
           statement.setString(2,"Astitva");
           statement.setString(3,"Singh");
           statement.setString(4,"astitva@gmail.com");
           statement.setInt(5,10300);
           statement.setString(6,"qa");
           statement.setInt(7,3);
           statement.setString(8,"01jan");
           statement.addBatch();
           statement.executeBatch();

           statement.setInt(1,3);
           statement.setString(2,"Rishabh");
           statement.setString(3,"Rai");
           statement.setString(4,"rishabh@gmail.com");
           statement.setInt(5,20000);
           statement.setString(6,"qa");
           statement.setInt(7,3);
           statement.setString(8,"22nov");
           statement.addBatch();
           statement.executeBatch();

           statement.setInt(1,4);
           statement.setString(2,"Happy");
           statement.setString(3,"Rai");
           statement.setString(4,"Happy@gmail.com");
           statement.setInt(5,25000);
           statement.setString(6,"se");
           statement.setInt(7,2);
           statement.setString(8,"25nov");
           statement.addBatch();
           statement.executeBatch();

           statement.setInt(1,5);
           statement.setString(2,"Raj");
           statement.setString(3,"Singh");
           statement.setString(4,"Raj@gmail.com");
           statement.setInt(5,26000);
           statement.setString(6,"se");
           statement.setInt(7,2);
           statement.setString(8,"30nov");
           statement.addBatch();
           statement.executeBatch();
           statement.close();
           connection.close();
           result=true;


        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
