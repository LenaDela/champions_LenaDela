package champions;

public class Wizard extends Champion {

	private int healingSpellValue;
	
	private int maxHealth;
	
	public Wizard(String name) {
		// fait appel au constructeur du parent
		super(name); 
		//this. is an instance of the class
		this.healingSpellValue = 5;
		this.maxHealth = this.getHealth();
	}
	
	public void heal() {
		int currentHealth = this.getHealth();
		if (currentHealth + this.healingSpellValue < maxHealth) {
			this.setHealth(currentHealth + this.healingSpellValue); 
		} else {
			this.setHealth(maxHealth);
		}
		System.out.println("The wizard " + this.getName() + " used his/her healing powers and recovered to " + this.getHealth() + " health points");
	}

	public void attack(Champion target) {
		//make the loss of points random
		int damage = (int) (Math.random() * 10); 
		System.out.println("The wizard " + this.getName() + " inflicted a loss of " + damage + " health points");
		//you're giving damage to the target and the target is takingDamage(number of points)
		target.takeDamage(damage); 
	}
	
	public int damageAfterProtection(int damage) {
		System.out.println("The wizard " + this.getName() + " looses only half of the points when s/he's using her/his shield!");
		return damage / 2;
	}

}
