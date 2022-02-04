package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

// TODO: is-a Vehicle and Conditioning
public class Bus extends Vehicle implements Conditioning {
	private static final Logger log = Logger.getGlobal();

	private int temperature;

	@Override
	public void setTemperature(int temperature) {
		// Auto-generated method stub
		this.temperature = temperature;
		System.out.println("the temperature of the Bus is set to " + this.temperature + " degrees");
	}

	public Bus() {
		log.info("Bus created");
	}
}
