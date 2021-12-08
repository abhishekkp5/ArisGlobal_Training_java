package JavaDay4;


import java.io.File;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class Mymain {
	private static SessionFactory factory;
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure(new File("hibernate.cfg.xml")).build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

	 try {
         factory = meta.getSessionFactoryBuilder().build();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
}

}
