package 计算将来的学费;

public class 学费 {

	public static void main(String[] args) {
		int year;
		double sum=0;
		double fee=10000;
		double fee10;
		for (year=1;year<=10;year++) {
			fee=fee*1.05;
		}
		fee10=fee;
		for(year=1;year<=4;year++) {
			fee=fee*1.05;
			sum=sum+fee;
		}
		System.out.println("10年后学费是："+fee10);
		System.out.println("四年内总费用："+sum);

	}

}
