package academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.test;

import academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.dominio.ExercFuncionario;

import java.text.DecimalFormat;

public class ExercMediaSalario {
    static void main() {
        DecimalFormat df = new DecimalFormat("0.00");
        ExercFuncionario exercFuncionario1 = new ExercFuncionario();
        ExercFuncionario exercFuncionario2 = new ExercFuncionario();
        ExercFuncionario exercFuncionario3 = new ExercFuncionario();
        double media=4;


        System.out.println("A media salario dos três funcionario é: "+df.format(media));

    }
}
