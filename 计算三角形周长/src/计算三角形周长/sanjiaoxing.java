package �����������ܳ�;
import java.util.Scanner;
public class sanjiaoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���������ߣ� ");
		Scanner input=new Scanner(System.in);
		int sum;
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		sum=a+b+c;
		if (a+b>c&&a+c>b&&b+c>a) {
			System.out.println("�ܳ���"+sum);
		}
		else
			System.out.println("��Щֵ���Ϸ�");

	}

}
