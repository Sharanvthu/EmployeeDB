package employee_database;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;



public class EmployeedbmsImpl implements Employeedbms {

	Scanner scn1=new Scanner(System.in);
	LinkedHashMap<Integer,Employee>db=
			new LinkedHashMap<Integer,Employee>();
	@Override
	public void addEmployee() {
		System.out.println("Enter EId:");
		int id=scn1.nextInt();

		System.out.println("Enter EName:");
		String name=scn1.next();

		System.out.println("Enter Eage:");
		int age=scn1.nextInt();

		System.out.println("Enter Eranking:");
		int rank=scn1.nextInt();

		Employee emp=new Employee(id, name, age, rank);
		db.put(id, emp);
		System.out.println("Employee INSERTED SUCCESSFULLY");

	}

	@Override
	public void removeEmployee() {
		System.out.println("Enter Employee Id ");

		int id =scn1.nextInt();
		if(db.containsKey(id))
		{
			System.out.println("Employee record found");
			db.remove(id);
			System.out.println("Employee removed successfully");
		}
		else
		{
			System.out.println(" Employee ID not found");
		}
	}

	@Override
	public void removeAllEmployee() {
		db.clear();
		System.out.println("Employee records deleted successfully");

	}

	@Override
	public void displayEmployee() {
		System.out.println("Enter Employee Id to display");
		int id =scn1.nextInt();
		if(db.containsKey(id))
		{
			Employee e=db.get(id);
			System.out.println("Id :"+e.getEid());
			System.out.println("Name :"+e.getEname());
			System.out.println("Age :"+e.getEage());
			System.out.println("Ranking :"+e.getEranking());
		}

	}

	@Override
	public void displayAllEmployee() {
		Set<Integer> setOffKeys=db.keySet();
		for(int i:setOffKeys)
		{
			Employee obj=db.get(i);
			System.out.println("Id :"+obj.getEid());
			System.out.println("Name :"+obj.getEname());
			System.out.println("Age :"+obj.getEage());
			System.out.println("Ranking :"+obj.getEranking());
			System.out.println("=============================");

		}

	}

	@Override
	public void countEmployees() {
		System.out.println("Total Employee Records :"+db.size());
	}

	@Override
	public void updateEmployee() {
		System.out.println("Enter Employee Id to Update");
		int id=scn1.nextInt();

		if(db.containsKey(id))
		{
			Employee e=db.get(id);
			System.out.println("What do you want to Update"+"\n"+"1.ID"
					+"2.NAME"+"3.AGE"+"4.RANK"+"5.Exit");
			int choice=scn1.nextInt();
			switch (choice) 
			{
			case 1:System.out.println("Enter id");
			id=scn1.nextInt();
			e.setEid(id);
			System.out.println("Id updated successfully");
			break;
			case 2:System.out.println("Enter Name");
			String name=scn1.next();
			e.setEname(name);
			System.out.println("Name updated successfully");
			break;
			case 3:System.out.println("Enter Age");
			int age=scn1.nextInt();
			e.setEage(age);
			System.out.println("Age updated successfully");
			break;
			case 4:System.out.println("Enter rank");
			int rank=scn1.nextInt();
			e.setEid(rank);
			System.out.println("rank updated successfully");
			break;
			default:System.out.println("Invalid choice");
			}
		}
		else{
			System.out.println("Emlpoyee Id not Found ");
		}



	}

	@Override
	public void sortEmployees() {
		Comparator<Employee> Byid=

			
			(Employee e1, Employee e2)-> {
				if(e1.getEid()>e2.getEid())
					return 1;
				return -1;
			
		};

		Comparator<Employee> Byname=new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.getEname().charAt(0)>e2.getEname().charAt(0))
					return 1;
				return -1;
			}
		};


		Comparator<Employee> Byage=new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.getEage()>e2.getEage())
					return 1;
				return -1;
			}
		};


		Comparator<Employee> Byrank=new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.getEranking()>e2.getEranking())
					return 1;
				return -1;
			}
		};
		ArrayList<Employee>l=new ArrayList<>();
		Set<Integer> setofkeys=db.keySet();
		for (int id : setofkeys) {
			l.add(db.get(id));
		}
		System.out.println("1:By ID\n2:By Name");
		System.out.println("3:By Age\n2:By Rank");
		System.out.println("Enter your Choice");


		int choice=scn1.nextInt();
		switch (choice) {
		case 1:System.out.println("Sorted based on ID");
		Collections.sort(l,Byid);
		for(Employee e:l)
		{
			System.out.println(e);
		}

		break;
		case 2:System.out.println("Sorted based on Name");
		Collections.sort(l,Byname);
		for(Employee e:l)
		{
			System.out.println(e);
		}

		break;
		case 3:System.out.println("Sorted based on Age");
		Collections.sort(l,Byage);
		for(Employee e:l)
		{
			System.out.println(e);
		}

		break;
		case 4:System.out.println("Sorted based on Rank");
		Collections.sort(l,Byrank);
		for(Employee e:l)
		{
			System.out.println(e);
		}

		break;

		default:System.out.println("Invali choice");
			break;
		}












	}

}
