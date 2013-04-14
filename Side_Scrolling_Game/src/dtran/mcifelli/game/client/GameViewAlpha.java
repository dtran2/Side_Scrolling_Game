package dtran.mcifelli.game.client;

import dtran.mcifelli.game.map.Terrain;
import dtran.mcifelli.game.objects.Game;

public class GameViewAlpha {
	private static Game model;
	
	public static void main(String[] args) {
		model = new Game();
		buildMap();
		displayMap();
	}
	
	private static void displayMap() {
		for (int row = 0; row < model.getHeight(); row ++) {
			for (int col = 0; col < model.getWidth(); col++) {
				System.out.print(model.getMap()[row][col].toString());
			}
			System.out.print("\n");
		}
	}

	private static void buildMap() {
		for (int row = 0; row < model.getHeight(); row ++) {
			for (int col = 0; col < model.getWidth(); col++) {
				model.setTerrainAtLocation(row, col, Terrain.grass);
			}
		}
		model.setTerrainAtLocation(0, 0, Terrain.air);
	}
}
