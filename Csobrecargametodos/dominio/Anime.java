package Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String genero;
    private int eps;
    private int num_temps;
    private String estudio;


    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.eps);
        System.out.println(this.num_temps);
        System.out.println(this.estudio);
    }

    public Anime(String nome, String genero,int eps,int num_temps){
        this.nome = nome;
        this.genero = genero;
        this.eps = eps;
        this.num_temps = num_temps;
    }

    public Anime(String nome, String genero,int eps,int num_temps,String estudio){
        this(nome, genero, eps, num_temps);
        this.estudio = estudio;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setEps(int eps){
        this.eps = eps;
    }

    public int getEps(){
        return this.eps;
    }

    public void setNum_temps(int num_temps) {
        this.num_temps = num_temps;
    }

    public int getNum_temps() {
        return num_temps;
    }
}
