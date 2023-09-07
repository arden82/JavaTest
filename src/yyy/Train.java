package yyy;

import java.util.*;

public class Train implements Comparable<Train> {

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	

	public Train() {
		// TODO Auto-generated constructor stub
	}
	public void setNumber(int number) {
		this.number=number;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	public void setStart(String start) {
		this.start=start;
	}
	public void setDest(String dest) {
		this.dest=dest;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	
	}

	public void getTrain() {
		System.out.println("["+number + "," + type + "," + start + "," + dest + "," + price+"]");
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	@Override
	public int compareTo(Train o) {
		if (this.number < o.number) {
			return 1;
		} else if (this.number == o.number) {
			return 0;
		} else {
			return -1;
		}

	}

	public static void main(String[] args) {
		Train[] wrap = new Train[7];
		wrap[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		wrap[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		wrap[2] = new Train(118, "自強", "高雄", "台北", 500);
		wrap[3] = new Train(1288, "區間", "新竹", "基隆", 400);
		wrap[4] = new Train(122, "自強", "台中", "花蓮", 600);
		wrap[5] = new Train(1222, "區間", "樹林", "七堵", 300);
		wrap[6] = new Train(1254, "區間", "屏東", "基隆", 700);
		// 請寫一隻程式，能印出不重複的Train物件
//		Set set= new HashSet();
		Set<Train> set= new HashSet();
		for (int i = 0; i < wrap.length; i++) {
			set.add(wrap[i]);
		}
		System.out.println("不重複的Train物件:");
		Iterator objs = set.iterator();
		System.out.println("Iterator-----------");

		while (objs.hasNext()) {
			((Train)objs.next()).getTrain();
		}
		System.out.println("for-each------");
		for(Train ss:set) {
			ss.getTrain();

		}

		System.out.println("------------------------------");
		// Train物件印出時，能以班次編號由大到小印出
		List<Train> list = new ArrayList<>();
		for (int i = 0; i < wrap.length; i++) {
			list.add(wrap[i]);
		}

		Collections.sort(list);
		Iterator objl = list.iterator();
		System.out.println("班次編號由大到小印出:");
		System.out.println("for-each------");
		for (Train ll : list) {
			ll.getTrain();
		}
		System.out.println("for--------");
		for(int i=0;i<list.size();i++) {
			list.get(i).getTrain();
		}
		System.out.println("Iterator-----------");
		while(objl.hasNext()) {
			((Train)objl.next()).getTrain();;
		}
		
		
		System.out.println("------------------------------");
		//班次編號由大排到小印出， 還可以不重複印出Train物件
		System.out.println("班次編號由大到小印出,不重複:");
		Set<Train> tset=new TreeSet();
		for (int i = 0; i < wrap.length; i++) {
			tset.add(wrap[i]);
		};
		Iterator objts = tset.iterator();
		System.out.println("for-each------");
		for (Train ll : tset) {
			ll.getTrain();
		};
		System.out.println("Iterator-----------");
		while(objts.hasNext()) {
			((Train)objts.next()).getTrain();;
		}
	}



}
