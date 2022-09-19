package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();


        estudante.nome = "Goku";
        estudante.idade = 43;
        estudante.sexo = 'M';

        estudante02.nome = "Zoro";
        estudante02.idade = 34;
        estudante02.sexo = 'M';

        impressora.imprime(estudante);
        impressora.imprime(estudante02);

    }
}
