package com.mahendra.app;

public class CompoundInterest implements InterestCalculator {

	private double prn;
	private float rt;
	private int dr;
	
	@Override
	public void setPrincipal(double amt) {
		this.prn = amt;
	}

	@Override
	public void setRateOfInterest(float rate) {
		this.rt = rate;
	}

	@Override
	public void setDuration(int months) {
		this.dr = months;
	}
	
	@Override
	public double getInterest() {
		double interest = prn * Math.pow((1+rt/100/12),dr); 
		return interest - prn;
	}

}
