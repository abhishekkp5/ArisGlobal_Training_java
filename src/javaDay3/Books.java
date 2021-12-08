package javaDay3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Books {
	static Statement statement;
	static Scanner sc = new Scanner(System.in);
	public static Connection connections() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String connectionString="jdbc:mysql://localhost:3306/books";
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
			e.printStackTrace();
		}
	return con;
}	
public static Statement createstatement(Connection con) {
		Statement st = null;
		try {
			 st = con.createStatement();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return st;
	}
	@SuppressWarnings("resource")
	public static int insertion(Connection con) throws SQLException {
		int author_id=0;
		System.out.println("Enter First name of the author:");
	       Scanner scan1 = new Scanner(System.in);
		   String FName = scan1.next();		   
		   System.out.println("Enter Middle Name of the author:");
		   //Scanner scan = new Scanner(System.in);
		   String MName = scan1.next();
		   System.out.println("Enter the Last Name of the author:");
		   String LName = scan1.next();
		   System.out.println("Enter the phone Number of the author:");
		   Scanner sc1 = new Scanner(System.in);
		   int phone = sc1.nextInt();
		   statement = con.createStatement();   
		  
		   String q1 = "insert into author(firstName,middleName,lastName,phoneNo) values('"+FName+"','"+MName+"','"+LName+"',"+phone+");";		   
		   int m = statement.executeUpdate(q1);
		   ResultSet rs = statement.executeQuery("select last_insert_id();");
		   while(rs.next()) {
		   author_id = rs.getInt(1);
		   }
		   verifyMsg(m,"Insert into author table");
		   return author_id;
}
	@SuppressWarnings("resource")
	public static void updation(Connection con) throws SQLException {
		System.out.println("Enter id of author that needs to be updated");
		Scanner sc = new Scanner(System.in);
		int author_id=sc.nextInt();
		System.out.println("Enter the firstname");
		Scanner sc1=new Scanner(System.in);
		String fname=sc1.nextLine();
		System.out.println("Enter the secondname");
		String sname=sc1.nextLine();
		System.out.println("Enter the lastname");
		String lname=sc1.nextLine();
		String UpdateQuery="update author SET firstname='"+fname+"',middlename='"+sname+"',lastname='"+lname+"'where authorId="+author_id;
	    statement = createstatement(con);
	     int test = statement.executeUpdate(UpdateQuery); 
	     verifyMsg(test,"Updated author table");
	     if(test==1) {
	    	 System.out.println("Updated..");
	     }else {
	    	 System.out.println("Update failed....");
	     }
	}
public static void deletion(Connection con) throws SQLException {
		System.out.println("Enter the ID of author to delete the record");		
		int aid=sc.nextInt();
		String DeleteQuery="delete from author where authorId="+aid;
		statement = createstatement(con);
		int n =statement.executeUpdate(DeleteQuery);
		if(n==1) {
			System.out.println("deleted...");
		}
		else {
			System.out.println("deletion failed...");
		}
}
	public static void Display(Connection con) throws SQLException {
		
		System.out.println("Displaying...");
		String displayQuery = "select * from author";
		
		statement = createstatement(con);			
		ResultSet rs=statement.executeQuery(displayQuery);
		System.out.print("Id |");
		System.out.print("First Name |");
		System.out.print("Middle Name |");
		System.out.print("Last Name |");
		System.out.println("Phone NUmber |");		
		while(rs.next())
		{
		System.out.print(rs.getInt(1)+" 8"
				+ "|");
		System.out.print(rs.getString(2)+" |");
		System.out.print(rs.getString(3)+" |");
		System.out.print(rs.getString(4)+" |");
		System.out.println(rs.getInt(5)+" |");
		}
	}
public static void DisplayOnID(Connection con) throws SQLException {
		System.out.println("Enter the author id:");
		int id = sc.nextInt();
		String query = "select * from author where authorId ="+id;
		statement = createstatement(con);
		ResultSet rs = statement.executeQuery(query);
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" |");
			System.out.print(rs.getString(2)+" |");
			System.out.print(rs.getString(3)+" |");
			System.out.print(rs.getString(4)+" |");
			System.out.println(rs.getInt(5)+" |");
		}
	}
public static void Query1(Connection con) throws SQLException {	
	Display(con);
	System.out.println("Enter the FirstName of the Author:");
	String FName = sc.next();
	String query = "select title from book b,bookauthor ba,author a where b.ISBN = ba.bookId and ba.authorId = a.authorId and a.firstName ='"+FName+"'";
	statement = createstatement(con);
	ResultSet rs = statement.executeQuery(query);
	System.out.println("Books titles");
	while(rs.next()) {
		System.out.println(rs.getString(1));
	}
}
public static void Query2(Connection con) throws SQLException {
	int a_id,book_id=0;
	System.out.println("Enter the book title:");
	String bookTitle = sc.next();
	System.out.println("Enter the price of the book:");
	int price = sc.nextInt();
	statement = createstatement(con);	
	String query = "insert into book(title,price) values('"+bookTitle+"',"+price+");";
	int result = statement.executeUpdate(query);
	ResultSet rs = statement.executeQuery("select last_insert_id();");
	while(rs.next()) {
	book_id = rs.getInt(1);
	System.out.println(book_id);
	}
	verifyMsg(result,"Insert a record into book table");
	a_id=insertion(con);
	String query2 = "insert into bookauthor values ("+book_id+","+a_id+");";
	int result2 = statement.executeUpdate(query2);
	verifyMsg(result2,"inserted a record into bookauthor");
}
public static void Query3(Connection con) throws SQLException {
	Display(con);
	System.out.println("Enter the Author Name to update the price:");
	String authorName = sc.next();
	System.out.println("Enter the price of the book to be Updated:");
	int price = sc.nextInt();
	String Query =  "update book set price = "+price+" where book.ISBN in (select bookId from bookauthor ba where ba.authorId in (select authorId from author where firstName = '"+authorName+"'));";
	statement = createstatement(con);
	int result = statement.executeUpdate(Query);
	verifyMsg(result,"Update of price");	
}
public static void verifyMsg(int result,String msg) {
	if(result==1) {
		System.out.println(msg+" Sucessfull...");
	}
	else{
		System.out.println(msg+" Failed.....");
	}
}
public static void main(String[] args) throws SQLException {
		Connection con = connections();
		while(true) {			
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Press 1 to Create A Record on author table..");
			System.out.println("Press 2 to Update the record..");
			System.out.println("Press 3 to Delete...");
			System.out.println("Press 4 to Display...");
			System.out.println("Press 5 to The list of all book titles which are written by specific Author..");
			System.out.println("Press 6 to Enter book and author details to insert into database..");
			System.out.println("Press 7 to Update the price of the book...");
			System.out.println("Press 8 to Exit");
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
			case 5:Query1(con);
					break;
			case 6:Query2(con);
					break;
			case 7:Query3(con);
					break;
			case 8:System.out.println("Exiting.....");
					con.close();
				   System.exit(0);
			default:System.out.println("Please enter the correct value mentioned..");
				
			}
		}
	
	}
}