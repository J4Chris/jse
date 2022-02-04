package com.example.jse.m06.s15.ex;

public abstract class Actor {

	private String name;
	private boolean alive;

	protected Actor(String name) {
		this.name = name;
		this.alive = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setDead() {
		this.alive = false;
	}
	
	public boolean isAlive() {
		return alive;
	}

	public abstract boolean fight(Actor enemy);

	@Override
	public String toString() {
		return "Actor [name=" + name + "]";
	}
}
