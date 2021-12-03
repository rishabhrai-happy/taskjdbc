
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeController {
    public static void main(String[] args)  {
        try {
            Scanner sc = new Scanner(System.in);
            int choicequery;

            Connection connection = JDBCConeection.createConnection();

            Statement statement = connection.createStatement();
            EmployeeUttils ObjectForQuery=new EmployeeUttils();
            InsertDataEmployeeUtility employeedata=new InsertDataEmployeeUtility();
            DepartmentUtility departmentdata=new DepartmentUtility();
            CreateTable table=new CreateTable();

            do {

                System.out.println("UsreChoiceQuery");

                choicequery = sc.nextInt();
                switch (choicequery) {
                    case 1:
                        System.out.println("1.All the Employee with following details - id,name(firstName+lastName),email,designation");
                        ObjectForQuery.EmployeeWithNameDegignation();
                        break;
                    case 2:
                        System.out.println("2.All the Employee with designation as Software engineer and QA engineer");
                        ObjectForQuery.EmployeeWithSeAndQe();
                        break;
                    case 3:
                        System.out.println("5.Top 5 Employee with highest Salary");
                        ObjectForQuery.EmployeeWithReportingManager();
                        break;
                    case 4:
                        System.out.println("4.All the Employee whose name start with Alphabet 'A'");
                        ObjectForQuery.EmployeeStartWithA();
                        break;
                    case 5:
                        System.out.println("5.Top 5 Employee with highest Salary");
                        ObjectForQuery.EmployeeWithTop5Salary();
                        break;
                    case 6:
                        System.out.println("6. employee with 2nd highest salary in the company");
                        ObjectForQuery.Employeey2ndHighestSalary();
                        break;
                    case 7:
                        System.out.println("7.All the employee whose salary is less than employee with 2nd highest salary");
                        ObjectForQuery.EmployeeyLessSalaryThan2ndHighst();
                        break;
                    case 8:
                        System.out.println("8.All the Employee with their department name");
                        ObjectForQuery.EmployeeyWithDepartmentName();
                        break;
                    case 9:
                        System.out.println("9.List of the employee who were working on Y city");
                        ObjectForQuery.EmployeeyWithCity();
                        break;
                    case 10:
                        System.out.println("10.Total Salary given to Employee in the company");
                        ObjectForQuery.TotalSalary();
                        break;
                    case 11:
                        System.out.println("11.Average Salary given to Employee in city Y");
                        ObjectForQuery.AvreageSalary();
                        break;
                    case 12:
                        System.out.println("12. Total Salary given to the Employee department wise");
                        ObjectForQuery.TotalSalaryWithDepartment();
                        break;

                        case 13:
                            System.out.println("13.finish");
                            statement.close();
                        break;
                    case 14:
                        System.out.println("user insert the data here");
                        employeedata.InsertData();
                        System.out.println("table inserted");
                        break;
                    case 15:
                        System.out.println("insert the data in department table");
                        departmentdata.InsertDataInDepartment();
                        System.out.println("table inserted in department");
                        break;
                    case 16:
                        table.createTable();
                        System.out.println("create table");
                        break;

                }

                }while (choicequery != 13) ;

            }catch(Exception e){
                e.printStackTrace();
            }

    }
}
