package com.mahendra;

public abstract class PrePost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		// Increment value of n by 1 
		// and then store value of n into k
		int k = n++;
		System.out.println("k "+k);
		// Increment value of n by 1 and update 'n'
		// Copy updated value of n into 'm'
		int m = ++n;
		System.out.println("m "+m);
		System.out.println("n++ : "+ n++);
		System.out.println("n :"+n);
		System.out.println("++n : "+ ++n);
		System.out.println("n :"+n);
	}

}
