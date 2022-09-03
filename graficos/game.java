package graficos;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class game extends Canvas implements Runnable{

    public static JFrame frame;
    private final int WIDTH = 160;
    private final int HEIGHT = 120;
    private final int SCALE = 3;


    public game(){
        this.setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        frame = new JFrame("Game Teste");
        frame.add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    
   public static void main(String[] args) {

    game game = new game();

    }

    @Override
    public void run() {
        
        
    }
    
}
