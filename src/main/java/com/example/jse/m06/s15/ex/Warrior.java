package com.example.jse.m06.s15.ex;

public class Warrior extends Actor {

	private String name;
	private int skill;
	private boolean alive;

	public static final int STANDARD_SKILL = 0;

	public Warrior(String name) {
		this(name, STANDARD_SKILL);
	}

	public Warrior(String name, int skill) {
		super(name);
		this.skill = skill;
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
		if (enemy instanceof Wizard) {
			setDead();
			return false;
		} else {
			if (((Warrior) enemy).getSkill() <= skill) {
				enemy.setDead();
				return true;
			} else {
				setDead();
				return false;
			}
		}
	}

}
