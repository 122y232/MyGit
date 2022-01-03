package ≤ ∆±;
import java.util.Scanner;
public class caipiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lo=(int)(Math.random()*900)+100;
		Scanner input = new Scanner(System.in);
		System.out.print(" ‰»Îƒ„µƒ≤ ∆±∫≈¬Î");
		int guess=input.nextInt();
		int lod1=lo%10;
		int lod2=lo/10%10;
		int lod3=lo/100;
		int gd1=guess%10;
		int gd2=guess/10%10;
		int gd3=guess/100;
		if(lod1==gd1&&lod3==gd3&&lod2==gd2) {
			System.out.println("”Æµ√10000$");
		}
		else if ((lod1==gd1||lod1==gd2||lod1==gd3)
				&&(lod2==gd1||lod2==gd2||lod2==gd3)
				&&(lod3==gd1||lod3==gd2||lod3==gd3)) {
			System.out.println("”Æµ√3000$");
		}
		else if((lod1==gd1||lod1==gd2||lod1==gd3||lod2==gd1||lod2==gd2||lod2==gd3||lod3==gd1||lod3==gd2||lod3==gd3)) {
			System.out.println("”Æµ√1000$");
		}
		else 
			System.out.println("sorry");
		
		

	}

}
