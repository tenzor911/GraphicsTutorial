package graphicstutorial;

import java.awt.Image;
import javax.swing.ImageIcon;

public class LaserShot {
    
    private int BulletCoordinateX;
    private int BulletCoordinateY;
    
    private boolean BulletIsVisible = true;
    
    private Image BulletImage;
    private String BulletPathToIcon = "C:\\Users\\tenzor\\Documents\\NetBeansProjects\\GraphicsTutorial\\src\\graphicstutorial\\bullet_laser.gif";
    
    public LaserShot (int StartBulletPositionX, int StartBulletPositionY) {
        BulletCoordinateX = StartBulletPositionX;
        BulletCoordinateY = StartBulletPositionY;
        ImageIcon DrawnBullet = new ImageIcon(BulletPathToIcon);
        BulletImage = DrawnBullet.getImage();
        BulletIsVisible = true;
    }
    
    public void BulletMovement() {
        
        BulletCoordinateX = BulletCoordinateX + 2;
        if (BulletCoordinateX > 800) {
            BulletIsVisible = false;
        }
        
    }
    
    public int getBulletX() {
        return BulletCoordinateX;
    }
    
    public int getBulletY() {
        return BulletCoordinateY;
    }
    
    public boolean getVisible() {
        return BulletIsVisible;
    }
    
    public Image getBulletImage() {
        return BulletImage;
    }
}
