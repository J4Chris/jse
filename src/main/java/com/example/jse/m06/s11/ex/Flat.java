package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

// TODO: is-a Conditioning
public class Flat implements Conditioning {
    private static final Logger log = Logger.getGlobal();
    
    private int temperature;
    
    public void setTemperature(int temperature) {
		// Auto-generated method stub
		this.temperature = temperature;
		System.out.println("the temperature of the Flat is set to " + this.temperature + " degrees");
	}
    
    public Flat() {
        log.info("Flat created");
    }
}
