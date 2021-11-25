package champions;

public class Knight extends Champion {

	public Knight(String name) {
		// fait appel au constructeur du parent
		super(name);
	}

	public void attack(Champion target) {
		if(this.getDead()) {
			System.out.println("The champion " + this.getName() + " is dead");
			return;
		}
		//make the loss of points random
		int damage = (int) (Math.random() * 10);
		System.out.println("The knight " + this.getName() + " inflicted a loss of " + damage + " health points");
		//you're giving damage to the target and the target is takingDamage(number of points)
		target.takeDamage(damage);
	}
	
	
	public int damageAfterProtection(int damage) {
		System.out.println("The knight " + this.getName() + " doesn't loose any points when s/he's using his shield!");
		return 0;
	}
	
}
