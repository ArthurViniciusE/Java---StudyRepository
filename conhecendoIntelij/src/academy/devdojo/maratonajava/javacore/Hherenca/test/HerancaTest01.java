package academy.devdojo.maratonajava.javacore.Hherenca.test;

import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherenca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua AA");
        endereco.setCep("53440242");
        Pessoa pessoa = new Pessoa("Hiruzen");
        pessoa.setCpf("12345678900");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario f1 = new Funcionario("Atreus");
        f1.setCpf("232345423422");
        f1.setEndereco(endereco);
        f1.setSalario(6500);

        f1.imprime();
    }
}
