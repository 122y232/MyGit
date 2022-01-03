package 计算三角形周长;
import java.util.Scanner;
public class sanjiaoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入三条边： ");
		Scanner input=new Scanner(System.in);
		int sum;
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		sum=a+b+c;
		if (a+b>c&&a+c>b&&b+c>a) {
			System.out.println("周长是"+sum);
		}
		else
			System.out.println("这些值不合法");

	}

}
