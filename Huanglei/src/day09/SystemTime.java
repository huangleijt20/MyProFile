package day09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SystemTime {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat d = new SimpleDateFormat("yyyy 年 MM 月 dd 日");
		String date2 = d.format(date);
		System.out.println(date2);
		Calendar c = Calendar.getInstance();
		c.set(2015, 3, 6);
		int num = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println(num);

		// String 转Date
		String time = "1991-2-19";
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = new Date();
		try {
			date1 = sim.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date1);
	}
}
