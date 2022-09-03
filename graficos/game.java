package graficos;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class game extends Canvas implements Runnable{

    public static JFrame frame;
    private Thread thread;
    private boolean isRunning = true;
    private final int WIDTH = 160;
    private final int HEIGHT = 120;
    private final int SCALE = 3;

    public game(){
        setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
        initFrame();

    }
    public void initFrame(){

        frame = new JFrame("Game Teste");
        frame.add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    public synchronized void start(){
        thread = new Thread(this);
        isRunning = true;
        thread.start();
    }

    public synchronized void stop(){
    }


   public static void main(String[] args) {

    game game = new game();
    game.start();
    }

        public void tick(){//cuida da logica do jogo


        }

        public void render(){//cuida dos graficos do jogo
            
        }

    public void run() {
        long lastTime = System.nanoTime();//system pega o tempo atual do meu computador,uso para ter preci
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        int frames = 0;
        double timer = System.currentTimeMillis();

        while(isRunning){
            Long now =System.nanoTime();
            lastTime = now;
            
            delta+= (now - lastTime) / ns;

            if(delta >=1){
                tick();
                render();
                frames ++;
                delta --;
            }
            
            
            if(System.currentTimeMillis() - timer >= 1000){
                System.out.println("FPS:" + frames);
                frames = 0;
                timer +=1000 ;//ou posso fazer timer +=1000
            }
            
        }

    }
}