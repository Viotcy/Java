package ex01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class TimeDemo {

	public static void main(String[] args) {
		Date d = new Date();
		long now = System.currentTimeMillis();
		System.out.println("Date.getTime()=" + d.getTime());
		System.out.println("           now=" + now);
		System.out.println("------相互轉換-------");
		System.out.println("------long==>java.util.Date-----");
		Date d2 = new Date(now);
		System.out.println("------java.util.Date==>long-----");
		long now2 = d2.getTime();
		GregorianCalendar gc = new GregorianCalendar();
		Date d3 = new Date(0);
		gc.setTime(d3);
		gc.setTimeInMillis(0);
		System.out.print(" 年=" + gc.get(Calendar.YEAR));
        System.out.print(" 月(0-based)=" + gc.get(Calendar.MONTH));
        System.out.print(" 日=" + gc.get(Calendar.DAY_OF_MONTH));
        System.out.print(" 時=" + gc.get(Calendar.HOUR_OF_DAY));
        System.out.print(" 分=" + gc.get(Calendar.MINUTE));
        System.out.print(" 秒=" + gc.get(Calendar.SECOND));
        System.out.println();
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
		String s = sdf.format(d);
		System.out.println(s);
		System.out.println("----------------------");
		long t = System.currentTimeMillis();
		Date d0 = new Date(t);
		s = sdf.format(d0);
		System.out.println(s);
		System.out.println("----------------------");
	}

}
