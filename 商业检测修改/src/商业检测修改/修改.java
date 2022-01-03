package 商业检测修改;
import java.util.Scanner;
public class 修改 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] d=new int[9];
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int dz = input.nextInt();
		for(int i=0;i<9;i++) {
			d[i]=dz%10;
			dz=dz/10;
		}
		int d10=(d[8]*1+d[7]*2+d[6]*3+d[5]*4+d[4]*5+d[3]*6+d[2]*7+d[1]*8+d[0]*9)%11;
		if (d10==10) {
			System.out.println("The ISBN-10 number is "+d[8]+d[7]+d[6]+d[5]+d[4]+d[3]+d[2]+d[1]+d[0]+"X");
		}
		else {
			System.out.println("The ISBN-10 number is "+d[8]+d[7]+d[6]+d[5]+d[4]+d[3]+d[2]+d[1]+d[0]+d10);
		}

	}

}
