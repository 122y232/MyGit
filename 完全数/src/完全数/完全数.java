package 完全数;

public class 完全数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for(i=1;i<=10000;i++) {
			int sum=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					sum+=j;
				}
				else continue;
			}
			if(sum==i) {
				System.out.println(i);
			}
		}

	}

}
