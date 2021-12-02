import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DepartmentUtility {
    public void InsertDataInDepartment() {
        Scanner sc=new Scanner(System.in);

        try {

            Connection connection = JDBCConeection.createConnection();
            String query="INSERT INTO task3.department VALUES( ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            System.out.println("id of employee");
            statement.setInt(1,sc.nextInt());
            System.out.println(" Name of department");
            statement.setString(2,sc.next());
            System.out.println(" name of city");
            statement.setString(3,sc.next());
            statement.addBatch();
            statement.executeBatch();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
