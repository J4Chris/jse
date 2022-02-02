package com.example.jse.m02.s12.ex;

public class Exercise1 {
	public static void main(String[] args) {
		// TODO: print all values in [0 .. 9]

		int[] data = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// (1) for loop

		for (int i = 0; i < data.length - 1; i++) {
			System.out.print(data[i] + ", ");
		}
		System.out.print(data[data.length - 1]);
		System.out.println();

		// (2) while loop
		int i = 0;
		while (i < data.length - 1) {
			System.out.print(data[i] + ", ");
			i += 1;
		}
		System.out.print(data[data.length - 1]);
		System.out.println();

		// (3) do-while loop

		int j = 0;
		do {
			System.out.print(data[j] + ", ");
			j += 1;
		} while (j < data.length - 1);
		System.out.print(data[data.length - 1]);
		System.out.println();

	}
}
