package dtran.mcifelli.game.objects;

public class Utility extends Item{
	private Utilities type;
	private int range;
	private int fireRate;
	
	
	public Utility(Utilities type) {
		this.type = type;
		range = type.getRange();
		fireRate = type.getFireRate();
	}
}
