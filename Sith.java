package Korriban;

import java.util.Random;

public class Sith {
	
	static int health = 80;
	static int currentHealth = (Math.max(health - DarkJedi.getAttack(), 0));
	static int attack;
	Random ran = new Random();
	
	public static int attack() {
		return getAttack();
	}

	public static int getAttack() {
		Random rand = new Random();
		attack = rand.nextInt(10) + 1;
		return attack;
	}
	
	public void setAttack(int attack) {
		Sith.attack = attack;
		
	}
	
	public static int currentHealth() {
		return getCurrentHealth();
	}
	
	public static int getCurrentHealth() {
		currentHealth = (Math.max(health - DarkJedi.attack, 0));
		if (currentHealth >= currentHealth) {
			currentHealth = (Math.max(currentHealth - DarkJedi.attack, 0));
			return currentHealth;
		} else {
		return currentHealth;
		}
	}
	
	public void setCurrentHealth(int health) {
		Sith.currentHealth = health;
	}
}