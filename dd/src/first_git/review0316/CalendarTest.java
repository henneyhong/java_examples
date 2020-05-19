package first_git.review0316;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[]args) {
		long millis = System.currentTimeMillis();				//1970.1.1 ���� ����ð� msec
		System.out.println(millis/1000/24/60/60);				// ���� ���
		Date d = new Date();									//����
		System.out.println(d);
		Date dd = new Date(d.getTime()+24*60*60*1000);			//�Ϸ� �� 
		System.out.println(dd);
		
		Calendar cal1993 = Calendar.getInstance();
		cal1993.set(1993, 6, 26);		//0~11��
		//cal1993.set(1993, Calendar.JULY ,26);	//0��~11��
		Calendar today=Calendar.getInstance();	//����
		printCalendar(today);
		long minus=today.getTimeInMillis()-cal1993.getTimeInMillis();
		System.out.println(minus);					//1993.07.26~ ���� msec
		System.out.println(minus/1000/24/60/60);	//1993�� ���� ���� ��������


		
	 
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
