package com.example.jse.m06.s11.ex;

import java.util.logging.Logger;

// it should steer left/right, it should brake
public class Vehicle {
	private static final Logger log = Logger.getGlobal();

	public void steer(boolean right) {
		if (right == true) {
			 System.out.println("The vehicle has steered right");
		} else {
			 System.out.println("The vehicle has steered left");
		}

	}
	
	public void brake() {
		System.out.println("The veihcle has stopped");
	}

	public Vehicle() {
		log.info("Vehicle created");
	}
}
