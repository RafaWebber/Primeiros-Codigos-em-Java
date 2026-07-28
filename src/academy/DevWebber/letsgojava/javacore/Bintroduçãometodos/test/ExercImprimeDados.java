package academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.test;

import academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.dominio.ExercFuncionario;


public class ExercImprimeDados {
    static void main() {
        ExercFuncionario exercFuncionario1 = new ExercFuncionario();

        exercFuncionario1.setNome("Ronaldo Fenômeno");
        exercFuncionario1.setSalarios(new double[]{2598.44, 3950.97, 2987.03});
        exercFuncionario1.setIdade(23);
        exercFuncionario1.imprimi();
        System.out.println("Media "+exercFuncionario1.getMedia());

    }
}
