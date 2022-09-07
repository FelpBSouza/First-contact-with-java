package graficos;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

import javax.swing.JFrame;


public class game extends Canvas implements Runnable{
	

	public static JFrame frame;
	private Thread thread;
	private boolean isRunning = true;
	private final int WIDTH = 240;
	private final int HEIGHT = 160;
	private final int SCALE = 4;

    private BufferedImage image;

	private Spritesheet sheet;
	private BufferedImage [] player;
	/*private int x = 0;*/
	private int frames = 0;
	private int maxFrames = 20;
	private int curAnimation = 0, maxAnimation = 2;

	
	public game() {
		sheet = new Spritesheet ("/res/21.png");
		player = new BufferedImage[2];
		player[0] = sheet.getSprite(0, 0, 100, 160);
		player[1] = sheet.getSprite(16, 0, 16, 16);

		setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		initFrame();
        image = new BufferedImage( WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
		}
	
	public void initFrame(){
		frame = new JFrame("Jogo");
		frame.add(this);
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public synchronized void start() {
		thread = new Thread(this);
		isRunning = true;
		thread.start();
		
	}
	
	public synchronized void stop() {

        isRunning = false;

        try{

            thread.join();

        }

        catch(InterruptedException e){
            e.printStackTrace();
        }
        
		
	}
		
	public static void main(String[] args ){
		game game = new game();
		game.start();
		
	}
	
	public void tick() {
		frames++;
		/*x++;*/

		if(frames > maxFrames){
			frames = 0;
			curAnimation++;
			
			if(curAnimation >= maxAnimation){

				curAnimation = 0;



			}
		}









	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = image.getGraphics();
		g.setColor(new Color(255,0,0));
		g.fillRect(0, 0,WIDTH,HEIGHT);


		/*Renderização do jogo */

		Graphics2D g2 = (Graphics2D) g; //cast
		g2.setColor(new Color(0,0,0,100));
		g2.fillRect(0, 0,WIDTH,HEIGHT);
		
		g2.drawImage(player[curAnimation],20,20,null);



		/* */

		g.dispose();/*limpar dados da imagem */
        g = bs.getDrawGraphics();
        g.drawImage(image, 0,0,WIDTH*SCALE,HEIGHT*SCALE,null);
		bs.show();
		
		
	}

	public void run() {
		long LastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		int frames = 0;
		double timer = System.currentTimeMillis();
		
		while(isRunning) {
			long now = System.nanoTime();
			delta += (now - LastTime)/ns;
			LastTime = now;
			
			if (delta >= 1) {
				tick();
				render();
				frames++;
				delta--;
				
			}
			
			if(System.currentTimeMillis() - timer >=1000) {
				System.out.println("FPS:" +frames);
				frames = 0;
				timer = System.currentTimeMillis();
			}
			
		}

        stop();
		
		
	}

}