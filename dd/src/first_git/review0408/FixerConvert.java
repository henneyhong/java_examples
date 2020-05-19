package first_git.review0408;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.BufferedReader;

public class FixerConvert {
	public static String conversion(String date,String base) {
		BufferedReader br=null;   
//		http://data.fixer.io/api/latest?access_key=
		String newUrls1="http://data.fixer.io/api/%s?access_key=bb703913353f88992f5fc9a75e32fe83&symbols=KRW,JPY,CNY,USD,EUR";
		String newUrls=String.format(newUrls1,date,base);
		URL url=null;
		StringBuffer sb =new StringBuffer();
		try {
			url=new URL(newUrls);   //htt[://api.fixer.io
			System.out.println(newUrls);
			br=new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
				String msg="";
//				http://data.fixer.io/api를 읽어들인다.
			while((msg=br.readLine())!=null) {
				sb.append(msg);
			}
		} catch(Exception e) {
	}
		return sb.toString();
}
	public static void main(String[]args) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		String date=sdf.format(cal.getTime());
		String base ="USD";
		String fixerrate=FixerConvert.conversion(date, base);
		System.out.println( fixerrate);
		String base2="JPY";
		String fixerrate2=FixerConvert.conversion(date, base2);
		System.out.println(fixerrate2);
		String base3="CNY";
		String fixerrate3=FixerConvert.conversion(date, base3);
		System.out.println(fixerrate3);
		
	}
	
  }

