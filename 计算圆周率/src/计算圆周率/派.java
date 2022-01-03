package ¼ÆËãÔ²ÖÜÂÊ;

public class ÅÉ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double p=0;
		for (i=10000;i<=100000;i=i+10000) {
			for(int j=1;j<=i;j++) {
				p=p+Math.pow(-1,j+1)/(2*j-1);
			}
			System.out.println(String.format("%.8f",4*p));
			p=0;
		}

	}

}
