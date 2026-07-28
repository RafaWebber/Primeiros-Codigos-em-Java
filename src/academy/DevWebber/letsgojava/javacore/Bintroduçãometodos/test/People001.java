package academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.test;

import academy.DevWebber.letsgojava.javacore.Bintroduçãometodos.dominio.People;

public class People001 {
    static void main() {
        People people = new People();
        people.setName("Jiraya");
        //people.age = 70;
        people.setAge(70);
        //people.imprimi();

        System.out.println(people.getName());
        System.out.println(people.getAge());
    }
}
