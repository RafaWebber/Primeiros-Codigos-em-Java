package academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.test;

import academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.dominio.Estudante;

public class EstudanteTest02 {
    static void main() {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Pietro";
        estudante01.idade = 27;
        estudante01.sexo = 'M';

        estudante02.nome = "Talita";
        estudante02.idade = 32;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
