package com.day6;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Filter the data which are greater than 100
		
		List<Integer> list = List.of(122, 58, 283, 72, 834);
		
		// maximum value
		int max = list.stream().sorted(Comparator.reverseOrder()).findFirst().get(); 
		System.out.println(max); // maximum value
		
		// second maximum
		int secMax = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secMax); // second maximum value
		
		// top 3
		List<Integer> li = list.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).toList();
		System.out.println(li);
		
		// bottom 3
		List<Integer> li2 = list.stream().sorted(Comparator.naturalOrder()).distinct().limit(3).toList();
		System.out.println(li2);
		
		
		// string into map
		List<String> str = List.of("Java", "SQL", "Rest", "Spring");
		
		str.stream().filter(s-> s.startsWith("j")).forEach(x -> System.out.println(x));
		
		Map<String, Integer> map = str.stream().collect(Collectors.toMap(s -> s, s->s.length()));
		System.out.println(map);
		
		List<String> s = List.of("Damm", "Good", "kite", "Isacc", "wolf", "disco", "double", "great", "Goon");
		List<String> demo = s.stream().sorted(Comparator.naturalOrder()).toList();
		System.out.println(demo);
		
	}

}
