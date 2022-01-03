package 点是否在圆内;
import java.util.Scanner;
public class jiance {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		if(x*x+y*y<=100) {
			System.out.println("Point" + "("+ x*1.0 +","+ y*1.0 + ")" + "is in the circle");
		}
		else {
			System.out.println("Point" +"("+ x*1.0 +","+ y*1.0 + ")" + "is not in the circle");
		}
		

	}

}
