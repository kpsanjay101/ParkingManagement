package com.knorex.model;

import java.util.HashMap;
import java.util.Map;

public class CostStrategy {
	
	private Map<String, Double> hourlyRates;

    public CostStrategy() {
        this.hourlyRates = new HashMap<>();
        // Flat cost structure
        hourlyRates.put("Bike", 10.0);
        hourlyRates.put("Car", 20.0);
        hourlyRates.put("Bus", 30.0);
        // Add more vehicle types as needed
    }
    

    public void setHourlyRates(Map<String, Double> hourlyRates) {
		this.hourlyRates = hourlyRates;
	}


	public double getHourlyRate(String vehicleType) {
        return hourlyRates.getOrDefault(vehicleType, 0.0);
    }


	@Override
	public String toString() {
		return "CostStrategy [hourlyRates=" + hourlyRates + "]";
	}
	
	

}
