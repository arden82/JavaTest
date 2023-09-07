package orm;

import java.util.List;
import java.util.Scanner;

public class DeptTest {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("要新增(查詢)的編號");
//		int deptno = sc.nextInt();
//		System.out.println("要新增的名稱");
//		String dname = sc.next();
//		System.out.println("要新增的所在地");
//		String loc = sc.next();
		
//		sc.close();
		
/////新增資料
//		//用Dept Bean包裝要新增的資料
//		Dept dept=new Dept(deptno,dname,loc);
//		//透過DAO物件呼叫方法完成新增部門資料
//		DeptDAO dao=new DeptDAOImpl();
//		dao.insert(dept);
//		System.out.println("新增成功");
		
		
/////查詢有條件資料
//		//透過DAO物件呼叫方法查詢部門資料
//		DeptDAO dao=new DeptDAOImpl();
//		Dept dept=dao.findByDeptno(deptno);
//		System.out.println(dept);
		
		
/////查詢所有資料
//		//透過DAO物件呼叫方法查詢部門資料
		DeptDAO dao=new DeptDAOImpl();
		List<Dept> deptList=dao.getAll();
		for(Dept d :deptList) {
			System.out.println(d);
		}
		
		
	}

}
