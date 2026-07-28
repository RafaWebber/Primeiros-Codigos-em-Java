package academy.DevWebber.letsgojava.introducao;

public class Aula05EstruturasCondicionais02 { // operador termário
    static void main(String[] args) {
        double salary = 4000;
        String mensagemDoar = "Eu vou doar 500 reais para o DevDojo";
        String mensagemNaoDoar = "Ainda não tenho codições";
        String resultado = salary > 5000 ? mensagemDoar : mensagemNaoDoar;
        //(Declara a variável) =  (condição)   ? (verdadeiro) :     (falso)    ;
        System.out.println(resultado);
        System.out.println("\n|------------| Exercises |------------|\n");

        double salaryInTheNetherlands = 70578;
        double smallTaxAmount = salaryInTheNetherlands * 0.097;
        double mediumTaxAmount = salaryInTheNetherlands * 0.3735;
        double largeTaxAmount = salaryInTheNetherlands * 0.495;

        if (salaryInTheNetherlands >= 0 && salaryInTheNetherlands <= 34712) {
            System.out.println("O seu salário anul será taxado em 9.70%, ou seja, pagará " + smallTaxAmount + " euro");
        } else if (salaryInTheNetherlands >= 34713 && salaryInTheNetherlands <= 68507) {
            System.out.println("O seu salário anul será taxado em 37.35%, ou seja, pagará " + mediumTaxAmount + " euro");
        } else if (salaryInTheNetherlands >= 68508) {
            System.out.println("O seu salário anul será taxado em 49.50%, ou seja, pagará " + largeTaxAmount + " euro");
        } else {
            System.out.println("Erro!!!........");
        }
    }
}
