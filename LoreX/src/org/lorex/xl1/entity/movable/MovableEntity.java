package org.lorex.xl1.entity.movable;

import org.lorex.xl1.entity.GameEntity;

public abstract class MovableEntity extends GameEntity {
	
	public static final int DEFAULT_HEALTH = 20;
	public static final int DEFAULT_MAX_HEALTH = 20;
	public static final float DEFAULT_SPEED = 3.0f;
	
	protected int health;
	protected int maxHealth;
	protected float defaultSpeed;
	protected float speed;
	protected float xMove, yMove;
	
	public MovableEntity(float x, float y, int width, int height) {
		
		super(x, y, width, height);
		
		health = DEFAULT_HEALTH;
		speed = DEFAULT_SPEED;
		
		defaultSpeed = DEFAULT_SPEED;
		maxHealth = DEFAULT_MAX_HEALTH;
		
		xMove = 0;
		yMove = 0;
		
	}
	
	public MovableEntity(float x, float y, int width, int height, int maxHealth, float defaultSpeed) {
		
		super(x, y, width, height);
		
		this.maxHealth = maxHealth;
		this.health = maxHealth;
		this.defaultSpeed = defaultSpeed;
		this.speed = defaultSpeed;
		
		xMove = 0;
		yMove = 0;
		
	}
	
	public void move() {
		
		x += xMove;
		y += yMove;
		
	}
	
	public float getXMove() {
		
		return xMove;
		
	}
	
	public void setXMove(float xMove) {
		
		this.xMove = xMove;
		
	}
	
	public float getYMove() {
		
		return yMove;
		
	}
	
	public void setYMove(float yMove) {
		
		this.yMove = yMove;
		
	}
	
	public int getHealth() {
		
		return health;
		
	}
	
	public void setHealth(int health) {
		
		if(health > maxHealth)
			return;
		
		this.health = health;
		
	}
	
	public void overrideMaxHealth(int health) {
		
		/**
		 * PLEASE DO NOT USE THIS, UNLESS POTION OR MAGIC EFFECTS APPLY
		 */
		
		this.health = health;
		
	}
	
	public float getSpeed() {
		
		return speed;
		
	}
	
	public void setSpeed(float speed) {
		
		if(speed > defaultSpeed)
			return;
		
		this.speed = speed;
		
	}
	
	public void overrideMaxSpeed(float speed) {
		
		/**
		 * PLEASE DO NOT USE THIS, UNLESS POTION OR MAGIC EFFECTS APPLY
		 */
		
		this.speed = speed;
		
	}
	
}
