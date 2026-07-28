package academy.DevWebber.letsgojava.javacore.Aintroduçãoclasses.test;

import academy.DevWebber.letsgojava.javacore.Aintroduçãoclasses.dominio.ExercicioCarro;

public class ExercicioCarroTes01 {
    static void main() {
        ExercicioCarro exercicioCarro1 = new ExercicioCarro();
        ExercicioCarro exercicioCarro2 = new ExercicioCarro();

            exercicioCarro1.nome="Honda Civic";
            exercicioCarro1.modelo="LXR";
            exercicioCarro1.ano=2015;

            exercicioCarro2.nome="Toyota Corolla";
            exercicioCarro2.modelo="XEi";
            exercicioCarro2.ano=2012;

            //exercicioCarro2 = exercicioCarro1;

        System.out.println("Nome: "+exercicioCarro1.nome+" | Modelo: "+exercicioCarro1.modelo+" | Ano de fabricação: "+exercicioCarro1.ano);
        System.out.println("Nome: "+exercicioCarro2.nome+" | Modelo: "+exercicioCarro2.modelo+" | Ano de fabricação: "+exercicioCarro2.ano);
    }
}
