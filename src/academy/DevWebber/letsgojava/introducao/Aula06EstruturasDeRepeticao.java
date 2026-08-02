package academy.DevWebber.letsgojava.introducao;

public class Aula06EstruturasDeRepeticao {
    static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10){
            System.out.println(++count);
        }
        int countTwo = 0;
        while (countTwo < 10){
            System.out.println(countTwo++);
        }

        int two = 7;
        do {
            System.out.println("Dentro de do-while " + two);
            two++;
        }while(two<10);

        for (int i=0;i<10;i++){
            System.out.println("For"+i);
        }
    }
}
