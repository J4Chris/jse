package com.example.jse.m06.s15.ex;

public class Wizard extends Actor {

	private String name;
	private int skill;
	private boolean alive;

	public static final int STANDARD_SKILL = 0;

	public Wizard(String name) {
		this(name, STANDARD_SKILL);
	}

	public Wizard(String name, int skill) {
		super(name);
		this.skill = skill;
		this.alive = true;
	}

	public void sayName() {
		if (alive == true) {
			System.out.println("Hello, my name is " + name);
		}
	}

	public int getSkill() {
		return skill;
	}

	@Override
	public boolean fight(Actor enemy) {
		if (enemy instanceof Warrior) {
			enemy.setDead();
			return true;
		} else {
			if (((Wizard) enemy).getSkill() <= skill) {
				enemy.setDead();
				return true;
			} else {
				setDead();
				return false;
			}
		}
	}

}
