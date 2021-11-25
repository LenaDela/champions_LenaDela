package champions;

public class Archer extends Champion {

//	private int doubleAttack;
	
	public Archer(String name) {
		// fait appel au constructeur du parent
		super(name);
//		this.setDoubleAttack(doubleAttack); 
	}

//	public int getDoubleAttack() { // not sure about these
////		return doubleAttack;
//	}

//	public void setDoubleAttack(int doubleAttack) { // not sure about these
//
////		this.doubleAttack = doubleAttack;
//	}
	
	public void attack(Champion target) {
		//make the loss of points random
		int damage = (int) (Math.random() * 10);
		System.out.println("The archer " + this.getName() + " inflicted a loss of " + damage + " health points");
		//you're giving damage to the target and the target is takingDamage(number of points)
		target.takeDamage(damage);
	}

	public int damageAfterProtection(int damage) {
		System.out.println("The archer " + this.getName() + " looses only half of the points when s/he's using her/his shield!");
		return damage / 2;
	}
	
}

// ******* TO DO *********
////l'archer peut attaquer deux fois de suite