package academy.DevWebber.letsgojava.introducao;

public class Aula05EstruturasCondicionaisSwitch02 {
    static void main(String[] args) {
        int dia = 5;
        int diaSimply = 7;

        switch (dia) {
            case 1:
                System.out.println("Domingo não é um dia útil");
                break;
            case 2:
                System.out.println("Segunda  é um dia útil");
                break;
            case 3:
                System.out.println("Terça  é um dia útil");
                break;
            case 4:
                System.out.println("Quarta  é um dia útil");
                break;
            case 5:
                System.out.println("Quinta  é um dia útil");
                break;
            case 6:
                System.out.println("Sexta  é um dia útil");
                break;
            case 7:
                System.out.println("Sábado não é um dia útil");
                break;
            default:
                System.out.println("Não é um dia da semana");
        }

        switch (diaSimply) {
            case 1:
            case 7:
                System.out.println("Não é um dia útil");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É um dia útil");
                break;
            default:
                System.out.println("Não é um dia da semana");
        }
    }
}
