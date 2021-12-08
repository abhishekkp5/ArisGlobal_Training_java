package java;

 interface A
{
 void display();	
	
}
abstract class B
{
	abstract void display();

void hello()
{
	System.out.println("hello Abstract in java ");
}

}
class C extends B implements A
{

	@Override
	public void display() {
		System.out.println("abstract class in child");
		
	}

	
	
}

public class MultipleInheritance {

	public static void main(String arg[])
	{
		C c=new C();
		c.display();
		
		//A a=new A();
		//B b=new B();
		
	}
	
}
