package dtran.mcifelli.game.map;

import dtran.mcifelli.game.objects.Position;
/**
 * Object for basic structure needed to build
 * a map
 * @author dtran2
 *
 */
public class Block {
	private Position position;
	int color = 0;
	public Block(Terrain terrain, Position pos){
		setColor(terrain);
		position = pos;
		
		
	}
	
	/**
	 * Depending on the terrain type, a color will be assigned to the block
	 * @param terrain
	 */
	private void setColor(Terrain terrain){
		switch (terrain){
			case water:
				color = 0;//blue
				break;
			case dirt:
				color = 1;//brown
				break;
			case grass:
				color = 2;//green
				break;
			case air:
				color = 3;//light blue
				break;
			case dark:
				color = 4; //black
				break;
			default:
				color = 10;//make pink for debugging purposing
				break;
		}
	
	}

}
