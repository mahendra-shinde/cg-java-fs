package com.mahendra.app;

public class SimpleInterest implements InterestCalculator {

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
		
		return prn * (rt/100/12) * dr;
	}

}
