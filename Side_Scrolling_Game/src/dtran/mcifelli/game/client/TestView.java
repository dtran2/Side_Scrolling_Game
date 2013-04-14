package dtran.mcifelli.game.client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

import dtran.mcifelli.game.objects.Game;
import dtran.mcifelli.game.map.*;

/**
 * Class for testing objects in a graphic
 * environment
 * @author dtran2
 *
 */
public class TestView extends JPanel{
	private static final Color DEFAULT = Color.PINK;
	private static final Font font = new Font("Dialog", Font.BOLD, 48);
	Game game;
	public TestView(Game game){
		this.game = game;
		setBackground(DEFAULT);
		setPreferredSize(new Dimension((int) game.getWidth(), (int) game.getHeight()));
	}

	
	/**
	 * Start the game.
	 */
	public void startGame() {
		// Create the animation timer.
		// It will fire an event about 60 times per second.
		// Every time a timer event fires the handleTimerEvent method
		// will be called.
		Timer timer = new Timer(1000 / 60, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleTimerEvent();
			}
		});
		timer.start();
		// Add a listener for mouse motion.
		// Each time the mouse is moved, the handleMouseMove method
		// will be called.
		addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				handleMouseMove(e);
			}
		});
	}

	protected void handleTimerEvent() {
		// You should not need to change this method.
		//game.timerTick();
		repaint();
	}

	public void handleMouseMove(MouseEvent e) {
		// TODO: handle mouse movement
		
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g); // paint the background		
		
		//draws the score board		
		g.setFont(font);
		g.setColor(Color.GRAY);
		g.drawString("TEST", WIDTH - 100, 10);
		/*
		if(game.gameOver == true){
			g.setFont(font);
			g.setColor(Color.RED);
			g.drawString("INSERT STRING HERE", 240, 20);
		}*/
		for(int column = 0; column < game.getWidth(); column++){
			for(int row = 0; row < game.getHeight(); row++){
				g.setColor(game.getTerrainBlock(row, column).getColor());
				g.fillRect(row, column, 10, 10);
				g.setColor(Color.BLACK);
			}
		}
		
	}

}
	
