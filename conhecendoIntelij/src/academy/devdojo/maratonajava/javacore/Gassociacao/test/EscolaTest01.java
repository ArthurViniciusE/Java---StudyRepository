package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor p1 = new Professor("Kame");
        Professor[] p2 = {p1};
        Escola e1 = new Escola("KameHouse", p2);

        e1.imprime();
    }
}
