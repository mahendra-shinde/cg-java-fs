package com.mahendra;

import java.util.Date;

public class InstanceOfOperator {

	public static void main(String[] args) {
		// Built In Data Types (Predefined Data Types)
		// 1. Primitive Type ( NOT an OBJECT)
		// 2. Built In Object Types (String, Date ... )

		String str1 = "Mahendra";
		System.out.println(str1 instanceof String);

		Human mark = new Human();
		Dog tom = new Dog();
		System.out.println(mark instanceof Human);
		//System.out.println(tom instanceof Human);

	}

}

class Human {

}

class Dog {

}
