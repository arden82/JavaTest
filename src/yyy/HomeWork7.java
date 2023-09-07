package yyy;

import java.io.*;

public class HomeWork7 {

	public HomeWork7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			// 第一題呼叫
//			fileBytes();

			// 第二題呼叫
//			randomData();

			// 第三題呼叫
			FileReader fr = new FileReader("Data.txt");
			FileWriter fw = new FileWriter("paste.txt");
			copyFile(fr, fw);
			

		} catch (IOException e) {
			System.out.print("IOException \n");
		}
	}

//第一題 方法
	public static void fileBytes() throws IOException {
		File readFile = new File("Sample.txt");
		System.out.print(readFile.length() + "位元組\n");
		FileReader fr = new FileReader(readFile);
		int k = 0;
		while (fr.read() != -1) {
			k++;
		}
		System.out.print(k + "個字元\n");
		FileReader in = new FileReader(readFile);
		BufferedReader br = new BufferedReader(in);
		int i = 0;
		while (br.readLine() != null) {
			i++;
		}
		System.out.print(i + "列資料\n");
		br.close();
		fr.close();
	}

//第二題
	public static void randomData() throws IOException {
		int randomNum;
		FileWriter data = new FileWriter("Data.txt", true);
		BufferedWriter bw = new BufferedWriter(data);
		PrintWriter pw = new PrintWriter(bw);
		for (int i = 0; i < 10; i++) {
			randomNum = (int) (Math.random() * 1001);
			pw.println(randomNum);
			pw.flush();
		}
		pw.close();
		bw.close();
		data.close();
	}

//第三題
	public static void copyFile(FileReader f1, FileWriter f2) throws IOException {
		BufferedReader br = new BufferedReader(f1);
		BufferedWriter bw = new BufferedWriter(f2);
		PrintWriter pw = new PrintWriter(bw);
		String a ;	
		while ((a=br.readLine() )!= null) {
			pw.println(a);
			pw.flush();

		}
		pw.close();
		bw.close();
		br.close();
	
	}
	

}
