package 两个圆;
import java.util.Scanner;
public class 两个圆 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter circle1's center x-,y-coordniates,and radius: ");
		Float x1=input.nextFloat();
		Float y1=input.nextFloat();
		Float r1=input.nextFloat();
		System.out.println("Enter circle2's center x-,y-coordniates,and radius: ");
		Float x2=input.nextFloat();
		Float y2=input.nextFloat();
		Float r2=input.nextFloat();
		if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<=Math.abs(r1-r2)) {
			System.out.println("Circle2 is inside circle1");
		}
		else if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<=r1+r2){
			System.out.println("Circle2 overlaps circle1");
		}
		else {
			System.out.println("Circle2 does not overlap circle1");
		}
		

	}

}
