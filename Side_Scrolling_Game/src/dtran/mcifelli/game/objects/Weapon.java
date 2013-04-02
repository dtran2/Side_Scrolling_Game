package dtran.mcifelli.game.objects;

public class Weapon extends Item{
	private Weapons type;
	private int range;
	private int fireRate;
	private int damage;
	
	public Weapon(Weapons type) {
		this.type = type;
		range = type.getRange();
		fireRate = type.getFireRate();
		damage = type.getDamage();
	}
	public Weapons getWeapons(){
		return this.type;
	}
	public int getRange(){
		return this.range;
	}
	public int getFireRate(){
		return this.fireRate;
	}
}
