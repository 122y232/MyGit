package 计算平均值和标准方差;
import java.util.Scanner;
public class 平均值 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		Double d1=input.nextDouble();
		Double d2=input.nextDouble();
		Double d3=input.nextDouble();
		Double d4=input.nextDouble();
		Double d5=input.nextDouble();
		Double d6=input.nextDouble();
		Double d7=input.nextDouble();
		Double d8=input.nextDouble();
		Double d9=input.nextDouble();
		Double d10=input.nextDouble();
		double mean=0;
		mean=(d1+d2+d3+d4+d5+d6+d7+d8+d9+d10)/10;
		double dev=0;
		dev=Math.sqrt(((d1*d1+d2*d2+d3*d3+d4*d4+d5*d5+d6*d6+d7*d7+d8*d8+d9*d9+d10*d10)-Math.pow((d1+d2+d3+d4+d5+d6+d7+d8+d9+d10), 2)/10)/9);
		System.out.println("The mean is "+String.format("%.2f", mean));
		System.out.println("The standard deviation is "+String.format("%.5f", dev));
		
		
		
		
		
	

	}

}
