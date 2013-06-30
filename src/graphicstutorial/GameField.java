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
        g2.drawImage(ImageOfSpace, 0, 0, null);
        g2.drawImage(SpaceShip.getShipImage(), SpaceShip.get_CoordinateOfShip_X(), SpaceShip.get_CoordinateOfShip_Y(), null);
    }
    
    private class AL extends KeyAdapter {
        
        
        public void keyPressed(KeyEvent e) {
            SpaceShip.keyPressed(e);
        }
        
    }
    
}
