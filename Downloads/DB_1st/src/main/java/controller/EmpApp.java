package controller;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import dao.EmployeeServiceImpl;
import model.Employee;
import service.EmployeeService;
import utility.JdbcUtility;

public class EmpApp {

	public static void main(String[] args) {

EmployeeService service=new EmployeeServiceImpl();
Scanner scanner=new Scanner(System.in);

/*
System.out.println("Enter no. of employee");
int n = Integer.parseInt(scanner.nextLine());
int k = 0;
for(int i=0;i<n;i++)
{
		System.out.println("Enter employee id");
		int id=Integer.parseInt(scanner.nextLine());
		System.out.println("Enter employee name");
		String name=scanner.nextLine();
		System.out.println("Enter employee phone");
		long ph=Long.parseLong(scanner.nextLine());
		System.out.println("Enter employee salary");
		double salary=Double.parseDouble(scanner.nextLine());
		System.out.println("Enter employee address");
		String addr=scanner.nextLine();
		Employee empObj=new Employee();
		empObj.setEmpId(id);
		empObj.setEmpName(name);
		empObj.setEmpPhone(ph);
		empObj.setEmpSalary(salary);
		empObj.setEmpAddress(addr);
		k=service.addEmp(empObj);
}
	if(k>0)
	{
		System.out.println("New Employee registered");
	}
	else
	{
		System.out.println("No new Employee registered");
	}
	
	List<Employee> listOfEmp = service.getAllEmp();
	listOfEmp.forEach(emp->System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getEmpPhone()+" "+emp.getEmpSalary()+" "+emp.getEmpAddress()));
	
	
	System.out.println("Enter employee id for acquiring data");
	int employeeId =Integer.parseInt(scanner.nextLine());
	Employee emp = service.getEmpById(employeeId);
	System.out.println(emp.getEmpName()+" "+emp.getEmpPhone()+" "+emp.getEmpSalary()+" "+emp.getEmpAddress());

	
	System.out.println("Enter Emp id to update data");
	int id1 = Integer.parseInt(scanner.nextLine());
	service.updateById(id1);
	
	
	System.out.println("Enter Emp id to delete data");
	int id2 = Integer.parseInt(scanner.nextLine());
	int s = service.deleteEmpById(id2);
	
	if(s>0)
	{
		System.out.println("delete successfully");
	}
	else
	{
		System.out.println("not deleted");
	}
	*/
	
	System.out.println("Enter emp id and phone number for login");
	int id3 = Integer.parseInt(scanner.nextLine());
	long ph = Long.parseLong(scanner.nextLine());
	
	boolean b = service.getLogin(id3, ph);
	
	System.out.println("login condition: "+b);
	
	
	}

}
