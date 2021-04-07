package com.mahendra.app;
//No import when using sibling class
public class Demo {

	public static void main(String[] args) {
		Greet gr = new Greet();
		// Classes who are MEMBER OF SAME PACKAGE
		// Can access default attributes/methods
		gr.message = "Hello World";
		
		// I DO NOT CARE HOW YOU IMPLEMENTED 
		InterestCalculator calc = // YOUR CLASS // new CompoundInterest();
		//I WANT THESE METHODS!!
		calc.setDuration(36);
		calc.setPrincipal(130000D);
		calc.setRateOfInterest(15.5F);
		
		double amt = calc.getInterest();
		System.out.println("Interest : "+amt);

	}

}
