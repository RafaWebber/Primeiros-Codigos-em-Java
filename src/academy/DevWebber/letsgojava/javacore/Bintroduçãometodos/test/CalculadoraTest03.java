package academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.test;

import academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result); //or
        System.out.println(calculadora.divideDoisNumeros02(20, 0));
        System.out.println("----------\n");
        calculadora.imprimiDivisãoDeDoisNumeros(78, 0);
    }
}
