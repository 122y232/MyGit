package 数组2;
import java.util.Scanner;
public class 数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("输入学生总量： ");
		int total=input.nextInt();
		int[] chengji=new int[total];
		String[] str = new String[total];
		for(int i=0;i<total;i++) {
			chengji[i]=input.nextInt();
			str[i]=input.next();
		}
		for(int i=0;i<total-1;i++) {
			for(int j=0;j<total-1-i;j++) {
				if(chengji[j]<=chengji[j+1]) {
					int temp=chengji[j];
					chengji[j]=chengji[j+1];
					chengji[j+1]=temp;
					String c=str[j];
					str[j]=str[j+1];
					str[j+1]=c;
				}
			}
		}
	
		

	}

}
