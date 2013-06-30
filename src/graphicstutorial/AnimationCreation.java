package graphicstutorial;

import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class AnimationCreation extends JPanel implements ActionListener, KeyListener{
    private Timer animator;
    private ImageIcon imageArray[];
    private int delay = 20, totalFrames = 3, currentFrame = 0;

    public AnimationCreation() {
        imageArray = new ImageIcon[totalFrames];
        for (int counter = 0; counter < imageArray.length; counter++) {
            imageArray[counter] = new
ImageIcon("C:\\Users\\tenzor\\Documents\\NetBeansProjects\\GraphicsTutorial\\src\\graphicstutorial\\drash" +counter + ".gif");
        }
        animator = new Timer(delay,this);
        animator.start();
        addKeyListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (currentFrame >= imageArray.length) {
            currentFrame = 0;
        }
        currentFrame++;
        try {
            imageArray[currentFrame].paintIcon(this, g, 0, 0);
        }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception thrown  :" + e);
        }
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    
   

    @Override
    public void keyTyped(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            System.out.println("sdfsd");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}