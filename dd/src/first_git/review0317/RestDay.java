package first_git.review0317;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RestDay {
//	�����, �Ͽ����ΰ�?
public static boolean isRest(Calendar tod) {
	boolean isRest = false;
	if(tod.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY || tod.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
//	����� �Ǵ� �Ͽ���
		isRest = true;
	}
	return isRest;
}
//Calendar�� ���ڿ���
public static String toYMD(Calendar dd) {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	return sdf.format(dd.getTime());
}
public static void main(String[]args) {
	Calendar cal=Calendar.getInstance();
//	������ ������ ����� Calendar ����
	int lastDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//	�̴��� ������ ���� ���Ͻÿ�
	for(int i= 1; i<=lastDay;i++) {
		cal.set(Calendar.DAY_OF_MONTH, i);
//		1�� ���� ������ ������
		if(isRest(cal)) {
//		����(��,��)Ȯ��
			System.out.println(toYMD(cal)+"�� �����Դϴ�.");
		}
	}
}
}
