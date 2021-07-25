package practice1;

import java.util.Calendar;
import java.util.GregorianCalendar;
public class DateTime {
public static void main(String[] args) {
	 int day,month,year;
	 int second,minute,hour;
	 GregorianCalendar date=new GregorianCalendar() ;//creating date object
	 day=date.get(Calendar.DAY_OF_MONTH);//storing day of the month
	 month=date.get(Calendar.MONTH);//storing the month;
     year=date.get(Calendar.YEAR);
     second=date.get(Calendar.SECOND);//time in seconds,minute,hours
     hour=date.get(Calendar.HOUR);
     minute=date.get(Calendar.MINUTE);
     System.out.println("current date is"+day+"/"+(month+1)+"/"+year);
     System.out.println("current time is"+hour+"/"+(minute)+"/"+second);
     


}

}
     



