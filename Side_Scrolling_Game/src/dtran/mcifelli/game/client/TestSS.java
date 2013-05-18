package dtran.mcifelli.game.client;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import dtran.mcifelli.game.objects.Game;




/**
 * Runnable GUI to test object classes in 
 * a graphical envrionment 
 * @author dtran2
 *
 */
public class TestSS {
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// Create the Game object that represents the game state
				Game game = new Game();
				
				// Create the KabomView that will visualize the game state
				TestView view = new TestView(game);

				// Create a frame (top-level window) to enclose the KaboomView
				JFrame frame = new JFrame();
				frame.setTitle("TESTING!");
				frame.setContentPane(view);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack();
				
				// Start the game!
				view.startGame();
				
				// Make the frame visible
				frame.setVisible(true);
			}
		});
	
	}
}
