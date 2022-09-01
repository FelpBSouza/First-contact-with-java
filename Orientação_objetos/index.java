package Orientação_objetos;

public class index {
    public static void main(String[] args) {
        //eu criei classes e introduzi em uma main
        player player = new player();
        player.iniciarJogador();
        enemy enemy = new enemy();
        enemy.iniciarInimigo();   
    } 
}
