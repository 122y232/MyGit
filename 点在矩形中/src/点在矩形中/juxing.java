package 点在矩形中;
import java.util.Scanner;
public class juxing {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		float x=input.nextFloat();
		float y=input.nextFloat();
		if(x<=10 &&x>=-10&&y<=5&& -5<=y) {
			System.out.println("point"+"("+x*1.0+","+y*1.0+")"+"is in the rectangle");
		}
		else {
			System.out.println("point"+"("+x*1.0+","+y*1.0+")"+"is not in the rectangle");
		}
		

	}

}
