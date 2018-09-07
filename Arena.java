package Korriban;


public class Arena {

  public static void main(String[] args) {
    
    System.out.println("Dark Jedi Health : " + DarkJedi.health);
    System.out.println("\nSith Health : " + Sith.health);
    System.out.println("\nDark Jedi Attacks : " + DarkJedi.attack);
    System.out.println("\nSith Attack : " + Sith.attack);
    
    System.out.println("\nDark Jedi Current Health : " + DarkJedi.currentHealth + "\n" +"Dark Jedi Attacks : " + DarkJedi.attack);
    System.out.println("\nSith Current Health : " + Sith.currentHealth + "\n" + "Sith Attack : " + Sith.attack + "\n" );
   
    System.out.println("Dark Jedi Current Health : " + DarkJedi.currentHealth);
    System.out.println("Sith Current Health : " + Sith.currentHealth);
  }
}