package day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo3 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		//date转String
		SimpleDateFormat sim=new SimpleDateFormat("yyyy年MM月dd日 a hh点mm分ss秒");
		sim.format(date);
		System.out.println(sim.format(date));
		//date转calendar
		Calendar calendar=Calendar.getInstance();
		calendar.get(Calendar.YEAR);
		System.out.println();
		

	}

}
