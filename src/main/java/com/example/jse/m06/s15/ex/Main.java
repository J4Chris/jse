package com.example.jse.m06.s15.ex;

/**
 * Create a hierarchy of classes based on Actor
 * <p>
 * Warrior: could fight, can't do any magic
 * <p>
 * Wizard: can't fight, could do magic
 * 
 * <p>
 * In the main
 * <p>
 * Create a bunch of actors
 * <p>
 * Let them fight against each others
 * <p>
 * Peer-to-peer fight, the most skilled one wins
 * <p>
 * Wizards always beat warriors
 * <p>
 * In the end, let the user knows who survived
 */
public class Main {
	public static void main(String[] args) {
		// create actors, both warriors and wizards
		Actor[] actors = { new Warrior("Yvonne", 7), new Warrior("Aries", 12), new Wizard("Konstance", 69),
				new Wizard("Kephra", 155) };

		for (Actor actor : actors) {
			System.out.println(actor);
		}

		System.out.println("Let's fight ...");
		for (int i = 0; i < actors.length; i++) {
			if (actors[i].isAlive() == true) {
				for (int j = i + 1; j < actors.length; j++) {
					System.out.println("Actor " + actors[i].getName() + " is fighting Actor " + actors[j].getName());
					if (actors[i].fight(actors[j]) == true) {
						System.out.println("Actor " + actors[i].getName() + " has won!");
					} else {
						System.out.println("Actor " + actors[i].getName() + " has lost!");
						break;
					}

				}
			}

		}

		for (int i = 0; i < actors.length; i++) {
			if (actors[i].isAlive() == true) {
				System.out.println("Actor " + actors[i].getName() + " has survived!");
			}
		}

	}
}
