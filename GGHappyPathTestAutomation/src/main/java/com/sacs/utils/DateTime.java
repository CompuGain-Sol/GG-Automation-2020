/*package com.sacs.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateTime {
	
	private Map<String, Integer> serialNumberMap = new HashMap<String, Integer>();

	public String ymdhmsTime(){
		String ymdhmsTime = null;
		DateFormat ymdhms = new SimpleDateFormat("HH-mm-ss_dd-MM-yy");
		Date date = new Date();
		ymdhmsTime = ymdhms.format(date);
		return (ymdhmsTime);
	}

	public String hmsTime(){
		String hmsTime = null;
		DateFormat hms = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		hmsTime = hms.format(date);
		return (hmsTime);
	}

	public double timeDifference(String startTime, String endTime){
		double diffTime = 0;
		try {
			DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			Date time1 = dateFormat.parse(startTime);
			Date time2 = dateFormat.parse(endTime);
			long t1 = time1.getTime();

			long t2 = time2.getTime();

			diffTime = (Math.abs(t2 - t1) / 1000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		
		return ((double) diffTime);
	}
	
	
	public Integer daysDifference(String startDate, String endDate){
		String[] start = startDate.split("/");
		String[] end = endDate.split("/");

		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();

		calendar1.set(Integer.parseInt(start[2]), Integer.parseInt(start[1]) , Integer.parseInt(start[0]));
		calendar2.set(Integer.parseInt(end[2]), Integer.parseInt(end[1]) , Integer.parseInt(end[0]));
		
		long milliseconds1 = calendar1.getTimeInMillis();
	    long milliseconds2 = calendar2.getTimeInMillis();
	    long diff = milliseconds2 - milliseconds1;
		
		int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
	//	System.out.println("diffDays: "+diffDays);
		
		return diffDays;
		
		
	}
	
	public String YYYYMMDDHHmmssTime(){
		String ymdhmsTime = null;
		DateFormat ymdhms = new SimpleDateFormat("yyyyMMDDHHmmss");
		Date date = new Date();
		ymdhmsTime = ymdhms.format(date);
		return (ymdhmsTime);
	}
	
	public String HHMMDDMMyyTime(){
		String ymdhmsTime = null;
		DateFormat ymdhms = new SimpleDateFormat("HH:mm dd-MM-yyyy");
		Date date = new Date();
		ymdhmsTime = ymdhms.format(date);
		return (ymdhmsTime);
	}
	
	public String MMDDYYYY() throws Exception {
		String ymdhmsTime = null;
		DateFormat ymdhms = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		ymdhmsTime = ymdhms.format(date);
		return (ymdhmsTime);
	}
	public String DDMMYYYY(){
		String ymdhmsTime = null;
		DateFormat ymdhms = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		ymdhmsTime = ymdhms.format(date);
		return (ymdhmsTime);
	}
	
	public String MMDDYYYYHHMM() throws Exception {
		String ymdhmsTime = null;
		DateFormat ymdhms = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		Date date = new Date();
		ymdhmsTime = ymdhms.format(date);
		return (ymdhmsTime);
	}
	public Map<String, Integer> getSerialNumberMap() {
		return serialNumberMap;
	}

	public void setSerialNumberMap(Map<String, Integer> serialNumberMap) {
		this.serialNumberMap = serialNumberMap;
	}
	
	public String addDaysToCurrentDate(int days){
		Date now = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(now); 
		c.add(Calendar.DATE, days);
		now = c.getTime();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(now);
	}
	
	public String addDaysToCurrentDateM(int days){
		Date now = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(now); 
		c.add(Calendar.DATE, days);
		now = c.getTime();
        SimpleDateFormat format = new SimpleDateFormat("M/dd/yyyy");
        return format.format(now);
	}
	
	public String addDaysToSpecifiedDate(String date, int days)
	{	
		
		System.out.println("Date: "+date);
		String[] d = date.split("/");
		int day = Integer.parseInt(d[0]);
		int month = Integer.parseInt(d[1]);
		int year = Integer.parseInt(d[2]);
		Calendar now = Calendar.getInstance();          
        now.set(year, month-1, day);
        Date dat= now.getTime();
        System.out.println("dat: "+dat);
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
  
		Calendar cal  = Calendar.getInstance();
		cal.setTime(dat);
		cal.add(Calendar.DATE, days);
		dat = cal.getTime();
		 System.out.println(format.format(dat));
	     return format.format(dat);
	}
	
	public String addDaysToSpecifiedDateMMDDYYYY(String date, int days) throws ParseException, java.text.ParseException
	{	
		
		System.out.println("Date: "+date);
		String[] d = date.split("/");
		int month = Integer.parseInt(d[0]);
		int day = Integer.parseInt(d[1]);
		int year = Integer.parseInt(d[2]);
		Calendar now = Calendar.getInstance();          
        now.set(year, month-1, day);
        Date dat= now.getTime();
        System.out.println("dat: "+dat);
		
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
  
		Calendar cal  = Calendar.getInstance();
		cal.setTime(dat);
		cal.add(Calendar.DATE, days);
		dat = cal.getTime();
		 System.out.println(format.format(dat));
	     return format.format(dat);
	}
	
	
	public String addDaysToCurrentDateDDMMYY(int days){
        Date now = new Date();
        Calendar c = Calendar.getInstance(); 
        c.setTime(now); 
        c.add(Calendar.DATE, days);
        now = c.getTime();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(now);
	}
	
	public String addOneDayToGivenDate(String date) throws ParseException{
		Date expdate=new SimpleDateFormat("dd/MM/yyyy").parse(date);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        // convert date to calendar
        Calendar c = Calendar.getInstance();
        c.setTime(expdate);
        // manipulate date
        c.add(Calendar.DATE, -1); 
        // convert calendar to date
        Date currentDatePlusOne = c.getTime();
        System.out.println(formatter.format(currentDatePlusOne));
        return formatter.format(currentDatePlusOne);
	}

	public static String getFirstDateCurrentMonth() {
		String date;
		Calendar c = Calendar.getInstance();
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		if(month<10){
		date="01/0"+month+"/"+year;
		}else{
			date="01/"+month+"/"+year;
		}
		return date;
	}
	
}
*/