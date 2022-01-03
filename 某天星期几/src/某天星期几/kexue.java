package Ä³ÌìÐÇÆÚ¼¸;
import java.util.Scanner;
public class kexue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
		int k;
		int m;
		int h;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: (e.g.,2012): ");
		int year=input.nextInt();
		System.out.print("Enter month: 1-12: ");
		int month=input.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		int day=input.nextInt();
		if (month==1) {
			month=13;
			year=year-1;
		}
		if (month==2) {
			month=14;
			year=year-1;
		}
		j=year/100;
		k=year%100;
		m=26*(month+1)/10;
		h=(day+m+k+k/4+j/4+5*j)%7;
		if (h==0) {
			System.out.println("Day of the week is Saturday");
		}
		else if(h==1){
			System.out.println("Day of the week is Sunday");
		}
		else if(h==2){
			System.out.println("Day of the week is Monday");
		}
		else if(h==3){
			System.out.println("Day of the week is Tuesday");
		}
		else if(h==4){
			System.out.println("Day of the week is Wednesday");
		}
		else if(h==5){
			System.out.println("Day of the week is Thursday");
		}
		else if(h==6){
			System.out.println("Day of the week is Friday");
		}
	}

}
