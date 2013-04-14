package dtran.mcifelli.game.objects;

import dtran.mcifelli.game.map.Terrain;

public class Game {
	// FINALS
	private final int HEIGHT = 50;
	private final int WIDTH = 50;
	
	// FIELDS
	private Terrain[][] map = new Terrain[HEIGHT][WIDTH];
	
	// CONSTRUCTOR
	public Game() {
		setInitialMapValues();
	}

	// METHODS
	public boolean setTerrainAtLocation(int row, int col, Terrain terrain) {
		if ((0 <= row && row < HEIGHT) && (0 <= col && col < WIDTH)) {
			map[row][col] = terrain;
			return true;
		}
		return false;
	}
	
	private void setInitialMapValues() {
		// this method will generate an initial map for the game
		// right now this function will generate a stock level, but ultimately should be defined values in a level file
		for (int row = 0; row < getHeight(); row ++) {
			for (int col = 0; col < getWidth(); col++) {
				setTerrainAtLocation(row, col, Terrain.air);
			}
		}
		
	}
	
	
	
	// GETTERS & SETTERS
	public Terrain[][] getMap() {
		return map;
	}
	public void setMap(Terrain[][] map) {
		this.map = map;
	}
	public int getHeight() {
		return HEIGHT;
	}
	public int getWidth() {
		return 	WIDTH;
	}
}
