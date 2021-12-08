package javaDay2;

import java.util.HashMap;
import java.util.HashSet;
//import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//import java.util.Set;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer,String> h = new HashMap<>();
		 h.put(1,"Blue");
		 h.put(2,"white");
		 h.put(3,"black");
		 h.put(3, "green");
		// h.put(null,"Green");
         
		 System.out.println(h);
		 
		HashSet<Integer> s = new HashSet<>();
		s.add(1);
	}

}
