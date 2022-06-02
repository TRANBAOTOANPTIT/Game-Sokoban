
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author tbt-nnt
 */
public class onGoal {
    private final  int x;
    private final  int y;
    private final  Image image;
    
    /**
     * Constructor for OnGoal
     * @param x
     * @param y
     * @precondition x and y are real positive integers
     */
    public onGoal(int x, int y) {
        ImageIcon ii = new ImageIcon("./resources/onGoal.png");
        image = ii.getImage();
        this.x = x;
        this.y = y;
    }
    
    /**
     * Returns onGoal Image
     * @return 
     */
    public Image getImg() {
        return image;
    }
    
    /**
     * getter for X coordinate
     * returns x
     * @return 
     */
    public int getX() {
        return x;
    }
    
    
    /**
     * Getter for Y Co ordinate
     * return y
     * @return 
     */
    public int getY() {
        return y;
    }
}
