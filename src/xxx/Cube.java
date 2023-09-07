package xxx;

public class Cube {
	private double length;


	public Cube(){

	}

	public Cube(double length) throws CubeException {
//		if (length > 0) {
//			this.length = length;
//		} else {
//			throw new CubeException("正立方體邊長不得為0或是負數");
//		}
		setlength(length);
	}

	public double getVolume() {
		return Math.pow(length, 3);
	
	}

	public void setlength(double length) throws CubeException{
		if (length > 0) {
			this.length = length;
		} else {
			throw new CubeException("正立方體邊長不得為0或是負數");
		}
	}
}
