package com.example.jse.m06.s11.ex;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// (1) put objects of (at least) three different types in this array
		Vehicle[] vehicles = { new MotorBike(), new Car(), new Bus() };
		System.out.println(Arrays.toString(vehicles));

		// (2) let all vehicle steer in alternate directions

		boolean right = true;

		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].steer(right);
			right = !right;
		}

		// (3) put objects of (at least) three different types in this array
		Conditioning[] conditioned = { new Flat(), new Car(), new Bus() };
		System.out.println(Arrays.toString(conditioned));

		// (4) set the temperature of each conditioned to 20

		for (int i = 0; i < conditioned.length; i++) {
			conditioned[i].setTemperature(20);
		}

	}
}
