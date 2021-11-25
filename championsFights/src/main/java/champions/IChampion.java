package champions;

public interface IChampion {

		void attack(Champion target);
		
		void takeDamage(int damage);
		
		void protect(); 
		
		int damageAfterProtection(int damage);
		
}
