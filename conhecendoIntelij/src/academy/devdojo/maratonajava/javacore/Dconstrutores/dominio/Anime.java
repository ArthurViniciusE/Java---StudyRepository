package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private  String estudio;

    public Anime(String nome, String tipo,String genero, int episodios){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios = episodios;
    }

    public Anime(String nome, String tipo,String genero, int episodios, String estudio){
        this(nome, tipo, genero, episodios);
        this.estudio = estudio;
    }
    public  Anime(){
        System.out.println("segundo construct");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.estudio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

}
