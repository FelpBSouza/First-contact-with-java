import java.util.Random;
import java.util.Scanner;

public class numerosaleatorios {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nome;
        Random rand = new Random();
        

        System.out.println("Seja bem vindo ao jogo! Insira seu nome:");
        nome = in.nextLine();
        System.out.println("Seja muito bem-vindo(a):" +nome);
        System.out.println("Voce deseja avançar para qual direção?(w,a,s,d)");
        String comando = in.nextLine();

        if(comando.equals ("w") ){
            System.out.println("Voce esta indo para a frente!");
            System.out.println("Um inimigo surgiu,o que deseja fazer?(a=atacar,c=correr)");
            comando = in.nextLine();
            if(comando.equals("a")){
                if(rand.nextInt(100) < 75){
                    System.out.println("Voce ganhou o jogo!");
                }else{
                    System.out.println("Voce perdeu o jogo!");
                }

            }else{
                System.out.println("Voce correu! O jogo terminou!");
            }
        }





    }

}
