package dtran.mcifelli.game.objects;

/*
 * Notes:
 * 
 * --Stock switch case--
 * switch (this) {
			case grapplingHook:
				break;
			case freezeRay:
				break;
			case rocketBoosters:
				break;
			case telekinesisGun:
				break;
			case solarPanel:
				break;
			case gravityMod:
				break;
			default:
				break;
		}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public enum Utilities {
	grapplingHook, 
	freezeRay, 
	rocketBoosters,
	telekinesisGun, 
	solarPanel,
	gravityMod;
	
	// CONSTANTS
	private final int STOCK_RANGE = 4;
	private final int STOCK_FIRE_RATE = 20;
	
	// returns the range of the utility
	public int getRange() {
		switch (this) {
			case grapplingHook:
				return STOCK_RANGE;
			case freezeRay:
				return STOCK_RANGE;
			case rocketBoosters:
				return STOCK_RANGE;
			case telekinesisGun:
				return STOCK_RANGE;
			case solarPanel:
				return STOCK_RANGE;
			case gravityMod:
				return STOCK_RANGE;
			default:
				return 0;
		}
		
	}
	
	// returns the fire rate of the utility
	public int getFireRate() {
		switch (this) {
			case grapplingHook:
				return STOCK_FIRE_RATE;
			case freezeRay:
				return STOCK_FIRE_RATE;
			case rocketBoosters:
				return STOCK_FIRE_RATE;
			case telekinesisGun:
				return STOCK_FIRE_RATE;
			case solarPanel:
				return STOCK_FIRE_RATE;
			case gravityMod:
				return STOCK_FIRE_RATE;
			default:
				return 0;
		}
		
	}
}
