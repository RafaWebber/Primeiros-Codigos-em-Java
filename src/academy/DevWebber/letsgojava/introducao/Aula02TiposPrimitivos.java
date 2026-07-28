package academy.DevWebber.letsgojava.introducao;

import java.math.BigDecimal;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //Primitivos = int, float, double,char, byte, short, long, boolean
        int age = 10;
        long largeNumber = 10000;
        double salaryDouble = 2000.7D;
        float salaryFloat = 2500.8F;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean green = true;
        boolean red = false;
        char character = 65;

        String name = "Rafael";

        System.out.println("He is " + age + " years old");
        System.out.println(green);
        System.out.println("char " + character);
        System.out.println("Hello, my name is " + name);
    }
}
