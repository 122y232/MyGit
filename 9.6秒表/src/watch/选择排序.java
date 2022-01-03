package watch;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class —°‘Ò≈≈–Ú {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] arr=new int[100000];
		Random r=new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i]=r.nextInt(100000);
		}
		stopwatch s=new stopwatch();
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(i!=min) {
				int tmp=arr[i];
				arr[i]=arr[min];
				arr[min]=tmp;
			}
		}
		s.stop();
		System.out.println(s.getElapsedTime());
	}
}
