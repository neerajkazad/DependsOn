package com.don.beans;

import java.util.Properties;

public class LoanPlanner {
	private Cache cache;
	public double calculate(double principle, int tenure, String place) throws Exception {
		double rateOfInterest = 0;
		double interestAmount = 0;
		Properties props = null;
		if(cache.containsKey("place-ri") == false) {
			throw new Exception("place not supported");
		}
		props = (Properties)cache.get("place-ri");
		
		
		rateOfInterest = Double.parseDouble(props.getProperty(place));
		interestAmount = (principle * tenure * rateOfInterest)/100;
		return interestAmount;
	}
	public void setCache(Cache cache) {
		this.cache = cache;
	}
	
	
}
