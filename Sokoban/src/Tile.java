
import javax.swing.ImageIcon;
import java.awt.Image;


/**
 *
 * @author tbt-nnt
 */
public class Tile {
    private int x;
    private int y;
    private Image image;
    
    /**
    *
    *Constructor for Tile
    *@precondition x and y are positive real integers
    */
    public Tile(int x, int y) {
        ImageIcon ii = new ImageIcon("./resources/tile.png");
        image = ii.getImage();
        this.x = x;
        this.y = y;
    }
    
    /*
    *
    *
    *returns Image 
    */
    public Image getImg() {
        return image;
    }
    
    /**
     * getter for X coordinate
     * returns X
     */
    public int getX() {
        return x;
    }
    /**
     * getter for Y
     * returns Y coordinate
     */
    public int getY() {
        return y;
    }
    
}
