package AdapterDragons;
public class DemoAdapter {
	
	public static void main(String[] args) {
				
		Lizard komodo = new KomodoDragon();
		komodo.bite(100);
		komodo.restByTheSun();
		komodo.run();
		komodo.tailAttack();
								
		DragonTarget dragon = new BattleDragon();					
		dragon.about();
		dragon.draconicBite();
		dragon.spitFire();
		dragon.tailSweep();
		dragon.fly();
		dragon.run();
		
		System.out.println("\nWe're out of dragons so "
				+ "we adapt a lizard for draconic uses");
		
		DragonTarget fakeDragon = new DragonLizardAdapter(komodo);
		fakeDragon.about();
		fakeDragon.draconicBite();		
		fakeDragon.spitFire();
		fakeDragon.tailSweep();
		fakeDragon.fly();
		fakeDragon.run();

		
	}
}
