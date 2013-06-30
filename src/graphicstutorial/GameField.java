package graphicstutorial;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameField extends JPanel implements ActionListener{
    
    SpaceShip SpaceShip;
    private Image ImageOfSpace;
    private String ShipPathToIcon = "space_cr.gif";
    private Timer GameTime;
    
    public GameField () {
        SpaceShip = new SpaceShip();
        addKeyListener(new AL());
        setFocusable(true);
        ImageIcon BGPicture = new ImageIcon(this.getClass().getResource(ShipPathToIcon));
        ImageOfSpace = BGPicture.getImage();
        GameTime = new Timer(5, this);    
        GameTime.start();
    }
    
    public void  actionPerformed(ActionEvent e) {
        SpaceShip.move_ship_left();
        SpaceShip.move_ship_right();
        repaint();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        if (SpaceShip.get_CoordinateOfShip_X() == 590) {
            SpaceShip.CoordinateOfBG_X = 0;
        }
        if (SpaceShip.get_CoordinateOfShip_X() == 1790) {
            SpaceShip.Changed_CoordinateOfBG_X = 0;
        }
        
        g2.drawImage(ImageOfSpace, 685 - SpaceShip.get_CoordinateOfBG_X(), 0, null);
        
        if (SpaceShip.get_CoordinateOfShip_X() >= 90) {
            g2.drawImage(ImageOfSpace, 1000 - SpaceShip.get_ChangedCoordinateOfBG_X(), 0, null);
        }
        g2.drawImage(SpaceShip.getShipImage(), 100, SpaceShip.get_CoordinateOfShip_Y(), null);
    }
    
    private class AL extends KeyAdapter {
        
        
        public void keyPressed(KeyEvent e) {
            SpaceShip.keyPressed(e);
        }
        
    }
    
}
