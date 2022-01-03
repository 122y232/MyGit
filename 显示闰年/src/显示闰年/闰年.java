package ÏÔÊ¾ÈòÄê;

public class ÈòÄê {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int count=0;
		int year;
		for(year=101;year<=2100;year++) {
			if(year%4==0&&year%100!=0) {
				System.out.print(year+" ");
				count=count+1;
				sum=sum+1;
				if(count==10) {
					System.out.println("\n");
					count=0;
				}
			}
			else if(year%400==0) {
				System.out.print(year+" ");
				count=count+1;
				sum=sum+1;
				if(count==10) {
					System.out.println("\n");
					count=0;
				}
			}
		}
		System.out.println("summary="+sum);

	}

}
