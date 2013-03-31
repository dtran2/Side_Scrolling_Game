package dtran.mcifelli.game.objects;

public class Weapon extends Item{
	private Weapons type;
	private int range;
	private int fireRate;
	
	
	public Weapon(Weapons type) {
		this.type = type;
		range = type.getRange();
		fireRate = type.getFireRate();
	}
}
