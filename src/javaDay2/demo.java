package javaDay2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

class Myobj implements Iterable{

	@Override
	public Iterator iterator() {
		
		return null;
	}
	
}

public class demo {
	public static void main(String[] args) {
		
		ArrayList<String> ls  = new ArrayList<String>();
		ls.add("Ravi");
		ls.add("Ajay");
		ls.add("abc");
		int len = ls.size();
		System.out.println(ls.get(2));
		Collections.sort(ls);
		System.out.println(len);
		ls.remove(1);
		ls.remove("abc");
		System.out.println(ls.get(0));
		System.out.print(ls.size());
		
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(10);
		v.add(20);
		v.remove(2);
		System.out.println(v);
		System.out.println(v.indexOf(10));
		
	}
}
