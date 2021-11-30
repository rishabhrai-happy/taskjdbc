
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeController {
    public static void main(String[] args)  {
        try {
            Scanner sc = new Scanner(System.in);
            int choicequery;

            Connection connection = JDBCConeection.createConnection();

            Statement statement = connection.createStatement();

            do {

                System.out.println("UsreChoiceQuery");

                choicequery = sc.nextInt();
                switch (choicequery) {
                    case 1:
                        System.out.println("1.All the Employee with following details - id,name(firstName+lastName),email,designation");
                        EmployeeUttils.EmployeeWithNameDegignation();
                        break;
                    case 2:
                        System.out.println("2.All the Employee with designation as Software engineer and QA engineer");
                        EmployeeUttils.EmployeeWithSeAndQe();
                        break;
                    case 3:
                        System.out.println("5.Top 5 Employee with highest Salary");
                        EmployeeUttils.EmployeeWithReportingManager();
                        break;
                    case 4:
                        System.out.println("4.All the Employee whose name start with Alphabet 'A'");
                        EmployeeUttils.EmployeeStartWithA();
                        break;
                    case 5:
                        System.out.println("5.Top 5 Employee with highest Salary");
                        EmployeeUttils.EmployeeWithTop5Salary();
                        break;
                    case 6:
                        System.out.println("6. employee with 2nd highest salary in the company");
                        EmployeeUttils.Employeey2ndHighestSalary();
                        break;
                    case 7:
                        System.out.println("7.All the employee whose salary is less than employee with 2nd highest salary");
                        EmployeeUttils.EmployeeyLessSalaryThan2ndHighst();
                        break;
                    case 8:
                        System.out.println("8.All the Employee with their department name");
                        EmployeeUttils.EmployeeyWithDepartmentName();
                        break;
                    case 9:
                        System.out.println("9.List of the employee who were working on Y city");
                        EmployeeUttils.EmployeeyWithCity();
                        break;
                    case 10:
                        System.out.println("10.Total Salary given to Employee in the company");
                        EmployeeUttils.TotalSalary();
                        break;
                    case 11:
                        System.out.println("11.Average Salary given to Employee in city Y");
                        EmployeeUttils.AvreageSalary();
                        break;
                    case 12:
                        System.out.println("12. Total Salary given to the Employee department wise");
                        EmployeeUttils.TotalSalaryWithDepartment();
                        break;

                        case 13:
                            System.out.println("13.finish");
                            statement.close();
                        break;
                    case 14:
                        System.out.println("table inserted");
                        InsertDataInTable.InsertData();
//
                }
//
                }while (choicequery != 13) ;
//            statement.close();
//            connection.close();

            }catch(Exception e){
                e.printStackTrace();
            }

    }
}
