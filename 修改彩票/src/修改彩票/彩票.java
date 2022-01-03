package ÐÞ¸Ä²ÊÆ±;

public class ²ÊÆ± {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery=(int)(Math.random()*10);
		int lottery2=0;
		int n=2;
		while(n>1) {
			lottery2=(int)(Math.random()*10);
			if(lottery==lottery2) {
				continue;
			}
			else {
				break;
			}
		}
		System.out.println(lottery*10+lottery2);

	}

}
