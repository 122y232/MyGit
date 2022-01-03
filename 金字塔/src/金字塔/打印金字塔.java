package ½ğ×ÖËş;
import java.util.Scanner;
public class ´òÓ¡½ğ×ÖËş {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n=input.nextInt();
		for(int a=0;a<n;a++) {
			for(int d=n-a-1;d>0;d--) {
				System.out.print("  ");
			}
			for (int b=a+1;b>0;b--) {
				System.out.print(b+" ");
				if(b==1) {
					for (int c=b+1;c<a+2;c++) {
						System.out.print(c+" ");
					}
				}
			}
			System.out.println("");
		}
		
		

	}

}
                                                       

                                   