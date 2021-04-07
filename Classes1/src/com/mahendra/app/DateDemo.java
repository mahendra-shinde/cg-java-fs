package com.mahendra.app;

public class DateDemo {

	public static void main(String[] args) throws InterruptedException {
		MyDate.SEPERATOR = SEPERATOR_OPTIONS.SLASH;
		{
		MyDate d1 = new MyDate();
		MyDate d2 = new MyDate(45,3,2015);
		
		d1.print();
		d2.print();
		
		MyDate.SEPERATOR = SEPERATOR_OPTIONS.SIMPLE;
		d1.print();
		d2.print();
		
		d1 = null;
		d2 = null;
		}
		Thread.sleep(10000);
		System.out.println("Done ");
		
	}

}
