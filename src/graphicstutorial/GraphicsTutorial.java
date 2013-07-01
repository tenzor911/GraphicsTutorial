
package graphicstutorial;

import javax.swing.JFrame;

public class GraphicsTutorial {

    public static void main(String[] args) {
        
        BackGround BG = new BackGround();
        BG.run();
        
        JFrame MainFrame = new JFrame();
        MainFrame.add(new GameField());
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setSize(800, 600);
        MainFrame.setVisible(true);
    }
}
