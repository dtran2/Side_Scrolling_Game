package dtran.mcifelli.game.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dtran.mcifelli.game.objects.Player;
import dtran.mcifelli.game.objects.Utility;
import dtran.mcifelli.game.objects.Weapons;
/**
 * JUnit Class for Player object class
 * Tests object's methods
 * @author dtran2
 *
 */
public class TestPlayer {
	Player player;
	@Before
	public void setUp(){
		player = new Player(12, 76);
	}

	@Test
	public void testGetPosition() {
		assertEquals(player.getPosition().getX(), 12);
		assertEquals(player.getPosition().getY(), 76);
	}
	@Test
	public void testGetWeapon(){
		assertSame(player.getWeapon(), Weapons.blade);
	}
	@Test
	public void testGetUtility(){
		assertSame(player.getUtility(), Utility.solarPanel);
	}
	@Test
	public void testGetHealth(){
		assertEquals(player.getHealth(), 100);
	}
	@Test
	public void testGetEnergy(){
		assertEquals(player.getEnergy(), 100);
	}
	@Test
	public void testGetSpeed(){
		assertEquals(player.getSpeed(), 10);
	}
	@Test
	public void testGetPowerUp(){
		assertEquals(player.getPowerUp(), 0);
	}
	@Test
	public void testMove(){
		player.movePlayer(5, 8);
		assertEquals(player.getPosition().getX(), 5);
		assertEquals(player.getPosition().getY(), 8);
	}
	@Test
	public void testChangeWeapon(){
		player.changeWeapon(Weapons.megaPunch);
		assertSame(player.getWeapon(), Weapons.megaPunch);
	}
	@Test
	public void testChangeUtility(){
		player.changeUtility(Utility.grapplingHook);
		assertSame(player.getWeapon(), Utility.grapplingHook);
	}
	@Test
	public void testChangeHealth(){
		player.changeHealth(56);
		assertEquals(player.getHealth(), 56);
		player.changeHealth(player.getHealth() - 6);
		assertEquals(player.getHealth(), 50);
		player.changeHealth(player.getHealth() + 50);
		assertEquals(player.getHealth(), 100);
	}
	@Test
	public void testChangeEnergy(){
		player.changeEnergy(26);
		assertEquals(player.getEnergy(), 26);
	}
	@Test
	public void testChangePowerUp(){
		player.changePowerUp(20);
		assertEquals(player.getPowerUp(), 20);
		player.changePowerUp(player.getPowerUp() + 36);
		assertEquals(player.getPowerUp(), 56);
		player.changePowerUp(player.getPowerUp() - 24);
		assertEquals(player.getPowerUp(), 32);
	}
	
	//TODO: Add test case for getting weaponInventory
	//TODO: Add test case for getting utilityInventory
	//TODO:Add test case for adding/removing weapons from the weaponInventory
	//TODO: Add test case for adding/removing utilities from the utilityInventory
}
