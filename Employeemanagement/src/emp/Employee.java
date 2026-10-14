package emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {

	String tablecreation="create table emptable("+
			"empid int primary key,"+
			"empname varchar(50),"+
			"empsalary double,"+
			"empshifttime varchar(50),"+
			"emppassword varchar(10)"+");";
	
	Connection conn=Dbconnection.dbconnection();
	Scanner sc= new Scanner(System.in);
	public void emptablecreation() {
		try {
		Statement st= conn.createStatement();
		st.executeUpdate(tablecreation);
		System.out.println("table is created");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	String insert="insert into emptable(empid,empname,empsalary,empshifttime,emppassword) value(?,?,?,?,?)";
	public void empinsert() {
		try {
			System.out.println("Enter your empid");
			int empid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your empname");
			String empname=sc.nextLine();
			System.out.println("Enter your empsalary");
			double empsalary=sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter your empshifttime");
			String empshifttime=sc.nextLine();
			System.out.println("Enter your password");
			String emppassword=sc.nextLine();
			PreparedStatement ps=conn.prepareStatement(insert);
			ps.setInt(1, empid);
			ps.setString(2, empname);
			ps.setDouble(3, empsalary);
			ps.setString(4, empshifttime);
			ps.setString(5, emppassword);
			int row=ps.executeUpdate();
			if(row==1) {
				System.out.println("data stored successfully");
			}
			else {
				System.out.println("data not stored");
			}
			
		}catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
}
