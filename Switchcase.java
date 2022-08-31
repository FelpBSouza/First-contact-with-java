public class Switchcase {
    public static void main(String[] args) {
        //Switch e case
        int vida = 90;
        switch(vida){
            case 90:
            //Executa alguma ação aq!
            System.out.println("Quero que meu personagem corra mais rapido!");
            break;

            case 30:
            System.out.println("Minha vida eh igual a 30!");
            break;
            default:
            System.out.println("Nenhuma condição bateu!Eu tenho 100 de vida!");
            break;
        }
}
}