package revisao.gettersAndSetters;

public class Obj {
    static void main() {
        ClassCar classCar = new ClassCar();

        classCar.cor="Verde";
        classCar.placa="Ar987Y6";
        classCar.acelerar();
        classCar.frear();
        System.out.println("Cor do Carro: " + classCar.cor + "\n Placa: " + classCar.placa);
    }
}
