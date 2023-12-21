
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Game extends JFrame {

    public Game() {
    }
    
    private static Game game_game;
    private static Image buster;
    private static Image snickers1;
    
    public static void main(String[] args) throws IOException {
        buster = ImageIO.read(Game.class.getResourceAsStream("buster.png"));
        snickers1 = ImageIO.read(Game.class.getResourceAsStream("snickers1.jpd"));
        
    }
    private static void onRepaint (Graphics.g){
        g.drawImage(snickers1, 100, 100, null);
        g.drawImage(buster, 300, 300, null);
        
}
    private static void onRepaint(Graphics g){
        //g.drawImage(snickers1, 100, 100, null;
        g.drawImage(buster, 300, 300, null);
        
    }

    /**
     *
     */
    public class Game extends JFrame {
        
        private static Game game_game;
        
    }