package com.td.Entity;

public class Mob extends Entity {
	private int health;
	private int health_per_level;
	private int level;
	private int speed;
	private int speed_per_level;
	private int cost;
	private int cost_per_level;
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return this.health;
	}

	public void setHealthPerLevel(int health) {
		this.health_per_level = health;
	}
	
	public int getHealthPerLevel() {
		return this.health_per_level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeedPerLevel (int speed) {
		this.speed_per_level = speed;
	}
	
	public int getSpeedPerLevel() {
		return this.speed_per_level;
	}
	
	private void setCost(int cost) {
		this.cost = cost;
	}
	
	private int getCost() {
		return this.cost;
	}
	
	private void setCostPerLevel(int cost) {
		this.cost_per_level = cost;
	}
	
	private int getCostPerLevel() {
		return this.cost_per_level;
	}
}
