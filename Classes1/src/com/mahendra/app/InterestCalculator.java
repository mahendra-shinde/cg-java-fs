package com.mahendra.app;


// A Contract for creating interest calculator
public interface InterestCalculator {

	void setPrincipal(double amt);
	void setRateOfInterest(float rate);
	void setDuration(int months);
	
	double getInterest();
	
}
