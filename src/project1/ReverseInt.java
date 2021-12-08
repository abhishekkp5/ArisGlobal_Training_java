package project1;

class rev {
	rev(String name){
		StringBuffer bf = new StringBuffer(name);
		bf.reverse();
		System.out.println(bf);
	}
	
}
public class ReverseInt {
	public static void main(String[] args) {
		rev obj =new rev("abc");
	}
}
