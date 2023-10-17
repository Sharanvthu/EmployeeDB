package employee_database;

import java.util.Scanner;



public class Employee_Registration {

	public static void main(String[] args) {
		Employeedbms sms=new EmployeedbmsImpl();
		System.out.println("WELCOME TO EmployeeDMS");
		System.out.println("------------");
		Scanner scn1=new Scanner(System.in);
		while(true)
		{
			System.out.println("1:Add Employee\n2:RemoveEmployee");
			System.out.println("3:RemoveAll Employees\n4:Display Employee");
			System.out.println("5:DisplayAll Employees \n6:Count Employees");
			System.out.println("7:Update Employee\n8:Sort Employees");
			System.out.println("9:EXIT");
			System.out.println("Enter Your Choice");
			int choice=scn1.nextInt();
			switch(choice)
			{
			case 1:sms.addEmployee();
			break;

			case 2:sms.removeEmployee();;
			break;

			case 3:sms.removeEmployee();;
			break;

			case 4:sms.displayEmployee();
			break;

			case 5:sms.displayAllEmployee();;
			break;

			case 6:sms.countEmployees();
			break;

			case 7:sms.updateEmployee();
			break;


			case 8:sms.sortEmployees();
			break;

			case 9:System.out.println("THANK TOU");
			System.exit(0);
			break;

			default:System.out.println("Invalid Choice");
			System.out.println("Enter a Valid Choice");
			}
			System.out.println("----------------------");	
		}

	}

}
