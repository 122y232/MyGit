package circle;

public class testpassobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle mycircle=new circle(1);
		int n=5;
		printAreas(mycircle,n);
		System.out.println("\n"+"radius is"+mycircle.getradius());
		System.out.println("n  is"+n);

	}
public static void printAreas(circle c,int times) {
	System.out.println("radius \t\tArea");
	while(times>=1) {
		System.out.println(c.getradius()+"\t\t"+c.getradius());
		c.setradius(c.getradius()+1);
		times--;
	}
}

}
