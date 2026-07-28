package academy.DevWebber.letsgojava.javacore.Aintroduçãoclasses.test;

import academy.DevWebber.letsgojava.javacore.Aintroduçãoclasses.dominio.Estudante;

public class EstudanteTest01 {
    static void main() {
        Estudante estudante = new Estudante();/*Aqui é criada a variavel de referencia para a classe estudante*/
        estudante.nome = "Rafael";
        estudante.idade = 22;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
