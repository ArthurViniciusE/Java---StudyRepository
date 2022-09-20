package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {2, 4, 5};
        calculadora.somaArray(numeros);
        System.out.println("----------");
        calculadora.somaVarArgs(3,5,34);
    }
}
