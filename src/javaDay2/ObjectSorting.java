package javaDay2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;


class Student implements Comparable<Student>{
	private int roll;
	private String name;
	private int age;
	public Student (int roll, String name, int age) {
		super();
		this.roll=roll;
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "\n roll:"+this.roll+" name:"+this.name+" age:"+this.age;
	}
	int display() {
		return this.age;
	}
	public int compareTo(Student o) {
		if(this.age==o.age) {
			return 0;
		}
		else if(this.age<o.age) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
}

public class ObjectSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(5,"ravi",35);
		Student s2 = new Student(6,"sar",21);
		Student s3 = new Student(7,"ravesh",37);
		Student s4 = new Student(8,"siri",22);
		
		List<Student> StudentList = new ArrayList<Student>();
		StudentList.add(s4);
		StudentList.add(s3);
		StudentList.add(s1);
		StudentList.add(s2);
		
	//	LinkedHashSet<Integer> it = new LinkedHashSet<Integer>();
		//it.add(1);
		
		Collections.sort(StudentList);
		System.out.println(StudentList);
	}

}
