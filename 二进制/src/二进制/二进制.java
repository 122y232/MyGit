package 二进制;
import java.util.Scanner;
public class 二进制 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("输入");
		int num=input.nextInt();
		String a="";
		while(num!=0) {
			a=num%2+a;
			num=num/2;
		}
		System.out.println(a);

	}

}
