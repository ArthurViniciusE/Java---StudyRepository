package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecla02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Future prevision");
        System.out.println("Ask me a question!");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else {
            System.out.println("NÃO");
        }
    }
}
