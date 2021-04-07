package com.mahendra.app;

public class MyDate {
	private int day, month, year;
	public static SEPERATOR_OPTIONS SEPERATOR = SEPERATOR_OPTIONS.SIMPLE;
	
	public MyDate() {
		this.day = 1;
		this.month = 1;
		this.year = 2000;
	}
	
	public MyDate(int day, int month, int year) {
		this(); // call the no-arg constructor
		int maxDays=30;
		if(year >=2000 && year <=2100 ) {
			this.year = year;
		}
		if(month >= 1 && month <= 12) {
			this.month = month;
			switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				maxDays=31;
				break;
			case 2:
				if(year%100==0 && year%400 == 0) {
					maxDays=29;
				}else if(year%4==0) {
					maxDays=29;
				}else maxDays=28;
			}
		}
		
		if(day >= 1 && day <=31) {
			this.day = day;
		}
	}
	
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("About to be erased !");
	}
	public void print() {
		System.out.println(day+ MyDate.SEPERATOR.toString() + month+ MyDate.SEPERATOR.toString() +year);
	}
}
