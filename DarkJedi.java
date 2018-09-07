package Korriban;

import java.util.Random;

public class DarkJedi {
  
  static int health = 80;
  static int currentHealth = (Math.max(health - Sith.getAttack(), 0));
  static int attack;
  Random rand = new Random();

  public static int attack() {
  	return getAttack();
  }
  
  public static int getAttack() {
    Random rand = new Random();
    attack = rand.nextInt(6) + 1;
    return attack;
  }
  
  public void setAttack(int attack) {
  	DarkJedi.attack = attack;
  }
  

	public static int currentHealth() {
		return getCurrentHealth();
	}
	
	public static int getCurrentHealth() {
		currentHealth = (Math.max(health - Sith.attack, 0));
		return currentHealth;
	}
	
	public void setCurrentHealth(int health) {
		DarkJedi.currentHealth = health;
	}
}