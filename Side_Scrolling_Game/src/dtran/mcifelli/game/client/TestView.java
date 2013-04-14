package dtran.mcifelli.game.client;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import dtran.mcifelli.game.objects.Game;

/**
 * Class for testing objects in a graphic
 * environment
 * @author dtran2
 *
 */
public class TestView extends JPanel{
	private static final Color DEFAULT = Color.PINK;
	Game game;
	public TestView(Game game){
		this.game = game;
		setBackground(DEFAULT);
		setPreferredSize(new Dimension((int) game.WIDTH, (int) game.HEIGHT));
	}
	

}
