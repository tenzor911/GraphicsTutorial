package graphicstutorial;

import java.applet.Applet;
import java.applet.AudioClip;

public class GameSounds extends Applet {
    
    private AudioClip soundLaserShot;
    
    public void ShotSound() {
        soundLaserShot = getAudioClip(getCodeBase(),  "C:\\Users\\tenzor\\Documents\\NetBeansProjects\\GraphicsTutorial\\src\\graphicstutorial\\snd\\laser1.wav");
        soundLaserShot.play();
    }
    
}
