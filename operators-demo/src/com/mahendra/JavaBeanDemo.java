package com.mahendra;

public class JavaBeanDemo {

	public static void main(String[] args) {
		
		// LS: Declaring a new Reference Variable "p1" for class "Person"
		// RS: Creating a new object of type 'Person' and assign it's reference to "p1"
		Person p1 = new Person();
		// Copying the REFERENCE from p1 to p2
		// Now, both p1 and p2 are REFERING SAME Object!
		Person p2 = p1;
		p1.setName("mahendra", "shinde");
		p1.setAge(37);
		p1.setAge(-100);
		p1.print();
		p2.setName("divyashree", "Shinde");
		p1.setAge(1);
		p1.print();
	}
}
//User defined `types`, they are COMPLEX types
// A Class may contain attributes/properties of either PRIMITIVE or REFERENCE types

class Person {
	// Not Visible from outside the class
	private String fn, ln;
	//attribute which is PRIMITIVE (int)
	private int age;

	public void setName(String fn, String ln) {
		this.fn = fn;
		this.ln = ln;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
		else
			System.out.println("Cannot be negetive or zero");
	}

	public void print() {
		System.out.println("Name: " + this.fn + " " + this.ln);
		System.out.println("Age: " + this.age);
	}
}
