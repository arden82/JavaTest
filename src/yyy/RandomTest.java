package yyy;

import java.util.*;

public class RandomTest {

	public RandomTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int num;
		Set <Integer>set = new TreeSet<>();
		while(set.size()!=6) {
			num = (int) (Math.random() * 49)+1;
			set.add(num);
		}
		Iterator objs = set.iterator();
		while (objs.hasNext()) {
			System.out.println(objs.next());

		}
	}

}
