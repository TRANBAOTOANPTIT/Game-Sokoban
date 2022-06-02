
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author tbt-nnt
 */
public class Wall {
    private int x;
    private int y;
    private Image image;
    
    /**
     * Constructor for wall 
     * @precondition x and y are positive numbers
     */
    public Wall(int x, int y) {
        ImageIcon ii = new ImageIcon("./resources/wall.png");
        image = ii.getImage();
        this.x = x;
        this.y = y;
    }
    
    /**
     * returns Wall image
     */
    public Image getImg() {
        return image;
    }
    /**
     * getter for X coordinate
     */
    public int getX() {
        return x;
    }
    
    /**
     * returns Y coordinate of wall
     */
    public int getY() {
        return y;
    }
}
