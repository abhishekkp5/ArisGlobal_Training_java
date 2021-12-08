package javaDay5;

@FunctionalInterface
interface Hello{
	abstract void Square(int n);
}
@FunctionalInterface
interface Length{
	abstract void StringLength(String s);
}

interface evenOdd{
	abstract void EvenOdd(int n);
}

public class Main {
	public static void main(String[] args) {
		
		Hello h = (n)->System.out.println(n*n);
		Length l = (s)->System.out.println("length of the String is "+s.length());
		evenOdd e = (a)->System.out.println(a%2==0?"Even":"Odd");
		
		h.Square(12);
		l.StringLength("abcdefghijA");
		e.EvenOdd(5);
		
	}

}
