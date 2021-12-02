import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDataEmployeeUtility {
    public  void InsertData() {
        Scanner sc=new Scanner(System.in);
        int id;
        String FirstName;
        String LastName;
        String email;
        int salary;
        int reportTo;
        String designation;
        String date;
       try {

            Connection connection = JDBCConeection.createConnection();
            String query="INSERT INTO task3.employee VALUES( ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
           System.out.println("id of employee");
           statement.setInt(1,sc.nextInt());
           System.out.println("First Name of employee");
           statement.setString(2,sc.next());
           System.out.println("last name of employee");
           statement.setString(3,sc.next());
           System.out.println("email of employee");
           statement.setString(4,sc.next());
           System.out.println("salry of employee");
           statement.setInt(5,sc.nextInt());
           System.out.println("designation of employee");
           statement.setString(6,sc.next());
           System.out.println("reportto their manager");
           statement.setInt(7,sc.nextInt());
           System.out.println("joining date of employee");
           statement.setString(8,sc.next());
           statement.addBatch();
           statement.executeBatch();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
