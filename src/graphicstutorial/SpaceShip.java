package graphicstutorial;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class SpaceShip {
    private int CoordinateOfShip_X;
    private int CoordinateOfShip_Y;
    private int Changed_CoordinateOfShip_X;
    private int Changed_CoordinateOfShip_Y;
    protected int CoordinateOfBG_X;
    protected int Changed_CoordinateOfBG_X;
    
    private Image ImageOfShip;
    private String ShipPathToIcon = "pic\\drash2.gif";
    private static ArrayList LaserCharges;
    
    public SpaceShip() {
        ImageIcon ShipIcon = new ImageIcon(this.getClass().getResource(ShipPathToIcon));
        ImageOfShip = ShipIcon.getImage();   
        CoordinateOfShip_X = 40;
        CoordinateOfShip_Y = 280;
        LaserCharges = new ArrayList();
      //CoordinateOfBG_X = 0;
      //Changed_CoordinateOfBG_X = 685;
    }
    
    public static ArrayList getBullets() {
        return LaserCharges;
    }
    
    public void move_ship_left() {
        CoordinateOfShip_X = CoordinateOfShip_X - 3;
      //Changed_CoordinateOfBG_X = Changed_CoordinateOfBG_X - 2;
      //CoordinateOfBG_X = CoordinateOfBG_X - 2;
    }
    
    public void move_ship_right() {
        CoordinateOfShip_X = CoordinateOfShip_X + 3;
        //Changed_CoordinateOfBG_X = Changed_CoordinateOfBG_X + 2;
        //CoordinateOfBG_X = CoordinateOfBG_X + 2;
    }
    
    public void move_ship_up() {
        CoordinateOfShip_Y = CoordinateOfShip_Y - 3;
    }
    
    public void move_ship_down() {
        CoordinateOfShip_Y = CoordinateOfShip_Y + 3;
    }
    
    public int get_CoordinateOfShip_X() {
        return CoordinateOfShip_X;
    }
    public int get_CoordinateOfShip_Y() {
        return CoordinateOfShip_Y;
    }
    
    public void makeAFire() {
        LaserShot ShipLaserWeapon = new LaserShot((CoordinateOfShip_X + 60), (CoordinateOfShip_Y + (56 / 2)));
        LaserCharges.add(ShipLaserWeapon);
    }
    
  /*public int get_CoordinateOfBG_X() {
        return CoordinateOfBG_X;
    }*/
    
  /*public int get_ChangedCoordinateOfBG_X() {
        return Changed_CoordinateOfBG_X;
    }*/
    
    public Image getShipImage() {
        return ImageOfShip;
    }
    
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_LEFT) {
            move_ship_left();
        } else if (key == KeyEvent.VK_RIGHT) {
            move_ship_right();
        } else if (key == KeyEvent.VK_UP) {
            move_ship_up();
        } else if (key == KeyEvent.VK_DOWN) {
            move_ship_down();
        } 
        
        if (key == KeyEvent.VK_SPACE) {
            makeAFire();
        }
    }     
}

