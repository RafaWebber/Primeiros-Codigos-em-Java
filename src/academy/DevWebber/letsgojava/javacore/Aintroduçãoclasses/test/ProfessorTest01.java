package academy.DevWebber.letsgojava.javacore.Aintroduçãoclasses.test;

import academy.DevWebber.letsgojava.javacore.Aintroduçãoclasses.dominio.Professor;

public class ProfessorTest01 {
    static void main() {
        Professor professor = new Professor();
        professor.nome = "Bryan";
        professor.idade = 28;
        professor.sexo = 'M';

        System.out.println("Nome: "+professor.nome + " | Idade: " + professor.idade + " | Sexo: " + professor.sexo);
    }
}
