package academy.DevWebber.letsgojava.introducao;

public class Aula04Operadores {
    static void main(String[] args) {
        // addition +, subtraction -, division /, multiplication *
        int number01 = 10;
        double number02 = 20;
        double result = number01 / number02;
        System.out.println(result);

        //remainder %
        int remainder = 21 % 7;
        System.out.println(remainder);

        //relational operators >, <, ==, <=, >=, !=
        int ten = 10;
        int twenty = 20;
        boolean isDezMaiorQueVinte = ten > twenty;
        boolean isDezMenorQueVinte = ten < twenty;
        boolean isDezIgualAVinte = ten == twenty;
        boolean isDezIgualADez = ten == ten;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte " + isDezIgualAVinte);
        System.out.println("isDezIgualADez " + isDezIgualADez);

        // and &&, or ||, not !
        int age = 35;
        float salary = 3508F;
        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && salary >= 3381;
        boolean isNoSense = age > 30 && salary <= 4000;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);
        System.out.println(isNoSense);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5800F;
        boolean isPlaystationCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCompravel " + isPlaystationCompravel);

        // =, +=, -=, *=, /=, %=
        double bonus = 1800; //1800
        bonus += 1000;       //2800
        bonus -= 100;        //2700
        bonus *= 2;          //5400
        bonus /= 3;          //1800
        bonus %= 2;          //0
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);
        //por ++ ou qualquer desses sinais duplos depois da variavel faz com que o sistema faça o calculo depois de imprimilo
        int contador3 = 0;
        System.out.println(++contador3);
        System.out.println(contador3);
        //por ++ ou qualquer desses sinais duplos antes da variavel faz com que o sistema faça o calculo antes de imprimilo

    }
}
