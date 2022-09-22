package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Mustang", 310);
        Carro c3 = new Carro("Porsche",290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }

}
