package javaDay5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



class Person{
	String FirstName;
	String LastName;
	Person(String FirstName,String LastName){
		this.FirstName=FirstName;
		this.LastName=LastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String toString() {
		return this.FirstName+" "+this.LastName;
	}
}
 class LastName implements Comparator{
	public int compare(Object p1,Object p2) {
		Person per1 = (Person)p1;
		Person per2 = (Person)p2;
		
		return per1.getLastName().compareTo(per2.getLastName());
	}
 }

public class lamdaDemo {
	public static void startsWithC(List<Person> person) {
		for(Person p:person){
			if(p.getLastName().startsWith("c")) {
				System.out.println(p.getFirstName()+" "+p.getLastName());
		}		
    }
}
	public static void main(String[] args) {
		Person p1 = new Person("mohan","kumar");
		Person p2 = new Person("akash","singh");
		Person p3 = new Person("akshay","patel");
		Person p4 = new Person("ravi","chandra");
		Person p5 = new Person("shashi","chand");

		List<Person> person = new ArrayList<>();
		person.add(p4);
		person.add(p3);
		person.add(p2);
		person.add(p1);
		person.add(p5);
		
		
		Collections.sort(person,new LastName());
		System.out.println(person);
		
		
		person.stream().filter(p->p.getLastName().startsWith("c")).forEach(System.out::println);
		
		
		
	}

}
