package javaDay5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filters {

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8);
	    List<Integer> even = ls.stream().filter(l->l%2==0).collect(Collectors.toList());
	    List<Integer> odd = ls.stream().filter(l->l%2!=0).collect(Collectors.toList());
		
	    System.out.println(even);
	    System.out.println(odd);
		
		
		List<String> lt = Arrays.asList("eds","tree","exide","maxout","nest");
		long count = lt.stream().filter(s->s.isEmpty()).count();
		System.out.println(count);
	}

}
