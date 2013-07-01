package graphicstutorial;

import java.util.Timer;
import java.util.TimerTask;

public class BackGround extends TimerTask {
    
    private Timer MoveBGTimer = new Timer();
    private static int BackGroundCoordinate_X = 0;
      
    public void run() {
        BackGroundCoordinate_X--;
        System.out.println(BackGroundCoordinate_X);
        MoveBGTimer.schedule(new BackGround(), 10);
    }
    
    public int get_Background_X() {
        return BackGroundCoordinate_X;
    }
}
