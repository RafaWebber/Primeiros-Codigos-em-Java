package academy.DevWebber.letsgojava.introducao;

public class Aula05EstruturasCondicionais {
    static void main(String[] args) {
        int age = 17;
        boolean isMaiorDeIdade = age >= 18;
        if (isMaiorDeIdade) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        if (!isMaiorDeIdade) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        System.out.println("------NEW EXAMPLE------");

        int age2 = 67;
        if (age2 < 15) {
            System.out.println("Categoria Infantil");
        } else if (age2 >=15 && age2 < 18) {
            System.out.println("Categoria juvenil");
        } else {
            System.out.println("Categoria adulto");
        }
        System.out.println("------NEW EXAMPLE, BUT MORE CLEAN------");

        int age3 = 13;
        String faixetaria;
        if (age3 < 15) {
            faixetaria = "Categoria Infantil";
        } else if (age3 >=15 && age3 < 18) {
            faixetaria = "Categoria juvenil";
        } else {
            faixetaria = "Categoria adulto";
        }
        System.out.println(faixetaria);
    }
}
