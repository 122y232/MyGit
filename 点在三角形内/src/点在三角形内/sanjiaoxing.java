package 点在三角形内;
import java.util.Scanner;
public class sanjiaoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		float x=input.nextFloat();
		float y=input.nextFloat();
		if(x>=0&&y>=0&&y+0.5*x-100<=0) {
			System.out.println("The point is in the triangle");
		}
		else {
			System.out.println("The point is not in the triangle");
		}

	}

}
