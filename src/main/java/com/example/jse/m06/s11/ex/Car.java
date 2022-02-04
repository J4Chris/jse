package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

// is-a Vehicle and Conditioning
public class Car extends Vehicle implements Conditioning {
    
	private int temperature;
	
	@Override
	public void setTemperature(int temperature) {
		// Auto-generated method stub
		this.temperature = temperature;
		System.out.println("the temperature of the Car is set to " + this.temperature + " degrees");
	}

	private static final Logger log = Logger.getGlobal();

    public Car() {
        log.info("Car created");
    }
}
