package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Hagen");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1500, 2300, 3500});
        funcionario.imprime();
        System.out.println("Média "+ funcionario.getMedia());
    }
}
