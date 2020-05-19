package first_git.review0316;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[]args) {
		long millis = System.currentTimeMillis();				//1970.1.1 부터 경과시간 msec
		System.out.println(millis/1000/24/60/60);				// 몇일 경과
		Date d = new Date();									//오늘
		System.out.println(d);
		Date dd = new Date(d.getTime()+24*60*60*1000);			//하루 후 
		System.out.println(dd);
		
		Calendar cal1993 = Calendar.getInstance();
		cal1993.set(1993, 6, 26);		//0~11월
		//cal1993.set(1993, Calendar.JULY ,26);	//0월~11월
		Calendar today=Calendar.getInstance();	//오늘
		printCalendar(today);
		long minus=today.getTimeInMillis()-cal1993.getTimeInMillis();
		System.out.println(minus);					//1993.07.26~ 오늘 msec
		System.out.println(minus/1000/24/60/60);	//1993년 부터 몇일 지났는지


		
	 
	}

	private static void printCalendar(Calendar today) {
		System.out.println("------------------------------");
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1);
		System.out.println(today.get(Calendar.DAY_OF_MONTH));
		System.out.println(today.get(Calendar.AM_PM));
		System.out.println(today.get(Calendar.HOUR_OF_DAY));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
	}
}
