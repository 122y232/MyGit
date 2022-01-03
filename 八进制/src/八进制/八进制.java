package 八进制;
import java.util.Scanner;
public class 八进制 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("输入");
		int num=input.nextInt();
		String a="";
		while(num!=0) {
			a=num%8+a;
			num=num/8;
		}
		System.out.println(a);

	}

	}


