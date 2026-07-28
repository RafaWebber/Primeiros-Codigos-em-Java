package academy.DevWebber.letsgojava.introducao;

import java.lang.classfile.instruction.SwitchCase;
import java.lang.runtime.SwitchBootstraps;

public class Aula05EstruturasCondicionaisSwitch {
    static void main(String[] args) {
        //Tipos de dados que o switch suporta:
        // Byte, short, char, int, string, enum.
        byte dia = 7;

        switch (dia){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("This number in not related to a day of the week");
                break;
        }
    }
}
