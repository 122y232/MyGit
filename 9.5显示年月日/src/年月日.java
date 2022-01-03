import java.util.GregorianCalendar;
public class ƒÍ‘¬»’ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar clendar=new GregorianCalendar();
		System.out.println(clendar.get(GregorianCalendar.YEAR)+" "+clendar.get(GregorianCalendar.MONTH)+" "+clendar.get(GregorianCalendar.DAY_OF_MONTH));
		clendar.setTimeInMillis(1234567898765L);
		System.out.println(clendar.get(GregorianCalendar.YEAR)+" "+clendar.get(GregorianCalendar.MONTH)+" "+clendar.get(GregorianCalendar.DAY_OF_MONTH));

	}

}
