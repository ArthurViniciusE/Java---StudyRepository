package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Kimmich");
        Jogador j2 = new Jogador("Muller");
        Jogador j3 = new Jogador("Neuer");
        Jogador[] jogadores = {j1,j2,j3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
