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
import java.util.TimerTask;
import java.util.*;
import javax.swing.Timer;

public class GameField extends JPanel implements ActionListener{
    
    SpaceShip SpaceShip;
    private Image ImageOfSpace;
    private String ShipPathToIcon = "pic\\space_cr.gif";
    private Timer GameTime;
    private BackGround BackGround;
    private java.util.Timer BGTimer = new java.util.Timer();
    
    
    public GameField () {
        SpaceShip = new SpaceShip();
        BackGround = new BackGround();
        addKeyListener(new AL());
        setFocusable(true);
        ImageIcon BGPicture = new ImageIcon(this.getClass().getResource(ShipPathToIcon));
        
        ImageOfSpace = BGPicture.getImage();
        GameTime = new Timer(5, this);    
        GameTime.start();
    }
    
    public void  actionPerformed(ActionEvent e) {
        
        ArrayList bullets = SpaceShip.getBullets();
        for (int counter = 0; counter < bullets.size(); counter++) {
            LaserShot LS = (LaserShot)bullets.get(counter);
            if (LS.getVisible() == true) {
                LS.BulletMovement();    
            } else {
                bullets.remove(counter);
            }
            
        }

        SpaceShip.move_ship_left();
        SpaceShip.move_ship_right();
        
        repaint();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        
        /*if (SpaceShip.get_CoordinateOfShip_X() == 590) {
            SpaceShip.CoordinateOfBG_X = 0;
        }
        if (SpaceShip.get_CoordinateOfShip_X() == 1790) {
            SpaceShip.Changed_CoordinateOfBG_X = 0;
        }*/
        
        g2.drawImage(ImageOfSpace, BackGround.get_Background_X(), 0, null);
        
        if (BackGround.get_Background_X() <  0) {
            g2.drawImage(ImageOfSpace, 800 + BackGround.get_Background_X(), 0, null); 
        }
        
        g2.drawImage(SpaceShip.getShipImage(), SpaceShip.get_CoordinateOfShip_X(), SpaceShip.get_CoordinateOfShip_Y(), null);
        
        ArrayList bullets = SpaceShip.getBullets();
        for (int counter = 0; counter < bullets.size(); counter++) {
            LaserShot LS = (LaserShot)bullets.get(counter);
            g2.drawImage(LS.getBulletImage(), LS.getBulletX(), LS.getBulletY(), null);
            System.out.println(LS.getBulletX());
            System.out.println(LS.getBulletY());
        }
    }
    
    private class AL extends KeyAdapter {
        
        public void keyPressed(KeyEvent e) {
            SpaceShip.keyPressed(e);
        }
        
    }
    
}
