package academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.test;

import academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.dominio.Calculadora;

public class CaculadoraTest04 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro da CaculadoraTest04");
        System.out.println("Num1 "+a);
        System.out.println("Num2 "+b);
    }
}
