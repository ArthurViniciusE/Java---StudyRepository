package academy.devdojo.maratonajava.javacore.Hherenca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public void  imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu "+ this.nome);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
