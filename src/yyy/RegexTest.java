package yyy;

import java.util.Scanner;

public class RegexTest {

	public RegexTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String values =sc.next();
		String reg="^[A-Za-Z][1-2]{1}\\d{8}$";
		if(values.matches(reg)) {
			System.out.println("good");
		}else {
			System.out.println("bad");	
		}
		sc.close();
	}
}
