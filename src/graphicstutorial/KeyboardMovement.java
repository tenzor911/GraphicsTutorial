package graphicstutorial;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class KeyboardMovement extends JPanel implements ActionListener, KeyListener{
    private Timer MyTimer = new Timer(5, this);
    private int x = 0; 
    private int y = 0;
    private String ShipPathToIcon = "drash0.gif";
    private Image ShipImage;
    
    public KeyboardMovement() {
        MyTimer.start();
        addKeyListener(this);
        setFocusable(true);
        ImageIcon ShipIcon = new ImageIcon(this.getClass().getResource(ShipPathToIcon));
        ShipImage = ShipIcon.getImage();       
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(ShipImage,x,y,this);
        g2.fillRect(0, 200, 100, 4);
    }

    public void up() {
        y = y - 2;
        repaint();
    }
    
    public void down() {
        y = y + 2;
        repaint();
    }
    public void left() {
        x = x - 2;
        repaint();
    }
    public void right() {
        x = x + 2;
        repaint();
    }
    
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if( e.getKeyCode() == e.VK_UP ) {
               up();
        } else if( e.getKeyCode() == e.VK_DOWN ) {
            down();
        }
          else if( e.getKeyCode() == e.VK_LEFT) {
            left();
        }
          else if(e.getKeyCode() == e.VK_RIGHT) {
            right();
        }
    }

    public void actionPerformed(ActionEvent e) {}
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
}
