package javaDay5;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitsDemo {

	public static void main(String[] args) {
		
		Random random = new Random();
		random.ints().limit(4).sorted().forEach(System.out::println);
		//Stream s = new Stream();
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7);
		ls.stream().limit(2).collect(Collectors.toList()).forEach(System.out::println);;
		
		
		IntSummaryStatistics it = ls.stream().mapToInt(x->x).summaryStatistics();
		System.out.println(it.getAverage());
	}

}
