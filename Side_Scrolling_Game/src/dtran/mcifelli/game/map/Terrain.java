package dtran.mcifelli.game.map;

import java.awt.Color;

public enum Terrain {
	water, 
	dirt,
	grass,
	air,
	dark;


	public Color getColor() {
		switch (this) {
		case water:
			return Color.BLUE;//blue
		case dirt:
			return Color.DARK_GRAY;//brown
		case grass:
			return Color.GREEN;//green
		case air:
			return Color.CYAN;//light blue
		case dark:
			return Color.BLACK; //black
		default:
			return Color.PINK;//make pink for debugging purposing
		}
	}
	public String toString() {
		switch (this) {
			case water:
			return "W";
			case dirt:
			return "D";
			case grass:
			return "G";
			case air:
			return " ";
			case dark:
			return "/";
			default:
			return "";
		}
	}
	double getOpacity() {
		switch (this) {
			case water:
			return 0.5; // halve all light
			case dirt:
			return 0; // block all light
			case grass:
			return 0;	// block all light
			case air:
			return 1; // allow all light
			case dark:
			return 4; // block all light
			default:
			return 1;	// allow all light
		}
	}


}
