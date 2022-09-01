public class Operaçõesmatematicas {

    public static void main(String[] args) {

        //Op Matematicas
        int vida_1 = 100;
        int vida_2 = 200;
        int vida_3 = 300;
        int vida_final = vida_1 + vida_2 + vida_3;

        int vida_final2 = ((vida_1 + vida_2)/2) *2;
        System.out.println(vida_final2);

        //operadores
        String nome_jogador = "Jane";
        int skill = 100;
        /* 
        if ((nome_jogador == "Jane" && skill == 100) && skill <= 90){
            //podemos executar esse codigo
            System.out.println("Verdade");
        }else{
            System.out.println("Falso");
        }
        */

        if(nome_jogador == "Jane" || nome_jogador =="Felipe"){
            System.out.println("Comece o jogo!");
        }



        
}
}
    
