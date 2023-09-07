package yyy;

import java.io.*;


public abstract class Animal implements Serializable {

	public Animal() {
		final long serialVersionUID = 1l;
		// TODO Auto-generated constructor stub
	}

	public abstract void speak();

	public static void main(String[] args) throws Exception {
		File f1 = new File("c:/data");
		if (!f1.exists()) {
			f1.mkdir();
		}
		File fo = new File("c:/data/Object.ser");
		Animal[] animals = new Animal[4];
		animals[0] = new Cat("米香");
		animals[1] = new Cat("多多");
		animals[2] = new Dog("布魯托");
		animals[3] = new Dog("秋葵");
//輸出
		FileOutputStream fos = new FileOutputStream(fo);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < animals.length; i++) {
			oos.writeObject(animals[i]);
		}
		oos.close();
		fos.close();
//輸入
		FileInputStream fis=new FileInputStream(fo);
		ObjectInputStream ois=new ObjectInputStream(fis);
		try {
			while(true) {
				((Animal) ois.readObject()).speak();
			}
		}catch( IOException e) {
			System.out.println("資料讀取完畢");
		}
		ois.close();
		fis.close();
	}
}
