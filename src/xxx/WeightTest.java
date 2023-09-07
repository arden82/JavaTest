package xxx;

public class WeightTest {
  public static void main(String[] args) {
	  WeightAble[] w =new WeightAble[3];
	  w[0]=new Dog();
	  w[1]= new Plane();
	  w[2]=new Powder();
	  
	  for(int i=0;i<w.length;i++) {
		  w[i].getWeightTool();
	  }
  }
}
