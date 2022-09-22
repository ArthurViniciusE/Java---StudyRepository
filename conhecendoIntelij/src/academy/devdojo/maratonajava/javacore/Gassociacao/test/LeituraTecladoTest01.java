package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Your name");
        String name = entrada.nextLine();

        System.out.println("Your Age");
        int age = entrada.nextInt();

        System.out.println("Your Gender");
        char gender = entrada.next().charAt(0);

        System.out.println("------------");
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Gender " + gender);
    }
}
