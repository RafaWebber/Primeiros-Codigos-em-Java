package academy.DevWebber.letsgojava.introducao;

public class Aula07Arrays01 {
    static void main(String[] args){
        int[] ages = new int[3];
        ages[0] = 21;
        ages[1] = 17;
        ages[2] = 24;
        System.out.println(ages[2]);

        String[] names = new String[4];
        names[0] = "Namikaze";
        names[1] = "Kurosaki";
        names[2] = "Kageyama";
        names[3] = "Satoru";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
