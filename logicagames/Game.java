package logicagames;

public class Game implements Runnable{

    private boolean isRunning;
    private Thread thread;

    public static void main(String[] args) {

        Game game = new Game();
        game.start();
        
    }

    public synchronized void start(){
        isRunning = true;
        thread = new Thread(this);
        thread.start();


    }

            public void tick(){
                //atualizar o jogo
                System.out.println("Tick");

            }

            public void render(){
                //renderizar o jogo
                System.out.println("Render");
                
            }

        @Override
        public void run() {
            

            while(isRunning){
                tick();
                render();

              /*limita o fps em 60 maneira mais facilde fazer  try {
                    Thread.sleep(1000/60);
                 } 
            catch (InterruptedException e) {
                e.printStackTrace(); }*/ 
            
            
        }
        
}}
