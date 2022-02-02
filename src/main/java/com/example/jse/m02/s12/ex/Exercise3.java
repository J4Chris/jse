package com.example.jse.m02.s12.ex;

public class Exercise3 {
	public static void main(String[] args) {
		/*
		 * TODO: Print
		 * 
		 * (1) the number of arguments passed to this main
		 * 
		 * 
		 * 
		 * (2) each argument
		 */

		if (args.length == 0) {
			System.out.println("No argument passed");
			return;
		}

		System.out.print("The number of arguments passed is: ");
		System.out.println(args.length);

		for (int i = 0; i < args.length - 1; i++) {
			System.out.print(args[i] + ", ");
		}
		System.out.println(args[args.length - 1]);

	}
}
