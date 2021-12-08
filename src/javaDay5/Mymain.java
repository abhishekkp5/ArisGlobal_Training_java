package javaDay5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Mymain {

	public static void main(String[] args) {

//		List<Integer> ls = new ArrayList<Integer>();
//		ls.add(1);
//		ls.add(2);
//		ls.add(3);
//		ls.add(4);
//		ls.add(5);
//		
//		ls.forEach(System.out::println);
//		//forEach--Stream provide a new method foreach
		
//		List<Integer> ls1 = ls //list
//				.stream()//converted to stream
//				.map(n->{
//		            int result = 1;
//		            for (int i = 1; i <= n; i++)
//		            result = i * result;
//		            return result;
//		        })
//				.collect(Collectors.toList());//convert to list again
//		System.out.println(ls1);
		
		
		
		List<String> st = new ArrayList<String>();
		st.add("umesh");
		st.add("ramesh");
		st.add("suresh");
		
		st.stream().map(s->s.concat("@gmial.com")).collect(Collectors.toList());
		System.out.println(st);
		
		
	}

}
