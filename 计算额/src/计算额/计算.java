package º∆À„∂Ó;

public class º∆À„ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double e=1;
		double item=1;
		for (i=10000;i<=100000;i=i+10000) {
			for(int j=1;j<=i;j++) {
				for(int h=j;h>0;h--) {
					item=item*h;
				}
				e=e+1/item;
			}
			System.out.println(String.format("%.5f", e));
		}

	}

}
