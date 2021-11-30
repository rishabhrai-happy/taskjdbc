import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCEmployeeAndDepartmentDatabase {
    public static void main(String[] args)  {
        try {
            Scanner sc=new Scanner(System.in);
            int choicequery;

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/task3", "root", "Happy420@");

             Statement statement = connection.createStatement();


            do{
                System.out.println("1.All the Employee with following details - id,name(firstName+lastName),email,designation");
                System.out.println("2.All the Employee with designation as Software engineer and QA engineer");
                System.out.println("3.All the Employee with their reporting manager");
                System.out.println("4.All the Employee whose name start with Alphabet 'A'");
                System.out.println("5.Top 5 Employee with highest Salary");
                System.out.println("6. employee with 2nd highest salary in the company");
                System.out.println("7.All the employee whose salary is less than employee with 2nd highest salary");
                System.out.println("8.All the Employee with their department name");
                System.out.println("9.List of the employee who were working on Y city");
                System.out.println("10.Total Salary given to Employee in the company");
                System.out.println("11.Average Salary given to Employee in city Y");
                System.out.println("12. Total Salary given to the Employee department wise");
                System.out.println("13.finish");
                System.out.println();
                choicequery = sc.nextInt();
                switch (choicequery){
                    case 1:
                        ResultSet FirstQuery = statement.executeQuery("select * from task3.department;");
                        while (FirstQuery.next()) {
                            System.out.println(FirstQuery.getInt(1) + " " +(FirstQuery.getString(2) +FirstQuery.getString(3))+  "   " + FirstQuery.getString(4) +"   " +FirstQuery.getString(6));
                            System.out.println();
                        }
                        break;
                    case 2:
                        ResultSet SecondQuery = statement.executeQuery("select * from task3.employee where designation='se' or designation='qa';");
                        while (SecondQuery.next()) {
                            System.out.println(SecondQuery.getInt(1) + " " +(SecondQuery.getString(2) +SecondQuery.getString(3))+  "   "  + SecondQuery.getString(4) +"  " + SecondQuery.getString(5) +"   " +SecondQuery.getString(6)+"   " +SecondQuery.getString(7)+"   " +SecondQuery.getString(8));
                            System.out.println();
                        }
                        break;
                    case 3:
                        ResultSet ThirdQuery = statement.executeQuery("select * from task3.employee where reportTo='manager'");
                        while (ThirdQuery.next()) {
                            System.out.println(ThirdQuery.getInt(1) + " " +(ThirdQuery.getString(2) +ThirdQuery.getString(3))+  "   "  + ThirdQuery.getString(4) +"  " + ThirdQuery.getString(5) +"   " +ThirdQuery.getString(6)+"   " +ThirdQuery.getString(7)+"   " +ThirdQuery.getString(8));
                            System.out.println();
                        }
                        break;
                    case 4:
                        ResultSet FourthQuery = statement.executeQuery("select * from task3.employee where FirstName like 'A%'");
                        while (FourthQuery.next()) {
                            System.out.println(FourthQuery.getInt(1) + " " +(FourthQuery.getString(2) +FourthQuery.getString(3))+  "   "  + FourthQuery.getString(4) +"  " + FourthQuery.getString(5) +"   " +FourthQuery.getString(6)+"   " +FourthQuery.getString(7)+"   " +FourthQuery.getString(8));
                            System.out.println();
                        }
                        break;
                    case 5:
                        ResultSet FifthQuery = statement.executeQuery("select * from task3.employee group by salary order by salary desc  limit 2 ");
                        while (FifthQuery.next()) {
                            System.out.println(FifthQuery.getInt(1) + " " +(FifthQuery.getString(2) +FifthQuery.getString(3))+  "   "  + FifthQuery.getString(4) +"  " + FifthQuery.getString(5) +"   " +FifthQuery.getString(6)+"   " +FifthQuery.getString(7)+"   " +FifthQuery.getString(8));
                            System.out.println();
                        }
                        break;
                    case 6:
                        ResultSet SixthQuery = statement.executeQuery("select * from task3.employee group by salary order by salary desc  limit 1,1 ");
                        while (SixthQuery.next()) {
                          System.out.println(SixthQuery.getInt(1) + " " +(SixthQuery.getString(2) +SixthQuery.getString(3))+  "   "  + SixthQuery.getString(4) +"  " + SixthQuery.getString(5) +"   " +SixthQuery.getString(6)+"   " +SixthQuery.getString(7)+"   " +SixthQuery.getString(8));
                          System.out.println();
                          }
                        break;
                    case 7:
                        ResultSet seventhQuery = statement.executeQuery("select * from task3.employee group by salary order by salary desc limit 2,5 ");
                        while (seventhQuery.next()) {
                          System.out.println(seventhQuery.getInt(1) + " " +(seventhQuery.getString(2) +seventhQuery.getString(3))+  "   "  + seventhQuery.getString(4) +"  " + seventhQuery.getString(5) +"   " +seventhQuery.getString(6)+"   " +seventhQuery.getString(7)+"   " +seventhQuery.getString(8));
                          System.out.println();
                        }
                        break;
                    case 8:
                        ResultSet EigthQuery=statement.executeQuery("select FirstName,name from task3.employee join task3.department where employee.id=department.id;");
                        while (EigthQuery.next()) {
                            System.out.println(EigthQuery.getInt(1) + " " +(EigthQuery.getString(2) +EigthQuery.getString(3))+  "   "  + EigthQuery.getString(4) +"  " + EigthQuery.getString(5) +"   " +EigthQuery.getString(6)+"   " +EigthQuery.getString(7)+"   " +EigthQuery.getString(8));
                            System.out.println();
                        }
                        break;
                    case 9:
                        ResultSet ninethQuery=statement.executeQuery("select distinct FirstName,city from task3.employee join task3.department on employee.id=department.id and city ='noida'");
                        while (ninethQuery.next()) {
                            System.out.println(ninethQuery.getString(1) + " " + ninethQuery.getString(2));
                            System.out.println();
                        }
                        break;
                    case 10:
                        ResultSet TenthQuery=statement.executeQuery("select sum(salary)  from task3.employee;");
                        while (TenthQuery.next()) {
                            System.out.println(TenthQuery.getInt(1));
                            System.out.println();
                        }
                        break;
                    case 11:
                        ResultSet ELeventhQuery=statement.executeQuery("select avg(salary)as avg_salary from task3.employee join task3.department on employee.id=department.id and city ='noida';");
                        while (ELeventhQuery.next()) {
                            System.out.println(ELeventhQuery.getInt(1));
                            System.out.println();
                        }
                        break;
                    case 12:
                        ResultSet twelveQuery=statement.executeQuery("select FirstName , name,salary from task3.employee join task3.department where employee.id=department.id;");
                        while(twelveQuery.next()){
                            System.out.println(twelveQuery.getString("FirstName") + " " +twelveQuery.getString("name") + " " +twelveQuery.getInt(3));
                            System.out.println();
                        }
                        break;
                        case 13:
                        statement.close();
                        break;

                }

            }while(choicequery !=13);
            statement.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
