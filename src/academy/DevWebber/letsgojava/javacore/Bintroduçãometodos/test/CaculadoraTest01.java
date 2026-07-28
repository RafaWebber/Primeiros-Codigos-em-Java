package academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.test;

import academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.dominio.Calculadora;

public class CaculadoraTest01 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Caculadora Test01");
        calculadora.subtraiaDoisNumeros();
    }
}
