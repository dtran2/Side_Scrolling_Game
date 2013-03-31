package dtran.mcifelli.game.objects;

public enum Weapons {
	lazer,
	megaPunch,
	scatterGun,
	lightningGun,
	magnentBombs,
	emp,
	blade;
	
	// CONSTANTS
	private final int STOCK_DAMAGE = 5;
	private final int STOCK_FIRE_RATE = 10;
	private final int STOCK_RANGE = 10;
	
	public int getDamage() {
		switch (this) {
			case lazer:
				return STOCK_DAMAGE;
			case megaPunch:
				return STOCK_DAMAGE; 
			case scatterGun:
				return STOCK_DAMAGE;
			case lightningGun:
				return STOCK_DAMAGE;
			case magnentBombs:
				return STOCK_DAMAGE;
			case emp:
				return STOCK_DAMAGE;
			case blade:
				return STOCK_DAMAGE;
			default:
				return 0;
		}
	}
		
	public int getRange() {
		switch (this) {
			case lazer:
				return STOCK_RANGE;
			case megaPunch:
				return STOCK_RANGE;
			case scatterGun:
				return STOCK_RANGE;
			case lightningGun:
				return STOCK_RANGE;
			case magnentBombs:
				return STOCK_RANGE;
			case emp:
				return STOCK_RANGE;
			case blade:
				return STOCK_RANGE;
			default:
				return 0;
			}
	}
	
	public int getFireRate() {
		switch (this) {
			case lazer:
				return STOCK_FIRE_RATE;
			case megaPunch:
				return STOCK_FIRE_RATE; 
			case scatterGun:
				return STOCK_FIRE_RATE;
			case lightningGun:
				return STOCK_FIRE_RATE;
			case magnentBombs:
				return STOCK_FIRE_RATE;
			case emp:
				return STOCK_FIRE_RATE;
			case blade:
				return STOCK_FIRE_RATE;
			default:
				return 0;
		}
	}
}
