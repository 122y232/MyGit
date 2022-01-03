package 显示每月第一天是星期几;
import java.util.Scanner;
public class 显示每月第一天 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String b="",d="";
		int c=0;
		int xin;
		System.out.print("输入年份： ");
		int year=input.nextInt();
		System.out.print("输入星期几： ");
		int day=input.nextInt();
		xin=day;
		for(int a=1;a<=12;a++) {
		if(a==1) {
			b="January";
			c=0;
		}
		else if(a==2) {
			b="Febuary";
			c=3;
		}
		else if(a==3) {
			b="March";
			if(year%4==0&&year%100!=0) {
			    c=1;
			}
			else if(year%400==0) {
				c=1;
			}
			else {
				c=0;
			}
			
			
		}
		else if(a==4) {
			b="April";
			c=3;
		}
		else if(a==5) {
			b="May";
			c=2;
		}
		else if(a==6) {
			b="June";
			c=3;
		}
		else if(a==7) {
			b="July";
			c=2;
		}
		else if(a==8) {
			b="August";
			c=3;
		}
		else if(a==9) {
			b="Septermber";
			c=3;
		}
		else if(a==10) {
			b="Octber";
			c=2;
		}
		else if(a==11) {
			b="Novermber";
			c=3;
		}
		else if(a==12) {
			b="Decmber";
			c=2;
		}
		xin=(xin+c)%7;
		if(xin==0) {
			d="Sunday";
		}
		else if(xin==1) {
			d="Monday";
		}
		else if(xin==2) {
			d="Tuesday";
		}
		else if(xin==3) {
			d="Wednesday";
		}
		else if(xin==4) {
			d="Thursday";
		}
		else if(xin==5) {
			d="Friday";
		}
		else if(xin==6) {
			d="Saturday";
		}
		System.out.println(b+" 1,"+year+" is "+d);
		
		}
		

	}

}
