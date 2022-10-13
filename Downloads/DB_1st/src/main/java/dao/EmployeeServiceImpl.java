package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Employee;
import service.EmployeeService;
import utility.JdbcUtility;

public class EmployeeServiceImpl implements EmployeeService {
//store data to DB server
	public int addEmp(Employee employee)  {

		int status=0;
		try
		{
   //to connect with DB
	Connection connection=	JdbcUtility.connect();
		//Creating statement object
	//Statement s=	connection.createStatement(); 
	// PreparedStatement ps=prepareStatement(String sqlQuery)throws SQL exception
	//Create table Employee(emp_id int primary key, emp_name varchar(40), emp_phone bigint, emp_salary real, emp_address varchar(40));
	  PreparedStatement ps= connection.prepareStatement("insert into Employee values(?,?,?,?,?)");
	ps.setInt(1, employee.getEmpId());
	ps.setString(2, employee.getEmpName());
	ps.setLong(3,employee.getEmpPhone());
	ps.setDouble(4, employee.getEmpSalary());
	ps.setString(5, employee.getEmpAddress());
	
		status=ps.executeUpdate();
		
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		return status;
	}

	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		try
		{
		
		Connection connection = JdbcUtility.connect();
		
		PreparedStatement ps = connection.prepareStatement("select * from Employee");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			Employee employee = new Employee();
			//rs.getInt(1);   can also fetch via Index 
			int id = rs.getInt("emp_id");   // can also fetch by coloumn name
			String name = rs.getString("emp_name");
			long ph = rs.getLong(3);
			double salary = rs.getDouble(4);
			String address = rs.getString(5);
			employee.setEmpId(id);
			employee.setEmpName(name);
			employee.setEmpPhone(ph);
			employee.setEmpSalary(salary);
			employee.setEmpAddress(address);
			list.add(employee);
			
		}
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return list;
	}

	public Employee getEmpById(int employeeId) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		try
		{
		
		Connection connection = JdbcUtility.connect();
		
		PreparedStatement ps = connection.prepareStatement("select * from Employee where emp_id = "+employeeId);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			
			int id = rs.getInt("emp_id");
			if(employeeId == id)
			{
				String name = rs.getString("emp_name");
				long ph = rs.getLong(3);
				double salary = rs.getDouble(4);
				String address = rs.getString(5);
				employee.setEmpName(name);
				employee.setEmpPhone(ph);
				employee.setEmpSalary(salary);
				employee.setEmpAddress(address);
				
			}
		}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return employee;
	}

	public Employee updateById(int employeeId) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		try
		{
		
		Connection connection = JdbcUtility.connect();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee name");
		String name=scanner.nextLine();
		System.out.println("Enter employee phone");
		long ph=Long.parseLong(scanner.nextLine());
		System.out.println("Enter employee salary");
		double salary=Double.parseDouble(scanner.nextLine());
		System.out.println("Enter employee address");
		String addr=scanner.nextLine();
		scanner.close();
		employee.setEmpName(name);
		employee.setEmpPhone(ph);
		employee.setEmpSalary(salary);
		employee.setEmpAddress(addr);
		
		
		PreparedStatement ps = connection.prepareStatement("update Employee set emp_name = '"+name+"', emp_phone = '"+ph+"', emp_salary = '"+salary+"', emp_address = '"+addr+"' where emp_id = "+employeeId);
		
		ps.executeUpdate();
		
		
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return employee;
	}

	public int deleteEmpById(int empId) {
		// TODO Auto-generated method stub
		int status = 0;
		try {
		Connection connection = JdbcUtility.connect();
		
		
			PreparedStatement ps = connection.prepareStatement("delete from Employee where emp_id = "+empId);
			
			status = ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		return status;
	}

	public boolean getLogin(int id, long phone) {
		// TODO Auto-generated method stub
		
		
		try {
			Connection connection = JdbcUtility.connect();
			
			PreparedStatement ps = connection.prepareStatement("select * from Employee where emp_id = '"+id+"' or emp_phone = '"+phone+"';");
			
			
			int status = 0;
			status = ps.executeUpdate();
			if(status > 0)
			{
				return true;
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return false;
		
	}

}

