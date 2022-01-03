package …Ã“µºÏ≤‚;
import java.util.Scanner;

public class shangyejiance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner input= new Scanner(System.in);
	    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int dz = input.nextInt();
		int d9=dz%10;
		int d8=dz/10%10;
		int d7=dz/100%10;
		int d6=dz/1000%10;
		int d5=dz/10000%10;
		int d4=dz/100000%10;
		int d3=dz/1000000%10;
		int d2=dz/10000000%10;
		int d1=dz/100000000;
		int d10=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		if (d10==10) {
			System.out.println("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");
		}
		else {
			System.out.println("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
		}

	}

}
