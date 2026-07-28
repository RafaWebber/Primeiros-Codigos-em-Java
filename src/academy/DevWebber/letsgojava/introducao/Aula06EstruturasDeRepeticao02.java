package academy.DevWebber.letsgojava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    static void main(String[] args) {
        for (int i=1;i<=1000;i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        //imprima os 25 numeros de um dado valor, por exemplo, 50
        int valorMax = 50;
        for (int j = 0; j <= valorMax; j++) {
            if (j > 26){
                break;
            }
            System.out.printf("\nj = "+j);
        }
    }
}
