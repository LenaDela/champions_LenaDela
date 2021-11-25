package champions;

//classe mère qui implémente méthodes/IChampion
public abstract class Champion implements IChampion {
	
	private String name;
	
	private int health;
	
	private boolean isProtected;
	
	private boolean isDead;
	
	//constructor
	public Champion(String name) {
		this.name = name;
		this.health = 50;
		this.isProtected = false;
		this.isDead = false;
	}
	
	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	
	public int getHealth() {
		return health;
	}
	
	// int health is like int x with this.health = x;
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void protect() {
		this.setProtected(true);
	}
	
//	getter
	public boolean getProtected() {
		return isProtected;
	}
//	setter
	public void setProtected(boolean isProtected) {
		this.isProtected = isProtected;
	}
	
	//getter
	public boolean getDead() {
		return isDead;
	}
	
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	public void takeDamage(int damage) {
		if(this.getDead()) {
			System.out.println("Stop attacking " + this.getName() + "they're dead! R.I.P");
			return;
		}
		// give currentHealth the initial health value (here, 50)
		int currentHealth = this.getHealth();
		if(this.getProtected()) {
			
			damage = this.damageAfterProtection(damage);
			this.setProtected(false);
		} 
		//au lieu de (this.getHealth()), on met (currentHealth - damage)
		// set the value of health to the currentHealth minus the number of points inflicted by the wound
		this.setHealth(currentHealth - damage);
		if(currentHealth <= 0) {
			this.setDead(true);
		}
	}
}


// ******** TO DO **********

// l'archer peut attaquer deux fois de suite

//	un champion meurt lorsque ses points de vie tombent à 0

// si on veut: champions peuvent avoir d'autres comportements + d'autres champions peuvent être joués
