package javaDay2;

import java.util.ArrayList;
import java.util.List;

class Employee<T>{
	T Id;
	String name;
	List<T> l = new ArrayList<T>();
	Employee(T id) {
	//List<T> l = new ArrayList<T>();
	l.add(Id);
	
	}
	
}

public class GenericDemo {
public static void main(String[] args) {
	Employee<Float> e = new Employee(0.5);
}
}
