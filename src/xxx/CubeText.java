package xxx;

public class CubeText {

	public static void main(String[] args) {
		try {
//			Cube l1 = new Cube(0);
//			System.out.println(l1.getVolume());
			Cube l2 = new Cube();
			l2.setlength(0);
			System.out.println(l2.getVolume());
		} catch (CubeException e) {
			e.printStackTrace();
		}

	}

}
