package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio;

public class Anime {
    public String nome;
    public static int[] episodios;

    static {
        System.out.println("Bloco de inicializaçãp");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
