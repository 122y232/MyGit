package circle;

public class testcirclewithstaticmembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating objects");
		System.out.println("The number of circle objects is"+circle.numberofobjects);
		circle c1=new circle();
		System.out.println("\nAfter creating c1");
		System.out.println("c1:radius("+c1.radius+c1.numberofobjects+")");
		circle c2=new circle(5);
		c1.radius=9;
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius ("+c1.radius+") and number of circle objects ("+c1.numberofobjects+")");
		System.out.println("c1: radius ("+c1.radius+") and number of circle objects ("+c1.numberofobjects+")");

	}

}
