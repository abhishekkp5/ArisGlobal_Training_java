package javaDay3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC {
	static Statement statement;	
	public static Connection connections() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String connectionString="jdbc:mysql://localhost:3306/employee";
			String userName="root";
			String password="password";
			//System.out.println(password);
			con=DriverManager.getConnection(connectionString,userName,password);
		if(con!=null) {
			System.out.println("connected");
		}
		else {
			System.out.println("connection Failed.....");
		}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return con;
}	
public static void insertion(Connection con) throws SQLException {		
		System.out.println("Enter your name:");
	       Scanner scan1 = new Scanner(System.in);
		   String name = scan1.next();		   
		   System.out.println("Enter the salary amount:");
		  // Scanner scan = new Scanner(System.in);
		   int salary = scan1.nextInt();
		   String q1 = "insert into emp1(name,age) values('"+name+"',"+salary+");";
		   statement = con.createStatement();
		   int m = statement.executeUpdate(q1);
		   if(m==1) {
			   System.out.println("Inserted a record to DB..");
		   }
		   else {
			   System.out.println("Insertion Failed");
		   }		   
}


public static void updation(Connection con) throws SQLException {
	System.out.println("Enter Id of the employee to be updated:");	
	Scanner scan = new Scanner(System.in);
    int Id = scan.nextInt();
    System.out.println("Enter the name to be updated:");
    //Scanner scan2 = new Scanner(System.in);
    String cname = scan.next();
    String UpdateQuery ="update emp1 set name='"+cname+"'where id = "+Id+"";
    statement = createstatement(con);
     int test = statement.executeUpdate(UpdateQuery); 
     if(test==1) {
    	 System.out.println("Updated..");
     }else {
    	 System.out.println("Update failed....");
     }
}

public static void Display(Connection con) throws SQLException {
	
	System.out.println("Displaying...");
	String displayQuery = "select * from emp1";
	
	statement = createstatement(con);
		
	ResultSet rs=statement.executeQuery(displayQuery);
	while(rs.next())
	{
	System.out.println("id " +rs.getInt(1));
	System.out.println("name "+rs.getString(2));
	System.out.println("salary "+rs.getInt(3));
	}
}

public static void deletion(Connection con) throws SQLException {
	System.out.println("Enter the employee id to delete...");
	Scanner scan = new Scanner(System.in);
	int DId = scan.nextInt();
	String DeleteQuery = "delete from emp1 where id ="+DId;
	statement = createstatement(con);
	int n =statement.executeUpdate(DeleteQuery);
	if(n==1) {
		System.out.println("deleted...");
	}
	else {
		System.out.println("deletion failed...");
	}
}

public static Statement createstatement(Connection con) {
	Statement st = null;
	try {
		 st = con.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return st;
}

public static void main(String[] args) throws SQLException {
		Connection con = connections();
		while(true) {			
			Scanner scan = new Scanner(System.in);
			System.out.println("Press 1 For create new record..");
			System.out.println("Press 2  for Update the record..");
			System.out.println("Press 3 for Delete...");
			System.out.println("Press 4 for display...");
			System.out.println("Press 5 to exit");
			int choice = scan.nextInt();
			switch(choice) {
			case 1: insertion(con);
				    break;
			case 2: updation(con);			       
			       break;
			case 3: deletion(con);
					break;
			case 4: Display(con);
					break;
			case 5:System.out.println("Exiting.....");
					con.close();
				   System.exit(0);
			default:System.out.println("Please enter the correct value mentioned..");
				
			}
		}
	}
}


