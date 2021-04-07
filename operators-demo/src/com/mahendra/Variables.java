package com.mahendra;

public class Variables {
	//Static Variable / Class Variable
	static int MAX = 1000;
	
 public static void main(String[] args) {
	int x = 100;
	System.out.println("Value of x "+ x);
	//Anonymous block
	{
		int y = 50;
		System.out.println("Value of y "+ y);
	} // variable "y" ejected from STACK 
	//Anonymous block
	{
		int y = 30;
		System.out.println("Value of y "+ y);
	}
	System.out.println("Value of Max "+ Variables.MAX);
	//Should be avoided
	//1. JRE would check if LOCAL variable named 'MAX' exists
	//2. JRE would check if INSTANCE variable named 'MAX' exists
	//3. JRE would check if STATIC variable named 'MAX' exists
	System.out.println("Value of Max "+ MAX);

}
}
