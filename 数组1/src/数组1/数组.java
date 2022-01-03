package 数组1;
import java.util.Scanner;
public class 数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] mylist=new int[10];
		int[] mylist2=new int[10];
		System.out.print("Enter 10 numbers: ");
		int total=0;
		int x=0;
		int y=0;
		for (int i=0;i<10;i++) {
			mylist[i]=input.nextInt();
		}
		for (int j=0;j<10;j++) {
			for (int n=0;n<j;n++) {
				if(mylist[j]==mylist[n]) {
					total=total-1;
					x=1;
					break;
				}
			}
			total=total+1;
			if(x!=1) {
				mylist2[y]=mylist[j];
				y++;
			}
			x=0;
		}
		System.out.println("The number of distinct number is "+total);
		System.out.print("The distinct number is ");
		for(int m=0;m<total;m++) {
			System.out.print(mylist2[m]+" ");
		}

	}

}
