package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante.nome = "Goku";
        estudante.idade = 43;
        estudante.sexo = 'M';

        estudante02.nome = "Zoro";
        estudante02.idade = 34;
        estudante02.sexo = 'M';

        estudante.imprime();
        estudante02.imprime();
    }
}
