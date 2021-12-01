import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDataInTable {
    public static boolean InsertData() {
        Scanner sc=new Scanner(System.in);
        int id;
        String FirstName;
        String LastName;
        String email;
        int salary;
        int reportTo;
        String designation;
        String date;
        boolean result=false;
       try {

            Connection connection = JDBCConeection.createConnection();
            String query="INSERT INTO task3.employee VALUES( ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
           statement.setInt(1,sc.nextInt());
           statement.setString(2,sc.next());
           statement.setString(3,sc.next());
           statement.setString(4,sc.next());
           statement.setInt(5,sc.nextInt());
           statement.setString(6,sc.next());
           statement.setInt(7,sc.nextInt());
           statement.setString(8,sc.next());
           statement.addBatch();
           statement.executeBatch();
           statement.close();
           connection.close();
           connection.close();
           result=true;


        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
