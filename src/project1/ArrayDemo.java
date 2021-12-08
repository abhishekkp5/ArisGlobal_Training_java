package project1;

class Student{
	private int id;
	private String name;
	private int age;
    void setId(int id) {
    	this.id=id;
    }
    int getId() {
    	return this.id;
    }
    void setName(String name) {
    	this.name = name;
    }
    String getName() {
    	return this.name;
    }
    void setAge(int age) {
    	this.age=age;
    }
    int getAge() {
    	return this.age;
    }
}
public class ArrayDemo {
public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
	
	int arrayInt[] = {1,2,3,4,5};
	int arrayInt1[] = new int[50];
	Integer[] arrayInteger = new Integer[10];
	
	
	float f[] = new float[10];
	String[] name = new String[10];
	
	for(int i:arrayInt) {
		System.out.println(i);
		
	}
	Student[] name1 = new Student[2];
	name1[0]= new Student();
	name1[1] = new Student();
	name1[0].setId(1);
	name1[1].setId(2);
	//int a1 = name1[0].getId();
	//System.out.println(a1);
	for(Student i:name1) {
		System.out.println(i.getId());
	}
	
}
}
