package day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo3 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		//dateתString
		SimpleDateFormat sim=new SimpleDateFormat("yyyy��MM��dd�� a hh��mm��ss��");
		sim.format(date);
		System.out.println(sim.format(date));
		//dateתcalendar
		Calendar calendar=Calendar.getInstance();
		calendar.get(Calendar.YEAR);
		System.out.println();
		

	}

}
