package final6200materials;

import java.util.ArrayList;
import java.util.*;

import static java.util.Arrays.asList;

public class Solution {


	public static void main(String[] args) {
		String [] names = {"A","Z","Q","P"};

		List<String> anames = new ArrayList<>(asList(names));
		anames.forEach(n -> System.out.print(n + ", "));
		System.out.println();
		Collections.sort(anames);
		anames.forEach(n -> System.out.print(n + ", "));
		System.out.println();
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		for(String s :names) System.out.println(s);
		Integer []ar = {3,2,41,6,5,4,3,7,7,65,4,5};
		Arrays.stream(ar).sorted((a1,a2)->a1.compareTo(a2)).forEach(System.out::print);

		List <Integer>list = new ArrayList<Integer>(Arrays.asList(ar));
		Collections.sort(list,(Integer a1,Integer a2)->a1.compareTo(a2));
		list.stream().forEach(s->System.out.print(s+" "));
		list.stream().map(s->s*100).forEach(System.out::println);
		System.out.println(" ");
		list.stream().filter(s->s<10).forEach(System.out::println);
		Final.demo();
	}
}
