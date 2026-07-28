package academy.DevWebber.letsgojava.introducao;

public class Aula03Exercicios {
    public static void main(String[] args) {
        String name = "Rafael Webber";
        String date = "07/01/2026";
        String address = "Rua 13 de maio, 1262, bairro Centro, Garibaldi-RS";
        double salary = 2507.80;
        String completeAddress = ("Eu me chamo " + name + ", moro no endereço " + address + " e confirmo que recebi o salário de R$ " + salary + " no dia " + date + ".");
        System.out.println(completeAddress);
    }
}
