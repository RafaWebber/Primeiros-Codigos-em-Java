package academy.DevWebber.letsgojava.introducao;

public class Aula08ArraysMultidimencionais {
    static void main() {
        //1,2,3,4,5 meses
        //31,28,31,30 dias
        int[][] days = new int[3][3];
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;

        days[1][0] = 30;
        days[1][1] = 31;
        days[1][2] = 30;

        days[2][0] = 31;
        days[2][1] = 30;
        days[2][2] = 31;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[0].length; j++) {
                System.out.println(days[i][j]);
            }
        }
        System.out.println("-----------------------");
        for (int[] arrBase : days) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
