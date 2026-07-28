package academy.DevWebber.letsgojava.javacore.Csobrecargametodos.Domain;

public class Anime {
    private String name;
    private String tipo;
    private String genero;
    private int ep;


    public void init(String name, String tipo, int ep){
        this.name = name;
        this.tipo = tipo;
        this.ep = ep;
    }
    public void init(String name, String tipo, int ep, String genero){
        this.init(name, tipo, ep);
        this.genero = genero;
    }

    public void imprimi(){
        System.out.println(this.name);
        System.out.println(this.tipo);
        System.out.println(this.ep);
        System.out.println(this.genero);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setEp(int ep){
        this.ep = ep;
    }
    public int getEp(){
        return this.ep;
    }

    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
