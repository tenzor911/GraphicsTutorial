package graphicstutorial;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameSounds extends Applet implements Runnable, KeyListener {

    private AudioClip sound1;
    
    public void ShotSound() {
        sound1 = getAudioClip(getCodeBase(), "snd\\laser1.wav");
        addKeyListener(this);
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
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
