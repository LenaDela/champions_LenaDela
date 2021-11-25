package champions;

public class Application {

	public static void main(String[] args) {
//		Knight tom = new Knight("Tom");
//		Knight lena = new Knight("Lena");
//		System.out.println(tom.getName());
//		System.out.println(lena.getName());
//		lena.attack(tom);
//		System.out.println(tom.getHealth());
//		lena.attack(tom);
//		System.out.println(tom.getHealth());
		
//		Wizard ben = new Wizard("Ben");
//		Wizard nora = new Wizard("Nora");
//		System.out.println(ben.getName());
//		System.out.println(nora.getName());
//		ben.attack(nora);
//		System.out.println(nora.getHealth());
//		nora.attack(ben);
//		nora.attack(ben);
//		nora.attack(ben);
//		nora.attack(ben);
//		System.out.println(ben.getHealth());
//		ben.heal();
//		System.out.println(ben.getHealth());
		
//		Archer lego = new Archer("Lego");
//		Archer suzy = new Archer("Suzy");
//		System.out.println(lego.getName());
//		System.out.println(suzy.getName());
//		suzy.attack(lego);
//		System.out.println(lego.getHealth());
//		suzy.attack(ben);
//		System.out.println(ben.getHealth());
		
		Knight tom = new Knight("Tom");
		Knight lena = new Knight("Lena");
		lena.protect();
		System.out.println(lena.getProtected());
		tom.attack(lena);
		tom.attack(lena);
		System.out.println(lena.getHealth());
		
//		Wizard tom = new Wizard("Tom");
//		Wizard lena = new Wizard("Lena");
//		lena.protect();
//		System.out.println(lena.getProtected());
//		tom.attack(lena);
//		tom.attack(lena);
//		System.out.println(lena.getHealth());
	}

}
