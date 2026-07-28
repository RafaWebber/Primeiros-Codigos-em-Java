package academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.dominio;

import java.text.DecimalFormat;

public class ExercFuncionario {
    DecimalFormat df = new DecimalFormat("0.00");
    private String nome;
    private double[] salarios;
    private int idade;
    private double media = 0;


    public void imprimi() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios != null) {
            for (double salario : salarios) {
                System.out.print(salario + " ");
            }
            imprimeMedia();
        }
    }

    public void imprimeMedia() {
        if (salarios == null){
            return;
        }
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\n\nMedia salarial: " + df.format(media));
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public int getIdade() {
        return idade;
    }

    public double getMedia() {
        return media;
    }
}
