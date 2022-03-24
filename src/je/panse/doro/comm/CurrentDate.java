package je.panse.doro.comm;

import java.util.*;	
import java.text.*;

public class CurrentDate {
	public static String save_time;
	
	public static void defineTime() {
	      Date dNow = new Date( );
	      SimpleDateFormat ft =  new SimpleDateFormat ("yyyy.MM.dd E'요일'  hh:mm a ");
//	      new SimpleDateFormat ("E'요일'  yyyy.MM.dd 'at' hh:mm:ss a zzz");
	      System.out.println("Current Date: " + ft.format(dNow));
	      save_time = ft.format(dNow);
	}
// ----------------------------------------------
	public static void defineDate() {
	      Date dNow = new Date( );
	      SimpleDateFormat ft =  new SimpleDateFormat ("yyyy.MM.dd");
	      System.out.println("[ " + ft.format(dNow) + " ]");
	      save_time = ft.format(dNow);
	}
// ----------
}