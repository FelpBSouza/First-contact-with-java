package programa_leitura;
import java.util.Scanner;


public class Programaleitura {
public static void main(String[] args) {

    Scanner in= new Scanner(System.in);
    String nome,idade,peso,cidade,estado,pais;
    System.out.println("Por Favor digite o seu nome:");
    nome = in.nextLine();

    System.out.println("Por Favor digite a sua idade:");
    idade = in.nextLine();

    System.out.println("Por Favor digite o seu peso:");
    peso = in.nextLine();

    System.out.println("Por Favor digite a sua cidade:");
    cidade = in.nextLine();

    System.out.println("Por Favor digite o seu estado:");
    estado = in.nextLine();

    System.out.println("Por Favor digite o seu pais:");
    pais = in.nextLine();
    //Gerar o resultado final
            System.out.println("Aqui esta o resultado final:");
            System.out.println("Nome:" +nome);
            System.out.println("Idade:" +idade);
            System.out.println("Peso:" +peso);
            System.out.println("Cidade:" +cidade);
            System.out.println("Estado:" +estado);
            System.out.println("Pais:" +pais);

}

}
