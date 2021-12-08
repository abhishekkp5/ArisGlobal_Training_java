package javaDay3;

import java.sql.*;
import java.util.Scanner;

public class MyJDBC {
	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String connectionString="jdbc:mysql://localhost:3306/employee";
		String userName="root";
		String password="password";
		//System.out.println(password);
		Connection con=DriverManager.getConnection(connectionString,userName,password);
		if(con!=null)
		{
		System.out.println("connected");
		while(true) {
			Statement st1 = con.createStatement();
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Press 1 For create new record..");
			System.out.println("Press 2  for Update the record..");
			System.out.println("Press 3 for Delete...");
			System.out.println("Press 4 for display...");
			System.out.println("Press 5 to exit");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter your name:");
			       Scanner scan1 = new Scanner(System.in);
				   String name = scan1.nextLine();
				   System.out.println("Enter the salary amount:");
				   int salary = scan.nextInt();
				   String q1 = "insert into emp1(name,age) values('"+name+"',"+salary+");";
				   int m = st1.executeUpdate(q1);
				   if(m==1) {
					   System.out.println("Inserted a record to DB..");
				   }
				   else {
					   System.out.println("Insertion Failed");
				   }
				   break;
			case 2:System.out.println("Enter Id of the employee to be updated:");
			       int Id = scan.nextInt();
			       System.out.println("Enter the name to be updated:");
			       Scanner scan2 = new Scanner(System.in);
			       String cname = scan2.nextLine();
			       String UpdateQuery ="update emp1 set name='"+cname+"'where id = "+Id+"";
			       st1.executeUpdate(UpdateQuery);			       
			       break;
			case 3:System.out.println("Enter the employee id to delete...");
					int DId = scan.nextInt();
					String DeleteQuery = "delete from emp1 where id ="+DId;
					st1.executeUpdate(DeleteQuery);
					break;
			case 4:System.out.println("Displaying...");
					String displayQuery = "select * from emp1";
					ResultSet rs=st1.executeQuery(displayQuery);
					while(rs.next())
					{
					System.out.println("id " +rs.getInt(1));
					System.out.println("name "+rs.getString(2));
					System.out.println("salary "+rs.getInt(3));
					}
					break;
			case 5:System.out.println("Exiting.....");
					con.close();
				   System.exit(0);
			default:System.out.println("Please enter the correct value mentioned..");
				
			}
}
}
//		String name1 ="abc";
//		Statement st1 = con.createStatement();
//		String q1 = "insert into emp1(name,age) values('"+name1+"',24);";
//		int m = st1.executeUpdate(q1);
//		Statement stmt =con.createStatement();
//		String query="select * from emp1";
//		ResultSet rs=stmt.executeQuery(query);
//		
//		while(rs.next())
//		{
//		System.out.println("id " +rs.getInt(1));
//		System.out.println("name "+rs.getString(2));
//		System.out.println("salary "+rs.getInt(3));
//		}
//
//
//		con.close();
//		}
		else
		{
		System.out.println("Not connected");
		}

		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	
}
