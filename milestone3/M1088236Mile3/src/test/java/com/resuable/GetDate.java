package com.resuable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDate {
	public static  String getDatetimeFormat() {
		
		DateFormat cusFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date date=new Date();
		
	return	cusFormat.format(date);
	}

}
