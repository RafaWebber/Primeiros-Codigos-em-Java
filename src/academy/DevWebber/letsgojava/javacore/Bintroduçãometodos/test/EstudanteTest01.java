package academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.test;

import academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.dominio.Estudante;
import academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    static void main() {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome="Pietro";
        estudante01.idade=27;
        estudante01.sexo='M';

        estudante02.nome="Talita";
        estudante02.idade=32;
        estudante02.sexo='F';

        impressoraEstudante.imprime(estudante01);

        impressoraEstudante.imprime(estudante02);

        System.out.println("##############");

        impressoraEstudante.imprime(estudante01);

        impressoraEstudante.imprime(estudante02);


    }
}
