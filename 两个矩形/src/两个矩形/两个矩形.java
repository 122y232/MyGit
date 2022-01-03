package 两个矩形;
import java.util.Scanner;
public class 两个矩形 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter r1's center x-,y-coordinates,width,and height:");
		Float x1=input.nextFloat();
		Float y1=input.nextFloat();
		Float w1=input.nextFloat();
		Float h1=input.nextFloat();
		System.out.println("Enter r2's center x-,y-coordinates,width,and height:");
		Float x2=input.nextFloat();
		Float y2=input.nextFloat();
		Float w2=input.nextFloat();
		Float h2=input.nextFloat();
		if(x2+0.5*w2<=x1+0.5*w1&&x2-0.5*w2>=x1-0.5*w1&&y2+0.5*h2<=y1+0.5*h1&&y2-0.5*h2>=y1-0.5*h1) {
			System.out.println("r2 is inside r1");
		}
		else if(x2+0.5*w2<=x1-0.5*w1||x2-0.5*w2>=x1+0.5*w1||y2-0.5*h2>=y1+0.5*h1||y2+0.5*h2<=y1-0.5*h1) {
			System.out.println("r2 does not overlap r1");
		}
		else {
			System.out.println("r2 overlaps r1");
		}
		

	}

}
