import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeUttils {

    public static void EmployeeWithNameDegignation(){
        try {

            Connection connection = JDBCConeection.createConnection();
            Statement statement = connection.createStatement();
            ResultSet FirstQuery = statement.executeQuery("select * from task3.employee;");
            while (FirstQuery.next()) {
                System.out.println(FirstQuery.getInt(1) + " " +(FirstQuery.getString(2) +FirstQuery.getString(3))+  "   " + FirstQuery.getString(4) +"   " +FirstQuery.getString(6));
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void EmployeeWithSeAndQe(){
        try {

            Connection connection = JDBCConeection.createConnection();
            Statement statement = connection.createStatement();
            ResultSet SecondQuery = statement.executeQuery("select * from task3.employee where designation='se' or designation='qa';");
            while (SecondQuery.next()) {
                System.out.println(SecondQuery.getInt(1) + " " +(SecondQuery.getString(2) +SecondQuery.getString(3))+  "   "  + SecondQuery.getString(4) +"  " + SecondQuery.getString(5) +"   " +SecondQuery.getString(6)+"   " +SecondQuery.getString(7)+"   " +SecondQuery.getString(8));
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void EmployeeWithReportingManager(){
        try {

            Connection connection = JDBCConeection.createConnection();
            Statement statement = connection.createStatement();
            ResultSet ThirdQuery = statement.executeQuery("select * from task3.employee where reportTo='manager'");
            while (ThirdQuery.next()) {
                System.out.println(ThirdQuery.getInt(1) + " " +(ThirdQuery.getString(2) +ThirdQuery.getString(3))+  "   "  + ThirdQuery.getString(4) +"  " + ThirdQuery.getString(5) +"   " +ThirdQuery.getString(6)+"   " +ThirdQuery.getString(7)+"   " +ThirdQuery.getString(8));
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void EmployeeStartWithA(){
        try {

            Connection connection = JDBCConeection.createConnection();
            Statement statement = connection.createStatement();
            ResultSet FourthQuery = statement.executeQuery("select * from task3.employee where FirstName like 'A%'");
            while (FourthQuery.next()) {
                System.out.println(FourthQuery.getInt(1) + " " +(FourthQuery.getString(2) +FourthQuery.getString(3))+  "   "  + FourthQuery.getString(4) +"  " + FourthQuery.getString(5) +"   " +FourthQuery.getString(6)+"   " +FourthQuery.getString(7)+"   " +FourthQuery.getString(8));
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void EmployeeWithTop5Salary(){
        try {

            Connection connection = JDBCConeection.createConnection();
            Statement statement = connection.createStatement();
            ResultSet FifthQuery = statement.executeQuery("select * from task3.employee group by salary order by salary desc  limit 2 ");
            while (FifthQuery.next()) {
                System.out.println(FifthQuery.getInt(1) + " " +(FifthQuery.getString(2) +FifthQuery.getString(3))+  "   "  + FifthQuery.getString(4) +"  " + FifthQuery.getString(5) +"   " +FifthQuery.getString(6)+"   " +FifthQuery.getString(7)+"   " +FifthQuery.getString(8));
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void Employeey2ndHighestSalary(){
        try {

            Connection connection = JDBCConeection.createConnection();
            Statement statement = connection.createStatement();
            ResultSet SixthQuery = statement.executeQuery("select * from task3.employee group by salary order by salary desc  limit 1,1 ");
            while (SixthQuery.next()) {
                System.out.println(SixthQuery.getInt(1) + " " +(SixthQuery.getString(2) +SixthQuery.getString(3))+  "   "  + SixthQuery.getString(4) +"  " + SixthQuery.getString(5) +"   " +SixthQuery.getString(6)+"   " +SixthQuery.getString(7)+"   " +SixthQuery.getString(8));
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void EmployeeyLessSalaryThan2ndHighst(){
        try {

            Connection connection = JDBCConeection.createConnection();
            Statement statement = connection.createStatement();
            ResultSet seventhQuery = statement.executeQuery("select * from task3.employee group by salary order by salary desc limit 2,5 ");
            while (seventhQuery.next()) {
                System.out.println(seventhQuery.getInt(1) + " " +(seventhQuery.getString(2) +seventhQuery.getString(3))+  "   "  + seventhQuery.getString(4) +"  " + seventhQuery.getString(5) +"   " +seventhQuery.getString(6)+"   " +seventhQuery.getString(7)+"   " +seventhQuery.getString(8));
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void EmployeeyWithDepartmentName(){
        try {

            Connection connection = JDBCConeection.createConnection();
            Statement statement = connection.createStatement();
            ResultSet EigthQuery=statement.executeQuery("select FirstName,name from task3.employee join task3.department where employee.id=department.id;");
            while (EigthQuery.next()) {
                System.out.println(EigthQuery.getInt(1) + " " +(EigthQuery.getString(2) +EigthQuery.getString(3))+  "   "  + EigthQuery.getString(4) +"  " + EigthQuery.getString(5) +"   " +EigthQuery.getString(6)+"   " +EigthQuery.getString(7)+"   " +EigthQuery.getString(8));
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void EmployeeyWithCity(){
        try {

            Connection connection = JDBCConeection.createConnection();
            Statement statement = connection.createStatement();
            ResultSet ninethQuery=statement.executeQuery("select distinct FirstName,city from task3.employee join task3.department on employee.id=department.id and city ='noida'");
            while (ninethQuery.next()) {
                System.out.println(ninethQuery.getString(1) + " " + ninethQuery.getString(2));
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void TotalSalary(){
        try {

            Connection connection = JDBCConeection.createConnection();
            Statement statement = connection.createStatement();
            ResultSet TenthQuery=statement.executeQuery("select sum(salary)  from task3.employee;");
            while (TenthQuery.next()) {
                System.out.println(TenthQuery.getInt(1));
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void AvreageSalary(){
        try {

            Connection connection = JDBCConeection.createConnection();
            Statement statement = connection.createStatement();
            ResultSet ELeventhQuery=statement.executeQuery("select avg(salary)as avg_salary from task3.employee join task3.department on employee.id=department.id and city ='noida';");
            while (ELeventhQuery.next()) {
                System.out.println(ELeventhQuery.getInt(1));
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void TotalSalaryWithDepartment(){
        try {

            Connection connection = JDBCConeection.createConnection();
            Statement statement = connection.createStatement();
            ResultSet ELeventhQuery=statement.executeQuery("select avg(salary)as avg_salary from task3.employee join task3.department on employee.id=department.id and city ='noida';");
            while (ELeventhQuery.next()) {
                System.out.println(ELeventhQuery.getInt(1));
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
