package project1;

class Student1{
	private int id;
	private String name;
	private int age;
	void setId(int id) {
		this.id =id;
	}
	int getId() {
		return this.id;
	}
	void setName(String name) {
		this.name=name;
	}
	String getName() {
		return this.name;
	}
    void setAge(int age) {
    	this.age= age;
    }
    int getAge() {
    	return this.age;
    }
	
}
class college extends Student1 implements Runnable{
	
	public void run() {
		System.out.println("My Thread....");
		Student1 s = new Student1();
		s.setName("abc");
		for(int i=0;i<5;i++) {
		System.out.println(s.getName()+Thread.currentThread().getName());
		
		}
	}
}
public class ArrayPra {
	public static void main(String[] args) {
		Student1 s1[] = new Student1[3];
		for(int i=0;i<s1.length;i++){
			s1[i]=new Student1();
		}
		college c1= new college();
		college c2 = new college();
		Thread t1 = new Thread(c1);
		t1.setName("t1");
		t1.start();
		Thread t2 = new Thread(c2);
		t2.setName("t2");
		t2.start();
	}
}
