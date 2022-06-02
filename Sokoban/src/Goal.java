

import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author tbt-nnt
 */
public class Goal {
    private int x;
    private int y;
    private Image image;
    
    /**
     * Constructor for Goal
     * @param x
     * @param y
     */
    public Goal(int x, int y) {
        ImageIcon ii = new ImageIcon("./resources/goal.png");
        image = ii.getImage();
        this.x = x;
        this.y = y;
    }
    
    /**
     * returns png image
     * @return
     */
    public Image getImg() {
        return image;
    }
    
    /**
     * returns x coordinate
     * @return
     */
    public int getX() {
        return x;
    }
    
    /**
     * returns y coordinate
     * @return
     */
    public int getY() {
        return y;
    }
    
    /**
     * returns goal coordinates as string
     */
    @Override
    public String toString() {
        return "Goal{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
