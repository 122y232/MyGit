package date;
import java.util.Date;
public class ÈÕÆÚ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		long s=10000;
		for(long i=1;i<8;i=i+1) {
			s=s*10;
			date.setTime(i);
			System.out.println(date.toString());
		}
	}
}
