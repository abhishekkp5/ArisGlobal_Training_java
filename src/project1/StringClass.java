package project1;

public class StringClass {
	public static void main(String args[]) {
		String name="abc";
		String name1 = new String("abc");
		if(name==name1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		if(name.equalsIgnoreCase(name1)) {
			System.out.println("true");
			}
	}
	private String name;
	StringBuffer strbuf = new StringBuffer(name);
	
	
}
