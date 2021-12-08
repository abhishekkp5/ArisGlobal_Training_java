

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MyMain {

	 private static SessionFactory factory;
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 try {
	         factory = new Configuration().configure().buildSessionFactory();
	         
	         Session session=factory.openSession();
	         
	         Employee employee=new  Employee();
	         employee.setId(2);
	         employee.setName("kavi");
	         employee.setSalary(100);
	         
	         
	         org.hibernate.Transaction t= session.beginTransaction();
	         
	         
	         session.save(employee);
	         
	         t.commit();
	         
	      } catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
	}

}
