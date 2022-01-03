package 金融应用;
import java.text.NumberFormat;
import java.util.Scanner;
public class 金融 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double k;
		Double n=0.05;
		Double monthly;
		Double total;
		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amount: ");
		Double z=input.nextDouble();
		System.out.print("Number of Years: ");
		Double y=input.nextDouble();
		NumberFormat nf=NumberFormat.getPercentInstance();
		nf.setMinimumFractionDigits(3);
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		while(n<=0.08125) {
			k=n/12;
			monthly=(z*k)/(1-1/(Math.pow(1+k, y*12)));
			total=monthly*y*12;
			System.out.println(nf.format(n)+"           "+String.format("%.2f", monthly)+"            "+String.format("%.2f",total));
			n=n+0.00125;
		}

	}

}
