package h_lang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date today = new Date(); //현재 날짜
		
		System.out.println(today);
		
		//날짜 -> 포맷 -> 문자열
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.sss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd hh:mm:ss.s a");
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		//문자열 -> 포맷 -> 날짜
		String str = "2018년 10월 21일";
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		try {
			Date parseDate = sdf5.parse(str);
			System.out.println(sdf1.format(parseDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance();
		
		//날짜 셋팅
		cal.setTime(new Date());
		cal.set(2018, 9, 22); //2018/10/22로 표기(월은 0부터 시작)
		
		Date date = cal.getTime();
		
		//날짜 계산
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.DAY_OF_MONTH, 1);
		cal.add(Calendar.HOUR, 1);
		cal.add(Calendar.MINUTE, 1);
		cal.add(Calendar.SECOND, 1);
		
		System.out.println(sdf3.format(cal.getTime()));
		
		
	}

}