package 金融应用2;
import java.util.Scanner;
public class 金融2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double monthly;
		Double total;
		Double k;
		int i;
		Double in,pr,ba;
		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amout: ");
		Double z=input.nextDouble();
		System.out.print("Number of Year: ");
		Double y=input.nextDouble();
		System.out.print("Annual Interest Rate: ");
		Double a=input.nextDouble();
		k=a/1200;
		monthly=(z*k)/(1-1/(Math.pow(1+k, y*12)));
		total=monthly*y*12;
		System.out.println("Monthly Payment  "+String.format("%.2f", monthly));
		System.out.println("Total Payment  "+String.format("%.2f",total));
		System.out.println("Payment#      Interest      Principal      Balance");
		ba=z;
		for (i=1;i<=y*12;i++) {
			in=k*ba;
			pr=monthly-in;
			ba=ba-pr;
			System.out.println(i+"\t\t"+String.format("%.2f", in)+"\t\t"+String.format("%.2f",pr)+"\t\t"+String.format("%.2f",ba));
		
		}
			
		
				

	}

}
