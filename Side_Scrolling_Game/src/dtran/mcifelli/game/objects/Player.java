package dtran.mcifelli.game.objects;

import java.util.ArrayList;

//Unused; commented out for now
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Object class for player(s)
 * @author dtran2
 *
 */
public class Player {
	private Weapon weapon;		//Current equipped weapon
	private Utility utility;	//Current equipped utility
	private int health;			//Health of the player
	private int energy;			//amount of energy player contains
	private int speed;			//Speed the player can move at
	private int powerUp;		//value of power up gauge
	private Position pos;		//player's position
	private ArrayList<Weapon> weaponInventory;	//Player's current list of weapons they own
	private ArrayList<Utility> utilityInventory;//Player's current list of utilities they own
	
	//Initialize Player values
	public Player(int initX, int initY){
		this.pos = new Position(initX, initY);
		this.weaponInventory = new ArrayList<Weapon>();
		this.utilityInventory = new ArrayList<Utility>();
		this.weapon = Weapon.blade;
		this.weaponInventory.add(weapon);
		this.utility = Utility.solarPanel;
		this.health = 100;
		this.energy = 100;
		this.speed = 10;
		this.powerUp = 0;
		
	}
	
	/**
	 * Methods for fetching player values
	 */
	//Returns the position of the player
	public Position getPosition(){
		return this.pos;
	}
	//Returns equipped weapon
	public Weapon getWeapon(){
		return this.weapon;
	}
	//Returns equipped utility
	public Utility getUtility(){
		return this.utility;
	}
	//Returns current health;
	public int getHealth(){
		return this.health;
	}
	public int getEnergy(){
		return this.energy;
	}
	//Returns the movement speed of the player
	public int getSpeed(){
		return this.speed;
	}
	//Returns the value of power-up gauge
	public int getPowerUp(){
		return this.powerUp;
	}
	//Returns the player's Weapon Inventory
	public ArrayList<Weapon> getWeaponInventory(){
		return this.weaponInventory;
	}
	//Retrusn the player's Utility inventory
	public ArrayList<Utility> getUtilityInventory(){
		return this.utilityInventory;
	}
	/**
	 * Methods for changing player values
	 * position, weapon, utility, health, energy, speed, power up, and items in inventory
	 */
	
	//Change player position
	public void movePlayer(int newX, int newY){
		this.pos.move(newX, newY);
	}
	//Switch weapons (player must own the weapon)
	public void changeWeapon(Weapon newWep){
		if(weaponInventory.contains(newWep)){
			this.weapon = newWep;
		}
	}
	//Switch utilities (player must own the utility)
	public void changeUtility(Utility newUtil){
		if(utilityInventory.contains(newUtil)){
			this.utility = newUtil;
		}
	}
	//Update health
	public void changeHealth(int newHealth){
		this.health = newHealth;
	}
	//Update energy
	public void changeEnergy(int newEnergy){
		this.energy = newEnergy;
	}
	//Change the movement speed
	public void changeSpeed(int newSpeed){
		this.speed = newSpeed;
	}
	//Change value of power up gauge
	public void changePowerUp(int newPowerUp){
		this.powerUp = newPowerUp;
	}
	//Remove a weapon from the player's inventory
	public void removeWeapon(Weapon wep){
		this.weaponInventory.remove(wep);
	}
	//Remove a utility from the player's inventory
	public void removeUtility(Utility util){
		this.weaponInventory.remove(util);
	}
	//Add a weapon to the player's inventory
	public void addWeapon(Weapon wep){
		this.weaponInventory.add(wep);
	}
	//Add a utility to the player's inventory
	public void addUtility(Utility util){
		this.utilityInventory.add(util);
	}
}
