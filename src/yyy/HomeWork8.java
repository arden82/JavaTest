package yyy;

import java.math.BigInteger;
import java.util.*;

public class HomeWork8 {

	public HomeWork8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(1000));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		Iterator objs = list.iterator();
		for (int i = 0; i < list.size(); i++) {
			System.out.print("傳統for" + list.get(i) + "\n");
		}
		System.out.println("----------------------------");
		for (Object value : list) {
			System.out.print("for-each:" + value + "\n");
		}
		System.out.println("----------------------------");
		int count = 0;
		Object o;
		// 使用迭代器新增刪除集合的數量會出現java.util.ConcurrentModificationException
		// 使用for去跑，因為list.size()會新增刪除產生變動，導致會索引數會有誤差，除非使用--
		// 跑while時條件不能用變數去接list.size()，當有刪除過時會出現java.lang.IndexOutOfBoundsException
//		使用while寫法
//		while (count<list.size()) {
//			if (!((o=list.get(count)) instanceof Number)) {
//				list.remove(o);
//			}else {				
//				count++;
//			}
//		}
//		使用for寫法
		for (int i = 0; i < list.size(); i++) {
			if (!((list.get(i)) instanceof Number)) {
				list.remove(i);
				i--;
			}
		}

		for (int k = 0; k < list.size(); k++) {
			System.out.print(list.get(k) + "\n");
		}

	}

}
